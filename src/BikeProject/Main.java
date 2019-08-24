package BikeProject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bike bike1 = new Bike(1);
        Bike bike2 = new Bike(2);
        Station station1 = new Station();
        User jeff = new User("Jeff", 79);
        station1.addBike(bike1);
        ArrayList<Bike> inv = station1.getInventory();
        int num = inv.get(0).getBikeID();
        System.out.println(num);

    }
}
