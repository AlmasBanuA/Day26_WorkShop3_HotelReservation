package com.workshop3.hotel;

public class Hotel {

	/**
	 * private variables can only be accessed within the same class (an outside
	 * class has no access to it) private = restricted access However, it is
	 * possible to access them if we provide public get and set methods.
	 */
	private String hotelName;
	private int rating;
	private int weekDayRateRegCus;
	private int weekEndRateRegCus;
	private int weekDayRateRewardCus;

	/**
	 * creating a parameterized constructor of Hotel by passing parameters with no
	 * return type
	 * 
	 * @param hotelName                    -passing hotelNames
	 * @param rating                       -passing rating of hotels
	 * @param weekDayRateRegCus-passing    weekday rate of regular customers
	 * @param weekEndRateRegCus-passing    weekend rate of regular customers
	 * @param weekDayRateRewardCus-passing weekday rate of reward customers
	 * @param weekEndRateRewardCus-passing weekend rate of reward customers
	 */
	public Hotel(String hotelName, int rating, int weekDayRateRegCus, int weekEndRateRegCus, int weekDayRateRewardCus,
			int weekEndRateRewardCus) {
		super();
		this.hotelName = hotelName;
		this.rating = rating;
		this.weekDayRateRegCus = weekDayRateRegCus;
		this.weekEndRateRegCus = weekEndRateRegCus;
		this.weekDayRateRewardCus = weekDayRateRewardCus;
		this.weekEndRateRewardCus = weekEndRateRewardCus;
	}

	private int weekEndRateRewardCus;

	/**
	 * created method getWeekEndRateRewardCus() The get method returns the value of
	 * the variable WeekEndRateRewardCus
	 * 
	 * @return -return to the method created
	 */
	public int getWeekEndRateRewardCus() {
		return weekEndRateRewardCus;
	}

	/**
	 * here set method takes a parameter (weekEndRateRewardCus) and assigns it to
	 * the weekendRateRewardCus variable. The this keyword is used to refer to the
	 * current object.
	 * 
	 * @param weekDayRateRegCus -passing the weekDay rate of regular customer
	 */
	public void setWeekEndRateRewardCus(int weekEndRateRewardCus) {
		this.weekEndRateRewardCus = weekEndRateRewardCus;
	}

	/**
	 * created method getWeekDayRateRewardCus() The get method returns the value of
	 * the variable WeekDayRateRewardCus
	 * 
	 * @return -return to the method created
	 */
	public int getWeekDayRateRewardCus() {
		return weekDayRateRewardCus;
	}

	/**
	 * here set method takes a parameter (weekDayRateRewardCus) and assigns it to
	 * the weekDayRateRewardCus variable. The this keyword is used to refer to the
	 * current object.
	 * 
	 * @param weekDayRateRewardCus -passing the weekDay rate of reward customer
	 */
	public void setWeekDayRateRewardCus(int weekDayRateRewardCus) {
		this.weekDayRateRewardCus = weekDayRateRewardCus;
	}

	/**
	 * getter setter methods created method getHotelName() The get method returns
	 * the value of the variable hotelName.
	 * 
	 * @return -return to method created
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * here set method takes a parameter (hotelName) and assigns it to the hotelName
	 * variable. The this keyword is used to refer to the current object.
	 * 
	 * @param hotelName -pass the hotelName
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * created method getRating() The get method returns the value of the variable
	 * rating.
	 * 
	 * @return -return to method created
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * here set method takes a parameter (rating) and assigns it to the rating
	 * variable. The this keyword is used to refer to the current object.
	 * 
	 * @param rating -pass the ratings
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * created method getWeekEndRateRegCus() The get method returns the value of the
	 * variable WeekEndRateRegCus.
	 * 
	 * @return -return to the method created
	 */
	public int getWeekEndRateRegCus() {
		return weekEndRateRegCus;
	}

	/**
	 * here set method takes a parameter (weekEndRateRegCus) and assigns it to the
	 * weekEndRateRegCus variable. The this keyword is used to refer to the current
	 * object.
	 * 
	 * @param weekEndRateRegCus -passing the weekend rate of regular customer
	 */
	public void setWeekEndRateRegCus(int weekEndRateRegCus) {
		this.weekEndRateRegCus = weekEndRateRegCus;
	}

	/**
	 * created method getWeekDayRateRegCus() The get method returns the value of the
	 * variable WeekDayRateRegCus
	 * 
	 * @return -return to the method created
	 */
	public int getWeekDayRateRegCus() {
		return weekDayRateRegCus;
	}

	/**
	 * here set method takes a parameter (weekDayRateRegCus) and assigns it to the
	 * weekDayRateRegCus variable. The this keyword is used to refer to the current
	 * object.
	 * 
	 * @param weekDayRateRegCus -passing the weekDay rate of regular customer
	 */
	public void setWeekDayRateRegCus(int weekDayRateRegCus) {
		this.weekDayRateRegCus = weekDayRateRegCus;
	}

}
