package test.java.at.fhj.msd;

import main.java.at.fhj.msd.*;
import main.java.at.fhj.msd.DrinkQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {
    DrinkQueue l1=new DrinkQueue(4);
    DrinkQueue l2=new DrinkQueue(2);
    SimpleDrink a,b,c,d,e,f;
    Liquid l=new Liquid("Vodka",40.0,30.0);

    @BeforeEach
    public void setUp() {
        a= new SimpleDrink("a",l);
        b= new SimpleDrink("b",l);
        c= new SimpleDrink("c",l);
        d= new SimpleDrink("d",l);
        e= new SimpleDrink("e",l);
        f= new SimpleDrink("f",l);
        l1=new DrinkQueue(4);
        l1.offer(a);
        l1.offer(b);
        l1.offer(c);
        l2=new DrinkQueue(2);
        l2.offer(a);
        l2.offer(b);
    }

    @DisplayName("Testing offer() method")
    @Test
    public void testOffer() {
        assertTrue(l1.offer(d));
        l2.offer(c);
        l2.offer(d);
        l2.offer(e);
        assertEquals(false,l2.offer(f));
    }

    @DisplayName("Testing poll() method")
    @Test
    void testPoll() {
        l1.poll();
        l1.poll();
        String obj=l1.poll().getName();
        assertEquals("c",obj);
        l2.poll();
        l2.poll();
        assertEquals(null,l2.poll());
    }

    @DisplayName("Testing remove() method")
    @Test
    void testRemove(){
        l1.remove();
        String obj=l1.remove().getName();
        assertEquals("b",obj);
        l2.remove();
        l2.remove();
        assertThrows(NoSuchElementException.class, () -> {
            l2.remove();
        });
    }

    @DisplayName("Testing peek() method")
    @Test
    void testPeek(){
        l1.peek();
        l1.remove();
        l1.peek();
        l1.remove();
        String obj=l1.peek().getName();
        assertEquals("c",obj);
        l1.remove();
        l2.peek();
        l2.remove();
        l2.peek();
        l2.remove();
        assertEquals(null,l2.peek());
    }

    @DisplayName("Testing element() method")
    @Test
    void testElement(){
        l1.element();
        l1.remove();
        l1.element();
        l1.remove();
        String obj=l1.element().getName();
        assertEquals("c",obj);
        l1.remove();
        l2.element();
        l2.remove();
        l2.element();
        l2.remove();
        assertThrows(NoSuchElementException.class, () -> {
            l2.element();
        });
    }
}
