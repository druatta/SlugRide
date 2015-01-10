package User;

import java.util.HashMap;

/**
 * Created by Daniel and Cris on 1/9/2015.
 */
public class User {
    private String fullName;
    private String make;
    private String model;
    private boolean driver;
    private int minute;
    private int hour;
    //TBD: Current location
    //TBD: Route
    private int seats;
    private String[] reviews;
    //TBD: payment method
    private boolean driving;
    private String address;
    private boolean toCampus;
    private int phone;

    public User(String fullName) {
        this.fullName = fullName;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getDriver() {
        return driver;
    }

    public void setDriver(boolean driver) {
        this.driver = driver;
    }

    public int getMinute(){
        return this.minute;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getHour(){
        return this.hour;
    }

    public int getSeats(){
        return this.seats;
    }

    public void setSeats(int seats){
        this.seats = seats;
    }

    public String[] getReviews(){
        return this.reviews;
    }

    public void setReviews(String[] reviews){
        this.reviews = reviews;
    }

    public boolean getDriving(){
        return this.driving;
    }

    public void setDriving(boolean driving){
        this.driving = driving;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean getToCampus() {
        return this.toCampus;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return this.phone;
    }

    public User() {};




}

//Hash Map of all users.  When a new user is added use the setValue call to add it
// to the firebase database
//Map<String, User> users = new HashMap<String, User>();
