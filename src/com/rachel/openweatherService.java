package com.rachel;


import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.openweather.Forecast;
import org.glassfish.jersey.client.ClientConfig;

public class openweatherService {

    public Forecast LoadForecastforcity(String citycode) {

        String url = "http://api.openweathermap.org/data/2.5/forecast?APPID=d388c2202e9a7a65a90c8622c6bc4534&id=";
        url += citycode;

        Client client = ClientBuilder.newClient(new ClientConfig());

        WebTarget resource = client.target(url);

        Invocation.Builder request = resource.request();
        request.accept(MediaType.APPLICATION_JSON);

        Response response = request.get();

        if (response.getStatusInfo().getFamily() == Response.Status.Family.SUCCESSFUL) {
            System.out.println("Success! " + response.getStatus());
            System.out.println(response.getEntity());

            String json = response.readEntity(String.class);

            Forecast data = new Gson().fromJson(json, Forecast.class);
            return data;
        } else {
            System.out.println("ERROR! " + response.getStatus());
            System.out.println(response.getEntity());
            return null;
        }

    }
}
