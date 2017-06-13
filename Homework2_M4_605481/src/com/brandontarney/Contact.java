/*
 * CONTACT INTERFACE:
 *
 * @author Brandon Tarney
 * @since   6/10/2017
 */

package com.brandontarney;

public interface Contact {

    public int getLength();

    public void setLength(int length);

    public int getSpeed();

    public void setSpeed(int speed);

    public void setSpeed(String speed);

    public String getName();

    public void setName(String name);

    public String getType();

    public void setType(String type);

}
