package org.grid2osm.gisapp;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table LOCATION_ENTITY.
 */
public class LocationEntity {

    private Long id;
    private Float accuracy;
    private Double altitude;
    private Float bearing;
    private Double latitude;
    private Double longitude;
    private String provider;
    private Long time;
    private long locationEntitiesId;

    public LocationEntity() {
    }

    public LocationEntity(Long id) {
        this.id = id;
    }

    public LocationEntity(Long id, Float accuracy, Double altitude, Float bearing, Double latitude, Double longitude, String provider, Long time, long locationEntitiesId) {
        this.id = id;
        this.accuracy = accuracy;
        this.altitude = altitude;
        this.bearing = bearing;
        this.latitude = latitude;
        this.longitude = longitude;
        this.provider = provider;
        this.time = time;
        this.locationEntitiesId = locationEntitiesId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Float accuracy) {
        this.accuracy = accuracy;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Float getBearing() {
        return bearing;
    }

    public void setBearing(Float bearing) {
        this.bearing = bearing;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public long getLocationEntitiesId() {
        return locationEntitiesId;
    }

    public void setLocationEntitiesId(long locationEntitiesId) {
        this.locationEntitiesId = locationEntitiesId;
    }

}
