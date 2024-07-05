//package com.imran.assignment.assignment4;
public class Movie {
    // Static variable to keep track of available seats
    private static int seats = 100;

    // Instance variables
    private String movieName;
    private String showTime;
    private String personName;

    // Constructor to book a seat and initialize the instance variables
    public Movie(String movieName, String showTime, String personName) {
        if (seats > 0) {
            this.movieName = movieName;
            this.showTime = showTime;
            this.personName = personName;
            seats--;
            System.out.println("Seat booked successfully for " + personName);
        } else {
            System.out.println("Sorry, no seats available for " + personName);
        }
    }

    // Getter methods
    public String getMovieName() {
        return movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public String getPersonName() {
        return personName;
    }

    // Static method to get the remaining seats
    public static int getRemainingSeats() {
        return seats;
    }

    // Main method to demonstrate the class functionality
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "7:00 PM", "natraj");
        Movie movie2 = new Movie("Inception", "7:00 PM", "balaji");
        Movie movie3 = new Movie("Inception", "7:00 PM", "amul");

        System.out.println("Remaining seats: " + Movie.getRemainingSeats());

        Movie movie4 = new Movie("Inception", "7:00 PM", "milky");
        System.out.println("Remaining seats: " + Movie.getRemainingSeats());
    }
}
