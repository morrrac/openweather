package com.openweather;
import com.google.gson.annotations.SerializedName;


public class DayForecastMain {

    Double temp;
    Double temp_min;
    Double temp_max;
    Double pressure;
    Double sea_level;

    @SerializedName("grnd_level")
    Double ground_level;
    Double humidity;
    Double temp_kf;




}
