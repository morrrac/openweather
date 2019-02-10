package com.openweather;
import com.google.gson.annotations.SerializedName;


public class DayForecast {
    @SerializedName("dt")
    Integer intDate;

    DayForecastMain main;
    clouds clouds;
}
