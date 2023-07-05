package test.java.at.fhj.msd;

import main.java.at.fhj.msd.Liquid;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class LiquidTest {
    Liquid l1;
    Liquid l2;
    Liquid l3;

    @BeforeEach
    public void setUp() {
        l1=new Liquid("Vodka",40.0,30.0);
        l2=new Liquid("Rum",45.0,60.0);
        l3=new Liquid("Water",500.0,0.0);
    }

    @DisplayName("Testing getName() method")
    @Test
    public void testGetName() {
        String result= l1.getName();
        assertEquals("Vodka",result);

        result= l2.getName();
        assertEquals("Rum",result);

        result= l3.getName();
        assertEquals("Water",result);
    }

    @DisplayName("Testing getVolume() method")
    @Test
    public void testGetVolume() {
        double result= l1.getVolume();
        assertEquals(40.0,result);

        result= l2.getVolume();
        assertEquals(45.0,result);

        result= l3.getVolume();
        assertEquals(500.0,result);
    }

    @DisplayName("Testing getAlcoholPercent() method")
    @Test
    void testGetAlcoholPerc() {
        double result= l1.getAlcoholPercent();
        assertEquals(30.0,result);

        result= l2.getAlcoholPercent();
        assertEquals(60.0,result);

        result= l3.getAlcoholPercent();
        assertEquals(0,result);

    }

    @DisplayName("Testing setName() method")
    @Test
    public void testSetName() {
        l1.setName("Jeff");
        String result= l1.getName();
        assertEquals("Jeff",result);

        l2.setName("Klaus");
        result= l2.getName();
        assertEquals("Klaus",result);

        l3.setName("Vodka");
        result= l3.getName();
        assertEquals("Vodka",result);
    }

    @DisplayName("Testing setVolume() method")
    @Test
    public void testSetVolume() {
        l1.setVolume(80.0);
        double result= l1.getVolume();
        assertEquals(80.0,result);

        l2.setVolume(66.66);
        result= l2.getVolume();
        assertEquals(66.66,result);

        l3.setVolume(6893020.58492075842074);
        result= l3.getVolume();
        assertEquals(6893020.58492075842074,result);
    }

    @DisplayName("Testing getAlcoholPercent() method")
    @Test
    void testSetAlcoholPerc() {
        l1.setAlcoholPercent(70.0);
        double result= l1.getAlcoholPercent();
        assertEquals(70.0,result);

        l2.setAlcoholPercent(0.0);
        result= l2.getAlcoholPercent();
        assertEquals(0.0,result);

        l3.setAlcoholPercent(100.0);
        result= l3.getAlcoholPercent();
        assertEquals(100.0,result);

    }
}
