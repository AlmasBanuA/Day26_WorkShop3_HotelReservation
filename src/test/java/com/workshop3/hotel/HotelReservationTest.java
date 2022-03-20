package com.workshop3.hotel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * In this we are creating the test cases. If the hotel is added it will return
 * true.
 * 
 * @author Almas
 *
 */
public class HotelReservationTest {
	@Test

	/**
	 * created method WhenHotelsAreAddedReturnSize() here if hotels are added then
	 * return true
	 */
	public void WhenHotelsAreAddedReturnSize() {
		Hotel hotel1 = new Hotel("Lakewood", 3, 90, 110, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 60, 160, 50, 110);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 150, 220, 40, 100);

		/**
		 * creating instance of HotelReservation class and adding the hotels
		 */
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		int result = hotelReservation.totalHotels();
		assertEquals(3, result);
	}
}
