/*
 * CHECKER CLASS
 *
 *  - Checks the format of int & Strings and sets value appropriately
 * @author Brandon Tarney
 * @since    6/10/2017
 */
package com.brandontarney;

public class Checker {

    public static int formatInt(int value) {
        if (value < 0) {
            System.out.println("Cannot set value to negative number, "
                    + " defaulting to 0");
            return 0;
        } else if (value > 1000) {
            System.out.println("Cannot set value to unrealistic value, "
                    + " defaulting to 0");
            return 0;
        } else {
            return value;
        }
    }

    public static int formatStringToInt(String value) {
        if (value.isEmpty()) {
            System.out.println("Cannot set empty Value, returning 0");
            return 0;
        } else {
            try {
                int tmpValue = Integer.parseInt(value);
                return Checker.formatInt(tmpValue);
            } catch (Exception ee) {
                System.out.println("Can't properly set String integer value,"
                        + " returning 0");
                return 0;
            }
        }
    }

}
