package pojo;

import java.util.ArrayList;

public class CurrentConditions {
	public String datetime;
    public int datetimeEpoch;
    public double temp;
    public double feelslike;
    public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public int getDatetimeEpoch() {
		return datetimeEpoch;
	}
	public void setDatetimeEpoch(int datetimeEpoch) {
		this.datetimeEpoch = datetimeEpoch;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getFeelslike() {
		return feelslike;
	}
	public void setFeelslike(double feelslike) {
		this.feelslike = feelslike;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getDew() {
		return dew;
	}
	public void setDew(double dew) {
		this.dew = dew;
	}
	public int getPrecip() {
		return precip;
	}
	public void setPrecip(int precip) {
		this.precip = precip;
	}
	public double getPrecipprob() {
		return precipprob;
	}
	public void setPrecipprob(double precipprob) {
		this.precipprob = precipprob;
	}
	public int getSnow() {
		return snow;
	}
	public void setSnow(int snow) {
		this.snow = snow;
	}
	public int getSnowdepth() {
		return snowdepth;
	}
	public void setSnowdepth(int snowdepth) {
		this.snowdepth = snowdepth;
	}
	public Object getPreciptype() {
		return preciptype;
	}
	public void setPreciptype(Object preciptype) {
		this.preciptype = preciptype;
	}
	public double getWindgust() {
		return windgust;
	}
	public void setWindgust(double windgust) {
		this.windgust = windgust;
	}
	public double getWindspeed() {
		return windspeed;
	}
	public void setWindspeed(double windspeed) {
		this.windspeed = windspeed;
	}
	public double getWinddir() {
		return winddir;
	}
	public void setWinddir(double winddir) {
		this.winddir = winddir;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public double getVisibility() {
		return visibility;
	}
	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}
	public int getCloudcover() {
		return cloudcover;
	}
	public void setCloudcover(int cloudcover) {
		this.cloudcover = cloudcover;
	}
	public int getSolarradiation() {
		return solarradiation;
	}
	public void setSolarradiation(int solarradiation) {
		this.solarradiation = solarradiation;
	}
	public int getSolarenergy() {
		return solarenergy;
	}
	public void setSolarenergy(int solarenergy) {
		this.solarenergy = solarenergy;
	}
	public int getUvindex() {
		return uvindex;
	}
	public void setUvindex(int uvindex) {
		this.uvindex = uvindex;
	}
	public int getSevererisk() {
		return severerisk;
	}
	public void setSevererisk(int severerisk) {
		this.severerisk = severerisk;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public ArrayList<Object> getStations() {
		return stations;
	}
	public void setStations(ArrayList<Object> stations) {
		this.stations = stations;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public int getSunriseEpoch() {
		return sunriseEpoch;
	}
	public void setSunriseEpoch(int sunriseEpoch) {
		this.sunriseEpoch = sunriseEpoch;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	public int getSunsetEpoch() {
		return sunsetEpoch;
	}
	public void setSunsetEpoch(int sunsetEpoch) {
		this.sunsetEpoch = sunsetEpoch;
	}
	public double getMoonphase() {
		return moonphase;
	}
	public void setMoonphase(double moonphase) {
		this.moonphase = moonphase;
	}
	public double humidity;
    public double dew;
    public int precip;
    public double precipprob;
    public int snow;
    public int snowdepth;
    public Object preciptype;
    public double windgust;
    public double windspeed;
    public double winddir;
    public int pressure;
    public double visibility;
    public int cloudcover;
    public int solarradiation;
    public int solarenergy;
    public int uvindex;
    public int severerisk;
    public String conditions;
    public String icon;
    public ArrayList<Object> stations;
    public String source;
    public String sunrise;
    public int sunriseEpoch;
    public String sunset;
    public int sunsetEpoch;
    public double moonphase;
}
