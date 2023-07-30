package api;

import static org.testng.Assert.assertEquals;

import java.util.Date;
import org.testng.annotations.Test;
import io.restassured.*;
import io.restassured.response.Response;
import pojo.WeatherData;

public class WeatherAPITest extends WeatherData{
	

	    private static final String BASE_URL = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline";
	    private static final String YOUR_API_KEY = "DMPT3TKLH7CNZHQBCD22VSKMW"; 
	    private static final String CITY = "Salem"; 
    	RestAssured rest= new RestAssured();
    	WeatherData weatherDataObj =new WeatherData();
    	Date date= new Date() ;


	    @Test
	    public void testWeatherData() {
	        rest.baseURI = BASE_URL;

	        Response response = rest.given()
	            .queryParam("unitGroup", "metric")
	            .queryParam("key", YOUR_API_KEY)
	            .queryParam("contentType", "json")
	        .when()
	            .get("/{city}", CITY);
	        response.then().log().all();
	        
	        assertEquals(200, response.getStatusCode());
	        weatherDataObj = WeatherData.getWeatherDataResponseObj(response);
	        
	        assertEquals(CITY, weatherDataObj.getAddress());
	        assertEquals("Asia/Kolkata", weatherDataObj.getTimezone());
	        assertEquals(5.5, weatherDataObj.getTzoffset());

	       // assertEquals(CITY, weatherDataObj.getCurrentConditions().getDatetimeEpoch());
	        assertEquals(java.time.LocalDate.now().toString(), weatherDataObj.getDays().get(0).getDatetime());

	       
	        assertEquals(CITY, response.path("address"));
	       // assertEquals("Cloudy", response.path("weather_condition"));
	    }
	}

