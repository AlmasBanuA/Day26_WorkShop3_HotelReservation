package com.workshop3.hotel;

/**
 * ----------------------------------------------------
 * PROCEDURE:
 * ----------------------------------------------------
 /** 
 * UC1:- Ability to add Hotel in a Hotel Reservation System with Name and
 * rates for Regular Customer...
 * UC2:- Ability to find the cheapest Hotel for a given Date Range
 * UC3:- Ability to add weekday and weekend rates for each Hotel
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

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
	 * create method getTotalNoOfDays to get the total days it having start date and
	 * end date if we type any other date instead of given date format it will
	 * throws parseException
	 * 
	 * @param start - start date
	 * @param end-  end date
	 * @return -return to method created
	 * @throws ParseException -throws exception
	 */
	public long getTotalNoOfDays(String start, String end) throws ParseException {
		Date startDate = new SimpleDateFormat("ddMMMyyyy").parse(start);
		Date endDate = new SimpleDateFormat("ddMMMyyyy").parse(end);
		long TotalNoOfDays = 1 + (endDate.getTime() - startDate.getTime()) / 1000 / 60 / 60 / 24;
		return TotalNoOfDays;
	}

	/**
	 * method to find Cheapest Hotel by comparing from all the hotels
	 * 
	 * @return -return to method created
	 */
	public Hotel findCheapestHotel() {
		Hotel cheapestHotel = listOfHotels.stream().min(Comparator.comparing(Hotel::getWeekDayRateRegCus)).orElse(null);
		return cheapestHotel;
	}

	/**
	 * Main method for manipulation of Arraylist of Hotel
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Hotel Reservation System!");
		Hotel hotel1 = new Hotel("Lakewood", 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 160, 60);
		Hotel hotel3 = new Hotel("Ridgewood", 220, 150);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		System.out.println("Enter the check in date in proper format(ddMMMyyyy)");
		String startDate = sc.nextLine();
		System.out.println("Enter the check out date in proper format(ddMMMyyyy)");
		String endDate = sc.nextLine();

		/**
		 * finding the cheapest Hotel for a given Date Range
		 */
		Hotel cheapestHotel = hotelReservation.findCheapestHotel();
		long totalDays = hotelReservation.getTotalNoOfDays("10Sep2020", "11Sep2020");
		long totalCost = cheapestHotel.getWeekDayRateRegCus() * totalDays;

		System.out.println("Cheapest Hotel for your stay: " + cheapestHotel.getHotelName());
		System.out.println("Total expense: " + totalCost);

	}
}
