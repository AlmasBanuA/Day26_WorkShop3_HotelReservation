package com.workshop3.hotel;

public class Hotel {
	/**
	 * private variables can only be accessed within the same class (an outside
	 * class has no access to it) private = restricted access However, it is
	 * possible to access them if we provide public get and set methods.
	 */
	private String hotelName;
	private int weekEndRateRegCus;
	private int weekDayRateRegCus;

	/**
	 * creating a parameterized constructor of Hotel by passing parameters with no
	 * return type
	 * 
	 * @param hotelName         passing hotelName
	 * @param weekDayRateRegCus -passing weekday rate for regular customer
	 * @param weekEndRateRegCus - passing weekend rate for regular customer
	 */
	public Hotel(String hotelName, int weekDayRateRegCus, int weekEndRateRegCus) {
		super();
		this.hotelName = hotelName;
		this.weekDayRateRegCus = weekDayRateRegCus;
		this.weekEndRateRegCus = weekEndRateRegCus;
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
	 * he set method takes a parameter (hotelName) and assigns it to the hotelName
	 * variable. The this keyword is used to refer to the current object.
	 * 
	 * @param hotelName -pass the hotelName
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
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
	 * he set method takes a parameter (weekEndRateRegCus) and assigns it to the
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
	 * he set method takes a parameter (weekDayRateRegCus) and assigns it to the
	 * weekDayRateRegCus variable. The this keyword is used to refer to the current
	 * object.
	 * 
	 * @param weekDayRateRegCus -passing the weekDay rate of regular customer
	 */
	public void setWeekDayRateRegCus(int weekDayRateRegCus) {
		this.weekDayRateRegCus = weekDayRateRegCus;
	}

}
