/*
1. Create 2 Destroyers
    
2. Create 2 Submarines
    
3. Create 2 P3s
    
4. Make a collection of Destroyers (you select the type of Collection)
    
5. Make a collection of Submarines (you select the type)
    
6. Make a collection that holds all Ships
    
7. Make a collection that holds all Contacts

 Print out the list of Contacts to System.out.println(). You should override the toString() method to return something "meaningful" for each class. Again, no hard requirements, just use a little common sense (i.e. print out more than the name).  Note: Use defensive programming whenever you can, for example, none of your methods should let the user set the number of items to a negative number.   You can choose what the constructors set these parameters to in your classes (they can be defaults or you can provide them). Typically, you try to exercise your code as much as possible in a test case so try a bit of each.  In the Test class, again, you can choose what values you wish to assign to the test cases.  Also, in your test class, you should exercise your execption handling case for the submarine by setting the number of torpedoes in one of your submarine classes to the string "Foo".
 */
package com.brandontarney;

import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class ContactTest {

    Vector<Destroyer> destroyers;
    Vector<P3> p3s;
    Vector<Submarine> subs;
    Vector<Ship> ships;
    Vector<Aircraft> aircraft;
    Vector<Contact> contacts;

    public ContactTest() {
    }

    @Before
    public void setUp() {

        destroyers = new Vector<Destroyer>();
        p3s = new Vector<P3>();
        subs = new Vector<Submarine>();
        ships = new Vector<Ship>();
        aircraft = new Vector<Aircraft>();
        contacts = new Vector<Contact>();

        Destroyer destroyer1 = new Destroyer(200, 20, "DDG_AWESOME", "DESTROYER", 5);
        destroyers.add(destroyer1);
        ships.add((Ship) destroyer1);
        contacts.add((Contact) destroyer1);
        Destroyer destroyer2 = new Destroyer(-100, -20, "", "", -5);
        destroyers.add(destroyer2);
        ships.add((Ship) destroyer2);
        contacts.add(destroyer2);

        Submarine sub1 = new Submarine(200, 10, "Silent But Deadly", "OHIO_CLASS", 2400);
        subs.add(sub1);
        ships.add((Ship) sub1);
        contacts.add((Contact) sub1);
        Submarine sub2 = new Submarine(100, 3000, "Fast and the Furious", "VIRGINIA_CLASS", 12);
        subs.add(sub2);
        ships.add((Ship) sub2);
        contacts.add((Contact) sub2);

        P3 p31 = new P3();
        p31.setAltitude(-1);
        p31.setLength(35);
        p31.setName("EAGLE1");
        p31.setNumberEngines(4);
        p31.setSpeed("-1");
        p31.setType("PLANE");
        p3s.add(p31);
        aircraft.add((Aircraft) p31);
        contacts.add((Contact) p31);
        P3 p32 = new P3(40, 101, 500, "HAWKEYE", "PLANE", 4);
        p3s.add(p32);
        aircraft.add((Aircraft) p32);
        contacts.add((Contact) p32);

    }

    @Test
    public void testEverything() {
        System.out.println("\nTest Everything");

        for (Contact contact : this.contacts) {
            System.out.println(contact.toString());
        }

        Submarine subTest = new Submarine();
        Assert.assertEquals(subTest.getName(), "no_name");
        subTest.setName("SUBTACULAR");
        Assert.assertEquals(subTest.getName(), "SUBTACULAR");

        Assert.assertEquals(subTest.getNumberTorpedos(), 0);
        subTest.setNumberTorpedos("1 billion");
        Assert.assertEquals(subTest.getNumberTorpedos(), 0);
        subTest.setNumberTorpedos("foo");
        Assert.assertEquals(subTest.getNumberTorpedos(), 0);
        subTest.setNumberTorpedos("-20");
        Assert.assertEquals(subTest.getNumberTorpedos(), 0);
        subTest.setNumberTorpedos("24");
        Assert.assertEquals(subTest.getNumberTorpedos(), 24);
        subTest.setNumberTorpedos(12);
        Assert.assertEquals(subTest.getNumberTorpedos(), 12);

    }

}
