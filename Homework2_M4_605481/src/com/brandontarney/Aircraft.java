/**
 * AIRCRAFT ABSTRACT CLASS:
 *  - implements the Contact Interface. 
        This class should also contain a getAltitude/setAltitude(int) method.
 * @author Brandon Tarney
 * @since   6/10/2017
 */
package com.brandontarney;

import java.lang.StringBuffer;

public abstract class Aircraft implements Contact {

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

    public Aircraft(int length, int speed,
            int altitude, String name, String type) {
        this.length = Checker.formatInt(length);
        this.speed = Checker.formatInt(speed);
        this.altitude = Checker.formatInt(altitude);
        this.name = name;
        this.type = type;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = Checker.formatInt(length);
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = Checker.formatInt(speed);
    }

    public int getALtitude() {
        return this.altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = Checker.formatInt(altitude);
    }

    public void setSpeed(String speed) {
        this.speed = Checker.formatStringToInt(speed);
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

    @Override
    public String toString() {
        return "Name: " + this.name +
                 ", Type: " + this.type +
                 ", Altitude" + this.altitude +
                 ", Length: " + this.length +
                 ", Speed: " + this.speed;
    }

    public abstract int getNumberEngines();

    public abstract void setNumberEngines(int numberEngines);

}
