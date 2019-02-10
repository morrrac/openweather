package com.openweather;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Forecast {

    @SerializedName("list")
    List<DayForecast> listForecast;
}
