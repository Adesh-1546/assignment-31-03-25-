package com.assignment;
/*Create a Restaurant class with instance variables restaurantName, location, cuisineType, rating, numTables,
 ownerName and onlineRating.
 Create at least two objects, assign values, and display their details.
 */

public class Restaurant {
    //instance variables
    private String restaurantName;
    private String location;
    private String cuisineType;
    private double rating;
    private int numTables;
    private String ownerName;
    private double onlineRating;

    //display
    public void displayDetails(String restaurantName,String location,String cuisineType,double rating,int numTables,String ownerName,double onlineRating)
    {
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Location: " + location);
        System.out.println("Cuisine Type: " + cuisineType);
        System.out.println("Rating: " + rating + " stars");
        System.out.println("Number of Tables: " + numTables);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Online Rating: " + onlineRating + " stars");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        //creating objects
        Restaurant r1 = new Restaurant();
        Restaurant r2 = new Restaurant();

        r1.displayDetails("Gourmet Haven", "New York", "Italian", 4.5, 20, "John Doe", 4.7);
        r2.displayDetails("Gourmet Haven", "New York", "Italian", 4.5, 20, "John Doe", 4.7);




    }
}
