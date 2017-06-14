/**
 * SUBMARINE CLASS:
 *
 * @author Brandon Tarney
 * @since   6/10/2017
 */

package com.brandontarney;

public class Submarine extends Ship {

    private int numTorpedos;

    public Submarine() {
        super();
        numTorpedos = 0;
    }

    public Submarine(int length, int speed, String name,
            String type, int numberTorpedos) {
        super(length, speed, name, type);
        numTorpedos = Checker.formatInt(numberTorpedos);
    }

    public int getNumberTorpedos() {
        return this.numTorpedos;
    }

    public void setNumberTorpedos(int numberTorpedos) {
        this.numTorpedos = Checker.formatInt(numberTorpedos);
    }

    public void setNumberTorpedos(String numberTorpedos) {
        this.numTorpedos = Checker.formatStringToInt(numberTorpedos);
    }
    
    @Override
    public String toString() {
        StringBuilder returnVal = new StringBuilder(super.toString());
        returnVal.append(", Number of Torpedos: " + this.numTorpedos);
        return returnVal.toString();
    }

}
