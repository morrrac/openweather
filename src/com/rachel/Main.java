package com.rachel;

import com.openweather.Forecast;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("hello");

        openweatherService service = new openweatherService();
        Forecast forecast = service.LoadForecastforcity("524901");



    }
}
