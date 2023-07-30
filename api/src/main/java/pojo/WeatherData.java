package pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;

public class WeatherData {
	public int queryCost;
    public double latitude;
    public double longitude;
    public String resolvedAddress;
    public String address;
    public String timezone;
    public double tzoffset;
    public int getQueryCost() {
		return queryCost;
	}
	public void setQueryCost(int queryCost) {
		this.queryCost = queryCost;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getResolvedAddress() {
		return resolvedAddress;
	}
	public void setResolvedAddress(String resolvedAddress) {
		this.resolvedAddress = resolvedAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public double getTzoffset() {
		return tzoffset;
	}
	public void setTzoffset(double tzoffset) {
		this.tzoffset = tzoffset;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Day> getDays() {
		return days;
	}
	public void setDays(ArrayList<Day> days) {
		this.days = days;
	}
	public ArrayList<Object> getAlerts() {
		return alerts;
	}
	public void setAlerts(ArrayList<Object> alerts) {
		this.alerts = alerts;
	}
	public CurrentConditions getCurrentConditions() {
		return currentConditions;
	}
	public void setCurrentConditions(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}
	public String description;
    public ArrayList<Day> days;
    public ArrayList<Object> alerts;
    public CurrentConditions currentConditions;
    
    public static WeatherData getWeatherDataResponseObj(Response response) {
    	WeatherData weatherObj;
		ObjectMapper mapper = new ObjectMapper();
		try {
			weatherObj = mapper.readValue(response.getBody().asString(), WeatherData.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return weatherObj;
	}
}
