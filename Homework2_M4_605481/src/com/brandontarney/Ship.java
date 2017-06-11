/*
//@TODO: implement error checking in setters
 * SHIP ABSTRACT CLASS:
 *  - implements the Contact Interface. The methods in contact should be defined (no longer abstract, but they can be overriden later on).
 * @author Brandon Tarney
 * @Date   6/10/2017
 */
package com.brandontarney;

/**
 *
 * @author Tarney
 */
public abstract class Ship {
     
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
        this.length = length;
        this.speed = speed;
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
