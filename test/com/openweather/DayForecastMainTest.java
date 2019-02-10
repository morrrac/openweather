package com.openweather;

import org.junit.Test;
import org.junit.Assert;
import com.google.gson.Gson;

public class DayForecastMainTest {
    @Test
    public void createFromJSON() {

       String testjson = "{\n" +
                "        \"temp\": 265.75,\n" +
                "                \"temp_min\": 265.379,\n" +
                "                \"temp_max\": 265.75,\n" +
                "                \"pressure\": 1010.16,\n" +
                "                \"sea_level\": 1031.15,\n" +
                "                \"grnd_level\": 1010.16,\n" +
                "                \"humidity\": 85,\n" +
                "                \"temp_kf\": 0.37\n" +
                "    }";

        DayForecastMain data = new Gson().fromJson(testjson, DayForecastMain.class);
        Assert.assertTrue(data != null);
        Assert.assertTrue(data.ground_level == 1010.16);
        Assert.assertTrue(data.temp == 265.75);
        Assert.assertTrue(data.temp_max == 265.75);
        Assert.assertTrue(data.pressure == 1010.16);
        Assert.assertTrue(data.humidity == 85);
        Assert.assertTrue(data.sea_level == 1031.15);

    }



}