/**
 * P3 CLASS:
 *
 * @author Brandon Tarney
 * @since   6/10/2017
 */

package com.brandontarney;

public class P3 extends Aircraft {

    private int numEngines;

    public P3() {
        super();
        this.numEngines = 0;
    }

    public P3(int length, int speed,
            int altitude, String name, String type,
            int numEngines) {
        super(length, speed, altitude, name, type);
        this.numEngines = Checker.formatInt(numEngines);
    }
    
    @Override
    public int getNumberEngines() {
        return this.numEngines;
    }

    @Override
    public void setNumberEngines(int numberMissiles) {
        this.numEngines = Checker.formatInt(numberMissiles);
    }
    
    @Override
    public String toString() {
        StringBuilder returnVal = new StringBuilder(super.toString());
        returnVal.append(", Number of Engines: " + this.numEngines);
        return returnVal.toString();
    }

}
