package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }


    @Override
    public double defaultPrice() {
        return 4.45;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 4.50;
    }


    public double chargeHalfPrice(Visitor visitor){
        if(visitor.getAge() < 12){
            return priceFor(visitor)/2;
        }

        return priceFor(visitor);
    }

}
