package com.openweather;

import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayForecastTest {
    @Test
    public void createFromJSON() {

        String testjson = "{\n" +
                "      \"dt\": 1549778400,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 265.75,\n" +
                "        \"temp_min\": 265.379,\n" +
                "        \"temp_max\": 265.75,\n" +
                "        \"pressure\": 1010.16,\n" +
                "        \"sea_level\": 1031.15,\n" +
                "        \"grnd_level\": 1010.16,\n" +
                "        \"humidity\": 85,\n" +
                "        \"temp_kf\": 0.37\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13d\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 56\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.68,\n" +
                "        \"deg\": 208.002\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.07\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-10 06:00:00\"\n" +
                "    }";


        DayForecast data = new Gson().fromJson(testjson, DayForecast.class);

        Assert.assertTrue( data != null);
        Assert.assertTrue( data.main != null);
        Assert.assertTrue( data.intDate == 1549778400);
        Assert.assertTrue( data.clouds != null);
        Assert.assertTrue( data.clouds.all == 56);







    }


}