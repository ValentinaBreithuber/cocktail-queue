package at.fhj.msd;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleQueueTest {
    DoubleQueue l1;
    DoubleQueue l2;
    Double a, b, c, d, e, f;
    @BeforeEach
    public void setUp() {
        l1 = new DoubleQueue(4);
        l2 = new DoubleQueue(2);
        a = 1.0;
        b = 2.0;
        c = 3.0;
        d = 4.0;
        e = 5.0;
        f = 6.0;
        l1.offer(a);
        l1.offer(b);
        l1.offer(c);
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
        assertFalse(l2.offer(f));
    }

    @DisplayName("Testing poll() method")
    @Test
    void testPoll() {
        l1.poll();
        l1.poll();
        Double element = l1.poll();
        assertEquals(c ,element);
        l2.poll();
        l2.poll();
        assertNull(l2.poll());
    }

    @DisplayName("Testing remove() method")
    @Test
    void testRemove(){
        l1.remove();
        Double element = l1.remove();
        assertEquals(b ,element);
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
        Double element = l1.peek();
        assertEquals(c, element);
        l1.remove();
        l2.peek();
        l2.remove();
        l2.peek();
        l2.remove();
        assertNull(l2.peek());
    }


    @DisplayName("Testing element() method")
    @Test
    void testElement(){
        l1.element();
        l1.remove();
        l1.element();
        l1.remove();
        Double element = l1.element();
        assertEquals(c, element);
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
