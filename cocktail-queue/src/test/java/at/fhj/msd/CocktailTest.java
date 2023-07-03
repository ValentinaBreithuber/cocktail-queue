package at.fhj.msd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CocktailTest {
    Cocktail cocktail;
    @BeforeEach
    public void setUp() { cocktail=new Cocktail(); }

    @DisplayName("Testing getVolume() method")
    @Test
    public void testGetVolume() {
        double result= calc.add(5,3);
        assertEquals(8,result);

        result= calc.add(2000,3000);
        assertEquals(5000,result);

        result= calc.add(-50,60);
        assertEquals(10,result);
    }

    @DisplayName("Testing getAlcoholPercent() method")
    @Test
    void testGetAlcoholPerc() {
        assertEquals(-1,calc.minus(2,3));
        assertEquals(-5,calc.minus(-2,3));
        assertEquals(1700000,calc.minus(2000000,300000));
    }

    /*@DisplayName("Testing divide() method")
    @Test
    void testDivide(){
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(5,0);
        });
        assertEquals(4,calc.divide(100,25));
        assertEquals(-12.5,calc.divide(50,-4));
    }*/

    @DisplayName("Testing isAlcoholic() method")
    @Test
    void testIsAlcoholic(){
        assertEquals(200,calc.multiply(100,2));
        assertEquals(-200,calc.multiply(50,-4));
        assertEquals(15.5,calc.multiply(3.1,5));
    }
}
