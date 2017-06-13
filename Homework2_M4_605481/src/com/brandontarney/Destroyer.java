/*
 * DESTROYER CLASS:
 *   
 * @author Brandon Tarney
 * @since   6/10/2017
 */
package com.brandontarney;

public class Destroyer extends Ship {

    private int numMissiles;

    public Destroyer() {
        super();
        numMissiles = 0;
    }

    public Destroyer(int length, int speed, String name,
            String type, int numberMissiles) {
        super(length, speed, name, type);
        numMissiles = Checker.formatInt(numberMissiles);
    }

    public int getNumberMissiles() {
        return this.numMissiles;
    }

    public void setNumberMissiles(int numberMissiles) {
        this.numMissiles = Checker.formatInt(numberMissiles);
    }

    public void setNumberMissiles(String numberMissiles) {
        this.numMissiles = Checker.formatStringToInt(numberMissiles);
    }
    
    @Override
    public String toString() {
        StringBuilder returnVal = new StringBuilder(super.toString());
        returnVal.append(", Number of Missiles: " + this.numMissiles);
        return returnVal.toString();
    }

}
