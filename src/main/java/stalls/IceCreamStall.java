package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class IceCreamStall extends Stall implements IReviewed {

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }


    @Override
    public int getRating() {
        return 0;
    }
}
