package java.at.fhj.msd;

import main.java.at.fhj.msd.Liquid;
import main.java.at.fhj.msd.SimpleDrink;
import main.java.at.fhj.msd.StringQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringQueueTest {
    StringQueue l1;
    StringQueue l2;
    @BeforeEach
    public void setUp() {
        l1=new StringQueue(4);
        l2=new StringQueue(2);
    }

    @DisplayName("Testing offer() method")
    @Test
    public void testOffer() {
        l1.offer("a");
        l1.offer("b");
        l1.offer("c");
        assertEquals(true,l1.offer("d"));
        l2.offer("a");
        l2.offer("b");
        assertEquals(false,l2.offer("c"));
    }

    @DisplayName("Testing poll() method")
    @Test
    void testPoll() {
        l1.poll();
        l1.poll();
        l1.poll();
        assertEquals("d",l1.poll());
        l2.poll();
        l2.poll();
        assertEquals(null,l2.poll());
    }

    @DisplayName("Testing remove() method")
    @Test
    void testRemove(){
        l1.remove();
        l1.remove();
        l1.remove();
        assertEquals("d",l1.remove());
        l2.remove();
        l2.remove();
        assertThrows(ArithmeticException.class, () -> {
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
        assertEquals("d",l1.peek());
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
        l1.element();
        l1.remove();
        assertEquals("d",l1.element());
        l1.remove();
        l2.element();
        l2.remove();
        l2.element();
        l2.remove();
        assertThrows(ArithmeticException.class, () -> {
            l2.element();
        });
        l2.remove();
    }
}
