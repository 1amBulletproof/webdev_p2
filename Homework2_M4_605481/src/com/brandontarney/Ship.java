/**
 * SHIP ABSTRACT CLASS:
 *  - implements the Contact Interface. 
 * @author Brandon Tarney
 * @since   6/10/2017
 */
package com.brandontarney;

public abstract class Ship implements Contact {
     
    int length;
    int speed;
    String name;
    String type;
    
    public Ship() {
        this.length = 1;
        this.speed = 0;
        this.name = "no_name";
        this.type = "ship";
    }
    
    public Ship( int length, int speed, String name, String type) {
        this.length = Checker.formatInt(length);
        this.speed = Checker.formatInt(speed);
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
                ", Length: " + this.length + 
                ", Speed: " + this.speed;
    }
      
}
