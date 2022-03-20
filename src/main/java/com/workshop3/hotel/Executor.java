package com.workshop3.hotel;

import java.util.List;
import java.util.Scanner;

/**
 * ----------------------------------------------------
 * PROCEDURE:
 * ----------------------------------------------------
 /** 
 * UC1:- Ability to add Hotel in a Hotel Reservation System with Name and
 * rates for Regular Customer...
 * UC2:- Ability to find the cheapest Hotel for a given Date Range
 * UC3:- Ability to add weekday and weekend rates for each Hotel
 * UC4:- Ability to find the cheapest Hotel for a given Date Range based on weekday
   and weekend
 * UC5:- Ability to add ratings to each Hotel - Lakewood is 3, Bridgewood is 4 and Ridgewood is 5
 * UC6:- Ability to find the cheapest best rated hotel Hotel for a given Date Range
 * UC7:- Ability to find the Best Rated Hotel for a given Date Range
 */
public class Executor {

	/**
	 * Main method for manipulation of Arraylist of Hotel
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Hotel Reservation System!");

		/**
		 * Ability to adding weekday and weekend rates with ratings for each Hotel
		 */
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150);

		/**
		 * creating instance of HotelReservation class and adding the hotels
		 */
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);

		/**
		 * Ability to find the Best Rated Hotel for a given Date Range
		 * 
		 */
		System.out.println("Enter the check in date in proper format(ddMMMyyyy)");
		String startDate = sc.nextLine();
		System.out.println("Enter the check out date in proper format(ddMMMyyyy)");
		String endDate = sc.nextLine();
		long totalDays = hotelReservation.getTotalNoOfDays(startDate, endDate);
		List<String> cheapHotelList = hotelReservation.findCheapestHotelBasedOnWeekEndAndWeekDaysOffer(startDate,
				endDate);
		String cheapestHotelWithBestRating = hotelReservation
				.findCheapestHotelBasedOnWeekEndAndWeekDaysOfferAndBestRating(startDate, endDate);

		/**
		 * ForEach() method is used and it is a Terminal operations mark the stream as
		 * consumed, after which point it can no longer be used further.
		 */
		for (String name : cheapHotelList) {
			System.out.println("Cheapest Hotel for your stay: " + name);
		}
		System.out.println(cheapestHotelWithBestRating);

		String bestRatedHotel = hotelReservation.findBestRatedHotel(startDate, endDate);
		System.out.println("Best Rated Hotel:Price = " + bestRatedHotel);

	}
}
