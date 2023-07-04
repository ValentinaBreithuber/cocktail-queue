package test.java.at.fhj.msd;

import main.java.at.fhj.msd.Cocktail;
import main.java.at.fhj.msd.Liquid;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CocktailTest {
    Cocktail cocktail1;
    Cocktail cocktail2;
    Cocktail cocktail3;
    Cocktail cocktail4;
    ArrayList<Liquid> liquids1;
    ArrayList<Liquid> liquids2;
    ArrayList<Liquid> liquids3;
    ArrayList<Liquid> liquids4;
    Liquid l1;
    Liquid l2;
    Liquid l3;
    @BeforeEach
    public void setUp() {
        l1=new Liquid("Vodka",40.0,30.0);
        l2=new Liquid("Rum",45.0,60.0);
        l3=new Liquid("Water",500.0,0.0);
        liquids1=new ArrayList<Liquid>();
        liquids2=new ArrayList<Liquid>();
        liquids3=new ArrayList<Liquid>();
        liquids4=new ArrayList<Liquid>();
        liquids1.add(l1);
        liquids2.add(l2);
        liquids2.add(l3);
        liquids3.add(l1);
        liquids3.add(l2);
        liquids4.add(l3);
        cocktail1=new Cocktail("Jon",liquids1);
        cocktail2=new Cocktail("Jeff",liquids2);
        cocktail3=new Cocktail("Jarnathan",liquids3);
        cocktail4=new Cocktail("Timmy",liquids4);
    }

    @DisplayName("Testing getVolume() method")
    @Test
    public void testGetVolume() {
        double result= cocktail1.getVolume();
        assertEquals(40.0,result);

        result= cocktail2.getVolume();
        assertEquals(545.0,result);

        result= cocktail3.getVolume();
        assertEquals(85.0,result);

        result= cocktail4.getVolume();
        assertEquals(500,result);
    }

    @DisplayName("Testing getAlcoholPercent() method")
    @Test
    void testGetAlcoholPerc() {
       double result= cocktail1.getAlcoholPercent();
        assertEquals(30.0,result);

        result= cocktail2.getAlcoholPercent();
        assertEquals(5.0,result,0.3);

        result= cocktail3.getAlcoholPercent();
        assertEquals(45.76,result,0.3);

        result= cocktail4.getAlcoholPercent();
        assertEquals(0,result);
    }

    @DisplayName("Testing isAlcoholic() method")
    @Test
    void testIsAlcoholic(){
        boolean result=cocktail1.isAlcoholic();
        assertEquals(true,result);

         result=cocktail2.isAlcoholic();
        assertEquals(true,result);

         result=cocktail3.isAlcoholic();
        assertEquals(true,result);

         result=cocktail4.isAlcoholic();
        assertEquals(false,result);
    }
}
