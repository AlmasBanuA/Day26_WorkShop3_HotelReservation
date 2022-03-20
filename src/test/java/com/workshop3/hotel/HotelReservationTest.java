package com.workshop3.hotel;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;

/**
 * In this we are creating the test cases. If the hotel is added and in that we
 * have to find cheapest hotel if cheapest hotel is present it will return true.
 * 
 * @author Almas
 *
 */
public class HotelReservationTest {
	@Test
	public void WhenHotelsAreAddedReturnSize() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 110);
		Hotel hotel2 = new Hotel("Bridgewood", 160);
		Hotel hotel3 = new Hotel("Ridgewood", 220);

		/**
		 * creating instance of HotelReservation class and adding the hotels
		 */
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);

		/**
		 * finding the cheapest Hotel for a given Date Range
		 */
		Hotel cheapestHotel = hotelReservation.findCheapestHotel();
		long totalDays = hotelReservation.getTotalNoOfDays("10Sep2020", "11Sep2020");
		long totalCost = cheapestHotel.getWeekDayRateRegCus() * totalDays;
		assertEquals(220, totalCost);
		assertEquals("Lakewood", cheapestHotel.getHotelName());
	}
}
