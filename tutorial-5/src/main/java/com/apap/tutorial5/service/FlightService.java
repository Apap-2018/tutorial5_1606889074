package com.apap.tutorial5.service;

import java.util.List;

import com.apap.tutorial5.model.FlightModel;

/**
 * FlightService
 */
public interface FlightService {
	void addFlight(FlightModel flight);
	
	void deleteFlight(FlightModel flight);
	
	FlightModel getFlightDetailById(long id);
	
	List<FlightModel> getAllFlight();
}
