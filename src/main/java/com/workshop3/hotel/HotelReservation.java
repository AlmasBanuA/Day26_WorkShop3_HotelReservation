package com.workshop3.hotel;

/** 
 * UC1:- Ability to add Hotel in a Hotel Reservation System with Name and
 * rates for Regular Customer...
 */

/**
 * ----------------------------------------------------
 * PROCEDURE:
 * ----------------------------------------------------
 * 1. creating ArrayList of type Hotel to store all the Hotels
 * 2. Getting Hotel into object and adding into the array list for testing purpose
 * 3. create method addHotel to add Hotels
 * 4. take the size of an array list for testing process
 */
import java.util.ArrayList;

public class HotelReservation {
	/**
	 * creating ArrayList of type Hotel to store all the Hotels getting Hotel into
	 * object and adding into the array list for testing purpose
	 */
	ArrayList<Hotel> listOfHotels = new ArrayList<Hotel>();

	/**
	 * create method addHotel to add Hotels
	 * 
	 * @param obj -passing object
	 */
	public void addHotel(Hotel obj) {
		listOfHotels.add(obj);
	}

	/**
	 * take the size of an array list for testing process
	 */
	public int totalHotels() {
		return listOfHotels.size();
	}

	/**
	 * Main method for manipulation of Arraylist of Hotel
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to hotel reservation system!");

	}
}
