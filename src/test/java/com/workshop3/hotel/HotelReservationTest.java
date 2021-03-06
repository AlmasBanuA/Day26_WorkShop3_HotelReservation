package com.workshop3.hotel;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.List;

import org.junit.Test;

public class HotelReservationTest {

	/**
	 * In this we are creating the test cases. If the hotels are added and for that
	 * adding weekday and weekend rates for each Hotel. In that we have to find the
	 * cheapest hotel if cheapest hotel is present it will return true otherwise
	 * throws exception
	 * 
	 * @author Almas
	 *
	 */
	@Test
	/**
	 * Ability to adding weekday and weekend rates and add ratings with special
	 * rates for both regular and reward customers
	 */
	public void WhenHotelsAreAddedFindCheapestHotel() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);

		/**
		 * creating instance of HotelReservation class and adding the hotels
		 */
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		Hotel cheapestHotel = hotelReservation.findCheapestHotel();
		try {
			hotelReservation.setStartDate1("10sep2020");
			hotelReservation.setEndDate1("11sep2020");
		} catch (InputValidationException e) {
			System.out.println(e.getMessage());
		}
		long totalDays = hotelReservation.getTotalNoOfDays();
		long totalCost = cheapestHotel.getWeekDayRateRegCus() * totalDays;
		assertEquals(220, totalCost);
		assertEquals("Lakewood", cheapestHotel.getHotelName());
	}

	@Test
	/**
	 * method created when hotels are added it will return size
	 */
	public void WhenHotelsAreAddedReturnSize() {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);

		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		assertEquals(3, hotelReservation.totalHotels());
	}

	@Test
	/**
	 * If the hotels are added and for that adding weekday and weekend rates for the
	 * regualar and reward customer for each Hotel. In that we have to find the
	 * cheapest hotel if cheapest hotel is present it will return true otherwise
	 * throws exception
	 * 
	 * @throws ParseException -throws exception
	 */
	public void WhenHotelsAreAddedFindCheapestHotelBasedOnWeekDayAndWeekEndRates() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 160, 60, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		try {
			hotelReservation.setStartDate1("11sep2020");
			hotelReservation.setEndDate1("12sep2020");
		} catch (InputValidationException e) {
			System.out.println(e.getMessage());
		}
		List<String> cheapestHotelList = hotelReservation.findCheapestHotelBasedOnWeekEndAndWeekDaysOffer();
		String cheapestHotel = "";

		/**
		 * ForEach() method is used and it is a Terminal operations mark the stream as
		 * consumed, after which point it can no longer be used further.
		 */
		for (String name : cheapestHotelList) {
			cheapestHotel = name;
		}
		assertEquals("Lakewood", cheapestHotel);
	}

	@Test
	/**
	 * If the hotels are added and for that adding weekday and weekend rates with
	 * the ratings for each Hotel. In that we have to find the cheapest hotel if
	 * cheapest hotel is present it will return true otherwise throws exception
	 * 
	 * @throws ParseException -throws exception
	 */
	public void WhenHotelsAreAddedWithRatingsShouldPassTest() {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);

		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		assertEquals(3, hotel1.getRating());
	}

	@Test
	/**
	 * If the hotels are added and for that adding weekday and weekend rates with
	 * the ratings for each Hotel. In that we have to find the cheapest Best rated
	 * hotel if cheapest Best Rated hotel is present it will return true otherwise
	 * throws exception
	 * 
	 * @throws ParseException -throws exception
	 */
	public void WhenHotelsAreAddedFindCheapestHotelBasedOnWeekDayAndWeekEndRatesAndBestRating() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		try {
			hotelReservation.setStartDate1("11sep2020");
			hotelReservation.setEndDate1("12sep2020");
		} catch (InputValidationException e) {
			System.out.println(e.getMessage());
		}
		String cheapestHotelBestRated = hotelReservation.findCheapestHotelBasedOnWeekEndAndWeekDaysOfferAndBestRating();
		assertEquals("Bridgewood:4:200", cheapestHotelBestRated);
	}

	@Test
	/**
	 * finding the Best Rated Hotel when the hotels are added if not present then
	 * throws exception
	 * 
	 * @throws ParseException -throws parse exception
	 */
	public void WhenHotelsAreAddedFindBestRatedHotel() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		try {
			hotelReservation.setStartDate1("11sep2020");
			hotelReservation.setEndDate1("12sep2020");
		} catch (InputValidationException e) {
			System.out.println(e.getMessage());
		}
		String HotelBestRated = hotelReservation.findBestRatedHotel();
		assertEquals("Ridgewood:370", HotelBestRated);
	}

	@Test
	/**
	 * Ability to add special rates for reward customers as a part of Loyalty
	 * Program
	 */
	public void WhenHotelsAreAddedWithRewardCustomerRatesShouldPassTest() {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);

		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		assertEquals(110, hotel2.getWeekDayRateRewardCus());
	}

	@Test
	/**
	 * Ability to find the cheapest best rated hotel Hotel for a given Date Range
	 * for a Reward Customer - Ability to validate the user inputs for
	 * 
	 * @throws ParseException -throws exception
	 */
	public void WhenHotelsAreAddedFindCheapestHotelBasedOnWeekDayAndWeekEndRatesAndBestRatingForRewardCustomer()
			throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		try {
			hotelReservation.setStartDate1("11sep2020");
			hotelReservation.setEndDate1("12sep2020");
		} catch (InputValidationException e) {
			System.out.println(e.getMessage());
		}
		String cheapestHotelBestRated = hotelReservation
				.findCheapestHotelBasedOnWeekEndAndWeekDaysOfferAndBestRatingForRewardCustomer();
		assertEquals("Ridgewood:5:140", cheapestHotelBestRated);
	}

}
