/*
//@TODO: implement error checking in setters
 * AIRCRAFT ABSTRACT CLASS:
 *  - implements the Contact Interface. This class should also contain a getAltitude/setAltitude(int) method.
 * @author Brandon Tarney
 * @Date   6/10/2017
 */
package com.brandontarney;

/**
 *
 * @author Tarney
 */
public class Aircraft {
     
    int length;
    int speed;
    int altitude;
    String name;
    String type;
    
    public Aircraft() {
        this.length = 1;
        this.speed = 0;
        this.altitude = 0;
        this.name = "no_name";
        this.type = "ship";
    }
    
    public Aircraft( int length, int speed, int altitude, String name, String type) {
        this.length = length;
        this.speed = speed;
        this.altitude = altitude;
        this.name = name;
        this.type = type;
    }
    
    public int getLength() {
        return this.length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getALtitude() {
        return this.altitude;
    }
    
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
    
    public void setSpeed(String speed) {
        this.speed = Integer.parseInt(speed);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    } 
    
}
