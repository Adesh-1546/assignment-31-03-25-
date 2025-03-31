package com.assignment;
//Create a TVShow class with instance variables showName, genre, director, seasons, IMDBRating, and releaseYear.
// Create at least two objects, assign values, and print their details.

public class Tvshow {
    //Instance variable
    public String showName;
    public String genre;
    public String director;
    public int seasons;
    public double IMDBRating;
    public int releaseYear;

    //display method()
    public void display(String showName,String genre,String director,int seasons,double IMDBRating,int releaseYear){
        System.out.println("Show Name :" +showName);
        System.out.println("Genre : "+genre);
        System.out.println("Director : "+director);
        System.out.println("total Seasons : "+seasons);
        System.out.println("IMDB rating : "+ IMDBRating);
        System.out.println("Release year : "+releaseYear);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        //object creation
        Tvshow ts1 = new Tvshow();
        Tvshow ts2 = new Tvshow();

        ts1.display("Breaking Bad", "Crime, Drama", "Vince Gilligan", 5, 9.5, 2008);
        ts2.display("Stranger Things", "Sci-Fi, Horror", "The Duffer Brothers", 4, 8.7, 2016);


    }
}

