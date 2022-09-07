package com.example.producingwebservice.endPoint;

import com.example.producingwebservice.data.CitiesRepository;
import io.spring.guides.gs_producing_web_service.GetCitiesRequest;
import io.spring.guides.gs_producing_web_service.GetCitiesResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CitiesEndpoint {
    private final static String NAMESPACE_URI="http://spring.io/guides/gs-producing-web-service";
    private CitiesRepository citiesRepository;

    public CitiesEndpoint(CitiesRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getCitiesRequest")
    @ResponsePayload
    private GetCitiesResponse getCitiesName(@RequestPayload GetCitiesRequest getCitiesRequest)
    {
        GetCitiesResponse response=new GetCitiesResponse();
        response.setCities(citiesRepository.getCitiesName(getCitiesRequest.getName()));
        return response;
    }
}
