package com.bryceblankinship.eventful.dao;

public class CoordinatesDTO {

    private float longitude, latitude;

    public CoordinatesDTO(float longitude, float latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public float getLongitude(){
        return longitude;
    }

    public float getLatitude(){
        return latitude;
    }

}
