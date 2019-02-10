package com.openweather;

import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ForecastTest {

    @Test
    public void createFromJSON() {

        String testjson = "{\n" +
                "  \"cod\": \"200\",\n" +
                "  \"message\": 0.0033,\n" +
                "  \"cnt\": 40,\n" +
                "  \"list\": [\n" +
                "    {\n" +
                "      \"dt\": 1549746000,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 270.24,\n" +
                "        \"temp_min\": 268.746,\n" +
                "        \"temp_max\": 270.24,\n" +
                "        \"pressure\": 1012.45,\n" +
                "        \"sea_level\": 1033.53,\n" +
                "        \"grnd_level\": 1012.45,\n" +
                "        \"humidity\": 92,\n" +
                "        \"temp_kf\": 1.49\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 3.83,\n" +
                "        \"deg\": 210\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.06475\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-09 21:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549756800,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 268.57,\n" +
                "        \"temp_min\": 267.447,\n" +
                "        \"temp_max\": 268.57,\n" +
                "        \"pressure\": 1011.72,\n" +
                "        \"sea_level\": 1032.6,\n" +
                "        \"grnd_level\": 1011.72,\n" +
                "        \"humidity\": 93,\n" +
                "        \"temp_kf\": 1.12\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 80\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.11,\n" +
                "        \"deg\": 212.004\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.03375\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-10 00:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549767600,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 267.16,\n" +
                "        \"temp_min\": 266.415,\n" +
                "        \"temp_max\": 267.16,\n" +
                "        \"pressure\": 1010.73,\n" +
                "        \"sea_level\": 1031.69,\n" +
                "        \"grnd_level\": 1010.73,\n" +
                "        \"humidity\": 88,\n" +
                "        \"temp_kf\": 0.75\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 76\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.32,\n" +
                "        \"deg\": 207.504\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.035\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-10 03:00:00\"\n" +
                "    },\n" +
                "    {\n" +
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
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549789200,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 266,\n" +
                "        \"temp_min\": 266,\n" +
                "        \"temp_max\": 266,\n" +
                "        \"pressure\": 1009.34,\n" +
                "        \"sea_level\": 1030.25,\n" +
                "        \"grnd_level\": 1009.34,\n" +
                "        \"humidity\": 90,\n" +
                "        \"temp_kf\": 0\n" +
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
                "        \"all\": 68\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.95,\n" +
                "        \"deg\": 211.001\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.0575\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-10 09:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549800000,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 267.139,\n" +
                "        \"temp_min\": 267.139,\n" +
                "        \"temp_max\": 267.139,\n" +
                "        \"pressure\": 1008.43,\n" +
                "        \"sea_level\": 1029.35,\n" +
                "        \"grnd_level\": 1008.43,\n" +
                "        \"humidity\": 87,\n" +
                "        \"temp_kf\": 0\n" +
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
                "        \"all\": 76\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.76,\n" +
                "        \"deg\": 211.506\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.13\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-10 12:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549810800,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 267.773,\n" +
                "        \"temp_min\": 267.773,\n" +
                "        \"temp_max\": 267.773,\n" +
                "        \"pressure\": 1008.15,\n" +
                "        \"sea_level\": 1028.97,\n" +
                "        \"grnd_level\": 1008.15,\n" +
                "        \"humidity\": 87,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 80\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.41,\n" +
                "        \"deg\": 202.503\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.32\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-10 15:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549821600,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 268.905,\n" +
                "        \"temp_min\": 268.905,\n" +
                "        \"temp_max\": 268.905,\n" +
                "        \"pressure\": 1007.6,\n" +
                "        \"sea_level\": 1028.46,\n" +
                "        \"grnd_level\": 1007.6,\n" +
                "        \"humidity\": 90,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.46,\n" +
                "        \"deg\": 204.503\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.1275\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-10 18:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549832400,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 270.115,\n" +
                "        \"temp_min\": 270.115,\n" +
                "        \"temp_max\": 270.115,\n" +
                "        \"pressure\": 1007.31,\n" +
                "        \"sea_level\": 1028.2,\n" +
                "        \"grnd_level\": 1007.31,\n" +
                "        \"humidity\": 92,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.36,\n" +
                "        \"deg\": 210\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.0825\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-10 21:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549843200,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 270.658,\n" +
                "        \"temp_min\": 270.658,\n" +
                "        \"temp_max\": 270.658,\n" +
                "        \"pressure\": 1007.67,\n" +
                "        \"sea_level\": 1028.54,\n" +
                "        \"grnd_level\": 1007.67,\n" +
                "        \"humidity\": 95,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.22,\n" +
                "        \"deg\": 210.003\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.15\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-11 00:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549854000,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 270.773,\n" +
                "        \"temp_min\": 270.773,\n" +
                "        \"temp_max\": 270.773,\n" +
                "        \"pressure\": 1008,\n" +
                "        \"sea_level\": 1028.8,\n" +
                "        \"grnd_level\": 1008,\n" +
                "        \"humidity\": 94,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.26,\n" +
                "        \"deg\": 203.501\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.125\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-11 03:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549864800,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 270.534,\n" +
                "        \"temp_min\": 270.534,\n" +
                "        \"temp_max\": 270.534,\n" +
                "        \"pressure\": 1007.99,\n" +
                "        \"sea_level\": 1028.76,\n" +
                "        \"grnd_level\": 1007.99,\n" +
                "        \"humidity\": 93,\n" +
                "        \"temp_kf\": 0\n" +
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
                "        \"all\": 76\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.62,\n" +
                "        \"deg\": 191.003\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.08\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-11 06:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549875600,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 271.723,\n" +
                "        \"temp_min\": 271.723,\n" +
                "        \"temp_max\": 271.723,\n" +
                "        \"pressure\": 1007.49,\n" +
                "        \"sea_level\": 1028.22,\n" +
                "        \"grnd_level\": 1007.49,\n" +
                "        \"humidity\": 94,\n" +
                "        \"temp_kf\": 0\n" +
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
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 5.31,\n" +
                "        \"deg\": 189.005\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.1275\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-11 09:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549886400,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 272.783,\n" +
                "        \"temp_min\": 272.783,\n" +
                "        \"temp_max\": 272.783,\n" +
                "        \"pressure\": 1006.59,\n" +
                "        \"sea_level\": 1027.24,\n" +
                "        \"grnd_level\": 1006.59,\n" +
                "        \"humidity\": 97,\n" +
                "        \"temp_kf\": 0\n" +
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
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 5.68,\n" +
                "        \"deg\": 185.506\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.1775\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-11 12:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549897200,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 272.206,\n" +
                "        \"temp_min\": 272.206,\n" +
                "        \"temp_max\": 272.206,\n" +
                "        \"pressure\": 1005.89,\n" +
                "        \"sea_level\": 1026.55,\n" +
                "        \"grnd_level\": 1005.89,\n" +
                "        \"humidity\": 93,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 5.91,\n" +
                "        \"deg\": 179.501\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.0875\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-11 15:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549908000,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 271.373,\n" +
                "        \"temp_min\": 271.373,\n" +
                "        \"temp_max\": 271.373,\n" +
                "        \"pressure\": 1004.94,\n" +
                "        \"sea_level\": 1025.63,\n" +
                "        \"grnd_level\": 1004.94,\n" +
                "        \"humidity\": 93,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 6.57,\n" +
                "        \"deg\": 183.004\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.1\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-11 18:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549918800,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 271.396,\n" +
                "        \"temp_min\": 271.396,\n" +
                "        \"temp_max\": 271.396,\n" +
                "        \"pressure\": 1004.03,\n" +
                "        \"sea_level\": 1024.6,\n" +
                "        \"grnd_level\": 1004.03,\n" +
                "        \"humidity\": 93,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 6.57,\n" +
                "        \"deg\": 189.001\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.135\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-11 21:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549929600,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 272.19,\n" +
                "        \"temp_min\": 272.19,\n" +
                "        \"temp_max\": 272.19,\n" +
                "        \"pressure\": 1003.05,\n" +
                "        \"sea_level\": 1023.72,\n" +
                "        \"grnd_level\": 1003.05,\n" +
                "        \"humidity\": 93,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 6.26,\n" +
                "        \"deg\": 194.005\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.4\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-12 00:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549940400,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 272.408,\n" +
                "        \"temp_min\": 272.408,\n" +
                "        \"temp_max\": 272.408,\n" +
                "        \"pressure\": 1002.09,\n" +
                "        \"sea_level\": 1022.79,\n" +
                "        \"grnd_level\": 1002.09,\n" +
                "        \"humidity\": 94,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 6.01,\n" +
                "        \"deg\": 193.004\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.9775\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-12 03:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549951200,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 272.699,\n" +
                "        \"temp_min\": 272.699,\n" +
                "        \"temp_max\": 272.699,\n" +
                "        \"pressure\": 1001.76,\n" +
                "        \"sea_level\": 1022.3,\n" +
                "        \"grnd_level\": 1001.76,\n" +
                "        \"humidity\": 95,\n" +
                "        \"temp_kf\": 0\n" +
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
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 5.96,\n" +
                "        \"deg\": 190.001\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.8075\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-12 06:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549962000,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 273.458,\n" +
                "        \"temp_min\": 273.458,\n" +
                "        \"temp_max\": 273.458,\n" +
                "        \"pressure\": 1001.49,\n" +
                "        \"sea_level\": 1022.07,\n" +
                "        \"grnd_level\": 1001.49,\n" +
                "        \"humidity\": 97,\n" +
                "        \"temp_kf\": 0\n" +
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
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 6.01,\n" +
                "        \"deg\": 189.005\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 1.04\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-12 09:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549972800,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 273.77,\n" +
                "        \"temp_min\": 273.77,\n" +
                "        \"temp_max\": 273.77,\n" +
                "        \"pressure\": 1001.2,\n" +
                "        \"sea_level\": 1021.65,\n" +
                "        \"grnd_level\": 1001.2,\n" +
                "        \"humidity\": 95,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 601,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"snow\",\n" +
                "          \"icon\": \"13d\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 5.73,\n" +
                "        \"deg\": 187.504\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 1.6825\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-12 12:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549983600,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 273.695,\n" +
                "        \"temp_min\": 273.695,\n" +
                "        \"temp_max\": 273.695,\n" +
                "        \"pressure\": 1001.13,\n" +
                "        \"sea_level\": 1021.68,\n" +
                "        \"grnd_level\": 1001.13,\n" +
                "        \"humidity\": 96,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 601,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 5.36,\n" +
                "        \"deg\": 185.003\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 1.5475\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-12 15:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1549994400,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 273.652,\n" +
                "        \"temp_min\": 273.652,\n" +
                "        \"temp_max\": 273.652,\n" +
                "        \"pressure\": 1000.93,\n" +
                "        \"sea_level\": 1021.53,\n" +
                "        \"grnd_level\": 1000.93,\n" +
                "        \"humidity\": 96,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.92,\n" +
                "        \"deg\": 183\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.985\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-12 18:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550005200,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 273.778,\n" +
                "        \"temp_min\": 273.778,\n" +
                "        \"temp_max\": 273.778,\n" +
                "        \"pressure\": 1000.64,\n" +
                "        \"sea_level\": 1021.25,\n" +
                "        \"grnd_level\": 1000.64,\n" +
                "        \"humidity\": 97,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 3.93,\n" +
                "        \"deg\": 181.007\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.4075\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-12 21:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550016000,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 273.531,\n" +
                "        \"temp_min\": 273.531,\n" +
                "        \"temp_max\": 273.531,\n" +
                "        \"pressure\": 999.91,\n" +
                "        \"sea_level\": 1020.58,\n" +
                "        \"grnd_level\": 999.91,\n" +
                "        \"humidity\": 99,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 3.16,\n" +
                "        \"deg\": 169.005\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 1.2725\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-13 00:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550026800,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 273.287,\n" +
                "        \"temp_min\": 273.287,\n" +
                "        \"temp_max\": 273.287,\n" +
                "        \"pressure\": 998.46,\n" +
                "        \"sea_level\": 1019.06,\n" +
                "        \"grnd_level\": 998.46,\n" +
                "        \"humidity\": 98,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 601,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 2.77,\n" +
                "        \"deg\": 152.501\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 2.6175\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-13 03:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550037600,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 273.218,\n" +
                "        \"temp_min\": 273.218,\n" +
                "        \"temp_max\": 273.218,\n" +
                "        \"pressure\": 996.84,\n" +
                "        \"sea_level\": 1017.52,\n" +
                "        \"grnd_level\": 996.84,\n" +
                "        \"humidity\": 99,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 601,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"snow\",\n" +
                "          \"icon\": \"13d\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 2.81,\n" +
                "        \"deg\": 140.502\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 2.6325\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-13 06:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550048400,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 273.378,\n" +
                "        \"temp_min\": 273.378,\n" +
                "        \"temp_max\": 273.378,\n" +
                "        \"pressure\": 996.34,\n" +
                "        \"sea_level\": 1016.89,\n" +
                "        \"grnd_level\": 996.34,\n" +
                "        \"humidity\": 100,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 601,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"snow\",\n" +
                "          \"icon\": \"13d\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 2.32,\n" +
                "        \"deg\": 161.501\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 2.7425\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-13 09:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550059200,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 273.714,\n" +
                "        \"temp_min\": 273.714,\n" +
                "        \"temp_max\": 273.714,\n" +
                "        \"pressure\": 996.6,\n" +
                "        \"sea_level\": 1017.26,\n" +
                "        \"grnd_level\": 996.6,\n" +
                "        \"humidity\": 98,\n" +
                "        \"temp_kf\": 0\n" +
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
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 2.06,\n" +
                "        \"deg\": 306.504\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.4975\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-13 12:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550070000,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 272.691,\n" +
                "        \"temp_min\": 272.691,\n" +
                "        \"temp_max\": 272.691,\n" +
                "        \"pressure\": 998.79,\n" +
                "        \"sea_level\": 1019.44,\n" +
                "        \"grnd_level\": 998.79,\n" +
                "        \"humidity\": 95,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 5.57,\n" +
                "        \"deg\": 339.007\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.2925\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-13 15:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550080800,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 270.338,\n" +
                "        \"temp_min\": 270.338,\n" +
                "        \"temp_max\": 270.338,\n" +
                "        \"pressure\": 1000.27,\n" +
                "        \"sea_level\": 1021.04,\n" +
                "        \"grnd_level\": 1000.27,\n" +
                "        \"humidity\": 90,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 92\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 5.55,\n" +
                "        \"deg\": 342.503\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.21\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-13 18:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550091600,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 269.092,\n" +
                "        \"temp_min\": 269.092,\n" +
                "        \"temp_max\": 269.092,\n" +
                "        \"pressure\": 1001.02,\n" +
                "        \"sea_level\": 1021.82,\n" +
                "        \"grnd_level\": 1001.02,\n" +
                "        \"humidity\": 92,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 5.62,\n" +
                "        \"deg\": 344.502\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.42\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-13 21:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550102400,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 267.837,\n" +
                "        \"temp_min\": 267.837,\n" +
                "        \"temp_max\": 267.837,\n" +
                "        \"pressure\": 1001.14,\n" +
                "        \"sea_level\": 1021.92,\n" +
                "        \"grnd_level\": 1001.14,\n" +
                "        \"humidity\": 90,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 80\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 6.22,\n" +
                "        \"deg\": 342.503\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.615\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-14 00:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550113200,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 267.094,\n" +
                "        \"temp_min\": 267.094,\n" +
                "        \"temp_max\": 267.094,\n" +
                "        \"pressure\": 1000.7,\n" +
                "        \"sea_level\": 1021.65,\n" +
                "        \"grnd_level\": 1000.7,\n" +
                "        \"humidity\": 91,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 80\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 6.81,\n" +
                "        \"deg\": 337\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 1.04\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-14 03:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550124000,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 267.87,\n" +
                "        \"temp_min\": 267.87,\n" +
                "        \"temp_max\": 267.87,\n" +
                "        \"pressure\": 1000.99,\n" +
                "        \"sea_level\": 1021.95,\n" +
                "        \"grnd_level\": 1000.99,\n" +
                "        \"humidity\": 89,\n" +
                "        \"temp_kf\": 0\n" +
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
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 7.52,\n" +
                "        \"deg\": 333\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 1.1725\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-14 06:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550134800,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 268.15,\n" +
                "        \"temp_min\": 268.15,\n" +
                "        \"temp_max\": 268.15,\n" +
                "        \"pressure\": 1002.81,\n" +
                "        \"sea_level\": 1023.67,\n" +
                "        \"grnd_level\": 1002.81,\n" +
                "        \"humidity\": 91,\n" +
                "        \"temp_kf\": 0\n" +
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
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 7.48,\n" +
                "        \"deg\": 329.503\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.4175\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-14 09:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550145600,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 268.401,\n" +
                "        \"temp_min\": 268.401,\n" +
                "        \"temp_max\": 268.401,\n" +
                "        \"pressure\": 1004.24,\n" +
                "        \"sea_level\": 1025.14,\n" +
                "        \"grnd_level\": 1004.24,\n" +
                "        \"humidity\": 86,\n" +
                "        \"temp_kf\": 0\n" +
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
                "        \"all\": 88\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 6.8,\n" +
                "        \"deg\": 328.001\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.215\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"d\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-14 12:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550156400,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 267.831,\n" +
                "        \"temp_min\": 267.831,\n" +
                "        \"temp_max\": 267.831,\n" +
                "        \"pressure\": 1006.27,\n" +
                "        \"sea_level\": 1027.25,\n" +
                "        \"grnd_level\": 1006.27,\n" +
                "        \"humidity\": 86,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 80\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 6.31,\n" +
                "        \"deg\": 327.005\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.225\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-14 15:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"dt\": 1550167200,\n" +
                "      \"main\": {\n" +
                "        \"temp\": 267.159,\n" +
                "        \"temp_min\": 267.159,\n" +
                "        \"temp_max\": 267.159,\n" +
                "        \"pressure\": 1007.19,\n" +
                "        \"sea_level\": 1028.23,\n" +
                "        \"grnd_level\": 1007.19,\n" +
                "        \"humidity\": 87,\n" +
                "        \"temp_kf\": 0\n" +
                "      },\n" +
                "      \"weather\": [\n" +
                "        {\n" +
                "          \"id\": 600,\n" +
                "          \"main\": \"Snow\",\n" +
                "          \"description\": \"light snow\",\n" +
                "          \"icon\": \"13n\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"clouds\": {\n" +
                "        \"all\": 76\n" +
                "      },\n" +
                "      \"wind\": {\n" +
                "        \"speed\": 4.81,\n" +
                "        \"deg\": 325.504\n" +
                "      },\n" +
                "      \"snow\": {\n" +
                "        \"3h\": 0.094999999999999\n" +
                "      },\n" +
                "      \"sys\": {\n" +
                "        \"pod\": \"n\"\n" +
                "      },\n" +
                "      \"dt_txt\": \"2019-02-14 18:00:00\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"city\": {\n" +
                "    \"id\": 524901,\n" +
                "    \"name\": \"Moscow\",\n" +
                "    \"coord\": {\n" +
                "      \"lat\": 55.7522,\n" +
                "      \"lon\": 37.6156\n" +
                "    },\n" +
                "    \"country\": \"RU\"\n" +
                "  }\n" +
                "}";



        Forecast data = new Gson().fromJson(testjson, Forecast.class);

        Assert.assertTrue( data != null);
        Assert.assertTrue( data.listForecast != null);
        Assert.assertTrue( data.listForecast.size() == 40);



    }



}