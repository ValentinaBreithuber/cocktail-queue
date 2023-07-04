package java.at.fhj.msd;

import main.java.at.fhj.msd.Liquid;
import main.java.at.fhj.msd.SimpleDrink;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IQueueTest {
    Liquid l1=new Liquid("Vodka",40.0,30.0);
    Liquid l2=new Liquid("Rum",45.0,60.0);
    SimpleDrink drink1;
    SimpleDrink drink2;
    @BeforeEach
    public void setUp() {
        drink1=new SimpleDrink("Jeff",l1);
        drink2=new SimpleDrink("Jarnathan",l2);
    }

    @DisplayName("Testing getVolume() method")
    @Test
    public void testGetVolume() {
        assertEquals(30.0,drink1.getVolume());
        assertEquals(60.0,drink2.getVolume());
    }

    @DisplayName("Testing getAlcoholPercent() method")
    @Test
    void testGetAlcoholPerc() {
        assertEquals(40.0,drink1.getAlcoholPercent());
        assertEquals(45.0,drink2.getAlcoholPercent());
    }

    @DisplayName("Testing isAlcoholic() method")
    @Test
    void testIsAlcoholic(){
        assertEquals(true,drink1.isAlcoholic());
        assertEquals(true,drink2.isAlcoholic());
    }
}