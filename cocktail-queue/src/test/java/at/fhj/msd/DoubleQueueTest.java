package test.java.at.fhj.msd;

import main.java.at.fhj.msd.DoubleQueue;
import main.java.at.fhj.msd.StringQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleQueueTest {
    DoubleQueue l1=new DoubleQueue(4);
    DoubleQueue l2=new DoubleQueue(2);
    @BeforeEach
    public void setUp() {
        l1=new DoubleQueue(4);

        l2=new DoubleQueue(2);
        
    }

    @DisplayName("Testing offer() method")
    @Test
    public void testOffer() {
        assertTrue(l1.offer("d"));
        l2.offer("c");
        l2.offer("d");
        l2.offer("e");
        assertEquals(false,l2.offer("f"));
    }

    @DisplayName("Testing poll() method")
    @Test
    void testPoll() {
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
        assertEquals("",l1.remove());
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
        assertEquals("c",l1.peek());
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
