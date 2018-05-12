package com.rajanfernandez.motoparks;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by rajan on 10/05/17.
 */

public class Park {

    public String name;
    public LatLng coordinate;

    public Park(LatLng coordinate, String name) {
        this.name = name;
        this.coordinate = coordinate;
    }

    public LatLng getCoordinate() {
        return coordinate;
    }

}
