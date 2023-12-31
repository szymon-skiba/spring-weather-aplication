package com.example.weatherclient.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GeoPositionModel {
    @JsonProperty("Latitude")
    private float Latitude;
    @JsonProperty("Longitude")
    private float Longitude;
    @JsonProperty("Elevation")
    private ElevationModel Elevation;
}
