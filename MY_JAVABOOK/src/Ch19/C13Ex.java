package Ch19;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C13Ex {

	public static void main(String[] args) throws IOException, InterruptedException {
		// 날씨 API 선택 받아오는 작업 해보세요.
		
		// URL,PARAM 지정
//		https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}
		String url = "https://api.openweathermap.org/data/2.5/weather";
		String lat = "35.86952722";
		String lon = "128.6061745";
		String appid = "fe56feb46246f09eb9c123fe754ede8f";
		url = url+"?lat="+lat+"&lon="+lon+"&appid="+appid;
		
		//Http Request 객체 생성
		HttpRequest httpRequest = HttpRequest.newBuilder()
									.uri(URI.create(url))
									.GET()
									.build();
		
		//Http Request 요청 / 응답 확인
		HttpClient httpClient = HttpClient.newHttpClient();
		
		HttpResponse<String> response =
		httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
//		System.out.println(response.body());
		
		
		
		//가공 처리
		
		//JSON 파싱을 위한 ObjectMapper
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(response.body());
		
		//JSON Type
		
//		// "coord" 객체를 가져와서 그안에있는 lat, lon 찾기.
//		JsonNode coord = jsonNode.get("coord");
//		System.out.println("위도 : " + coord.get("lat"));
//		System.out.println("경도 : " + coord.get("lon"));
//		JsonNode data_arr = jsonNode.get("weather");
//		for(int i=0; i<data_arr.size(); i++) {
//			JsonNode el = data_arr.get(i);
//			System.out.println(el);
//
//		}
		
		
		//CLASS TYPE
		Weather weather = objectMapper.readValue(response.body(), Weather.class);
		System.out.println("Status : " + weather.getId());
		System.out.println("total : " + weather.getMain());
		System.out.println("total : " + weather.getDescription());
		
//		System.out.println(weather.getData().get(0));

	}
	
	// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
	// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
	/* ObjectMapper om = new ObjectMapper();
	Root root = om.readValue(myJsonString, Root.class); */
	public class Clouds{
	    public int all;
	    //생성자

		public Clouds(int all) {
			super();
			this.all = all;
		}
		//Setter, Getter

		public int getAll() {
			return all;
		}

		public void setAll(int all) {
			this.all = all;
		}

		@Override
		public String toString() {
			return "Clouds [all=" + all + "]";
		}
		
		
	    
	    
	}

	public class Coord{
	    public double lon;
	    public double lat;
		public Coord(double lon, double lat) {
			super();
			this.lon = lon;
			this.lat = lat;
		}
		public double getLon() {
			return lon;
		}
		public void setLon(double lon) {
			this.lon = lon;
		}
		public double getLat() {
			return lat;
		}
		public void setLat(double lat) {
			this.lat = lat;
		}
	    
	    
	}

	public class Main{
	    public double temp;
	    public double feels_like;
	    public double temp_min;
	    public double temp_max;
	    public int pressure;
	    public int humidity;
	    public int sea_level;
	    public int grnd_level;
		public Main(double temp, double feels_like, double temp_min, double temp_max, int pressure, int humidity,
				int sea_level, int grnd_level) {
			super();
			this.temp = temp;
			this.feels_like = feels_like;
			this.temp_min = temp_min;
			this.temp_max = temp_max;
			this.pressure = pressure;
			this.humidity = humidity;
			this.sea_level = sea_level;
			this.grnd_level = grnd_level;
		}
		public double getTemp() {
			return temp;
		}
		public void setTemp(double temp) {
			this.temp = temp;
		}
		public double getFeels_like() {
			return feels_like;
		}
		public void setFeels_like(double feels_like) {
			this.feels_like = feels_like;
		}
		public double getTemp_min() {
			return temp_min;
		}
		public void setTemp_min(double temp_min) {
			this.temp_min = temp_min;
		}
		public double getTemp_max() {
			return temp_max;
		}
		public void setTemp_max(double temp_max) {
			this.temp_max = temp_max;
		}
		public int getPressure() {
			return pressure;
		}
		public void setPressure(int pressure) {
			this.pressure = pressure;
		}
		public int getHumidity() {
			return humidity;
		}
		public void setHumidity(int humidity) {
			this.humidity = humidity;
		}
		public int getSea_level() {
			return sea_level;
		}
		public void setSea_level(int sea_level) {
			this.sea_level = sea_level;
		}
		public int getGrnd_level() {
			return grnd_level;
		}
		public void setGrnd_level(int grnd_level) {
			this.grnd_level = grnd_level;
		}
		@Override
		public String toString() {
			return "Main [temp=" + temp + ", feels_like=" + feels_like + ", temp_min=" + temp_min + ", temp_max="
					+ temp_max + ", pressure=" + pressure + ", humidity=" + humidity + ", sea_level=" + sea_level
					+ ", grnd_level=" + grnd_level + "]";
		}
		
	    
	}

	public class Root{
	    public Coord coord;
	    public ArrayList<Weather> weather;
	    public String base;
	    public Main main;
	    public int visibility;
	    public Wind wind;
	    public Clouds clouds;
	    public int dt;
	    public Sys sys;
	    public int timezone;
	    public int id;
	    public String name;
	    public int cod;
		public Root(Coord coord, ArrayList<Weather> weather, String base, Main main, int visibility, Wind wind,
				Clouds clouds, int dt, Sys sys, int timezone, int id, String name, int cod) {
			super();
			this.coord = coord;
			this.weather = weather;
			this.base = base;
			this.main = main;
			this.visibility = visibility;
			this.wind = wind;
			this.clouds = clouds;
			this.dt = dt;
			this.sys = sys;
			this.timezone = timezone;
			this.id = id;
			this.name = name;
			this.cod = cod;
		}
		public Coord getCoord() {
			return coord;
		}
		public void setCoord(Coord coord) {
			this.coord = coord;
		}
		public ArrayList<Weather> getWeather() {
			return weather;
		}
		public void setWeather(ArrayList<Weather> weather) {
			this.weather = weather;
		}
		public String getBase() {
			return base;
		}
		public void setBase(String base) {
			this.base = base;
		}
		public Main getMain() {
			return main;
		}
		public void setMain(Main main) {
			this.main = main;
		}
		public int getVisibility() {
			return visibility;
		}
		public void setVisibility(int visibility) {
			this.visibility = visibility;
		}
		public Wind getWind() {
			return wind;
		}
		public void setWind(Wind wind) {
			this.wind = wind;
		}
		public Clouds getClouds() {
			return clouds;
		}
		public void setClouds(Clouds clouds) {
			this.clouds = clouds;
		}
		public int getDt() {
			return dt;
		}
		public void setDt(int dt) {
			this.dt = dt;
		}
		public Sys getSys() {
			return sys;
		}
		public void setSys(Sys sys) {
			this.sys = sys;
		}
		public int getTimezone() {
			return timezone;
		}
		public void setTimezone(int timezone) {
			this.timezone = timezone;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCod() {
			return cod;
		}
		public void setCod(int cod) {
			this.cod = cod;
		}
		@Override
		public String toString() {
			return "Root [coord=" + coord + ", weather=" + weather + ", base=" + base + ", main=" + main
					+ ", visibility=" + visibility + ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt + ", sys="
					+ sys + ", timezone=" + timezone + ", id=" + id + ", name=" + name + ", cod=" + cod + "]";
		}
	    
	}

	public class Sys{
	    public String country;
	    public int sunrise;
	    public int sunset;
		public Sys(String country, int sunrise, int sunset) {
			super();
			this.country = country;
			this.sunrise = sunrise;
			this.sunset = sunset;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getSunrise() {
			return sunrise;
		}
		public void setSunrise(int sunrise) {
			this.sunrise = sunrise;
		}
		public int getSunset() {
			return sunset;
		}
		public void setSunset(int sunset) {
			this.sunset = sunset;
		}
		@Override
		public String toString() {
			return "Sys [country=" + country + ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
		}
	    
	}

	public class Weather{
	    public int id;
	    public String main;
	    public String description;
	    public String icon;
		public Weather(int id, String main, String description, String icon) {
			super();
			this.id = id;
			this.main = main;
			this.description = description;
			this.icon = icon;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMain() {
			return main;
		}
		public void setMain(String main) {
			this.main = main;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getIcon() {
			return icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		@Override
		public String toString() {
			return "Weather [id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + "]";
		}
	    
	}

	public class Wind{
	    public double speed;
	    public int deg;
	    public double gust;
		public Wind(double speed, int deg, double gust) {
			super();
			this.speed = speed;
			this.deg = deg;
			this.gust = gust;
		}
		public double getSpeed() {
			return speed;
		}
		public void setSpeed(double speed) {
			this.speed = speed;
		}
		public int getDeg() {
			return deg;
		}
		public void setDeg(int deg) {
			this.deg = deg;
		}
		public double getGust() {
			return gust;
		}
		public void setGust(double gust) {
			this.gust = gust;
		}
		@Override
		public String toString() {
			return "Wind [speed=" + speed + ", deg=" + deg + ", gust=" + gust + "]";
		}
	    
	}



}
