package com.example.administrator.bdmap;

/**
 * Created by Administrator on 2017/3/20.
 */

public class data {
    public void data(String address,String name, double    latitude,double longitude){
        this.address = address;
        this.name = name;
        this.latitude=latitude;
        this.longitude= longitude;

    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String address;
    String name;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    double latitude;
    double longitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
