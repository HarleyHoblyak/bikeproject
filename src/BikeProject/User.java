package BikeProject;

import jdk.jfr.Timespan;
import jdk.jfr.Timestamp;

public class User {
    private String name;
    private int user_id;
    private Timespan timeUsed;
    private Timestamp startTime;
    private Timestamp endTime;
//    private signin;
    private Bike bike;

    public User(String name, int user_id) {
        this.name = name;
        this.user_id = user_id;
    }

    public void rentBike(Bike bike, Station station){
        //if bike is at station:
        this.bike = bike;
        //initialize startTime


    }
    public void dropOffBike(Bike bike, Station station){
        //add bike to station inventory
        this.bike = null;
        //initialize endTime
    }

    public String getName() {
        return name;
    }

    public int getUser_id() {
        return user_id;
    }

   // public Timespan getTimeUsed() {
        //return endTime - startTime

    //}

    public Bike getBike() {
        return bike;
    }
}
