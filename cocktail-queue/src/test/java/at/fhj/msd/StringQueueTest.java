package test.java.at.fhj.msd;

import main.java.at.fhj.msd.Liquid;
import main.java.at.fhj.msd.SimpleDrink;
import main.java.at.fhj.msd.StringQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class StringQueueTest {
    StringQueue l1;
    StringQueue l2;
    @BeforeEach
    public void setUp() {
        l1=new StringQueue(4);
        l1.offer("a");
        l1.offer("b");
        l1.offer("c");
        l2=new StringQueue(2);
        l2.offer("a");
        l2.offer("b");
    }

    @DisplayName("Testing offer() method")
    @Test
    public void testOffer() {
        assertEquals(true,l1.offer("d"));
        assertEquals(false,l2.offer("d"));
    }

    @DisplayName("Testing poll() method")
    @Test
    void testPoll() {
        l1.poll();
        l1.poll();
        l1.poll();
        assertEquals("c",l1.poll());
        l2.poll();
        l2.poll();
        assertEquals(null,l2.poll());
    }

    @DisplayName("Testing remove() method")
    @Test
    void testRemove(){
        l1.remove();
        l1.remove();
        assertEquals("c",l1.remove());
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
        l1.peek();
        l1.remove();
        assertEquals("c",l1.peek());
        l1.remove();
        l2.peek();
        l2.remove();
        l2.peek();
        l2.remove();
        assertEquals(null,l2.peek());
        l2.remove();
    }

    @DisplayName("Testing element() method")
    @Test
    void testElement(){
        l1.element();
        l1.remove();
        l1.element();
        l1.remove();
        assertEquals("c",l1.element());
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
