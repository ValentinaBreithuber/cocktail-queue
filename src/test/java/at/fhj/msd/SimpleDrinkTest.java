package at.fhj.msd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleDrinkTest {
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
        assertEquals(40.0,drink1.getVolume());
        assertEquals(45.0,drink2.getVolume());
    }

    @DisplayName("Testing getAlcoholPercent() method")
    @Test
    void testGetAlcoholPerc() {
        assertEquals(30.0,drink1.getAlcoholPercent());
        assertEquals(60.0,drink2.getAlcoholPercent());
    }

    @DisplayName("Testing isAlcoholic() method")
    @Test
    void testIsAlcoholic(){
        assertEquals(true,drink1.isAlcoholic());
        assertEquals(true,drink2.isAlcoholic());
    }
}
