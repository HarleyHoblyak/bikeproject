package BikeProject;

import java.util.ArrayList;

public class Station {

    private ArrayList<Bike> inventory = new ArrayList<>();

    public Station() {

    }

    public void addBike(Bike bike){
        //add bike to inventory
        inventory.add(bike);

    }

    public void removeBike(Bike bike){
        //check if bike is in inventory, remove bike
        inventory.remove(bike);
    }

    public ArrayList<Bike> getInventory() {
        return inventory;
    }
}
