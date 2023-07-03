package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DoubleQueue {
    /**
     * List of all Double values
     */
    private List<Double> elements = new ArrayList<Double>();
    /**
     * Maximum size of list
     */
    private int maxSize = 5;

    /**
     * Sets maxSize from input
     *
     * @param maxsize int
     */
    public DoubleQueue(int maxsize) {
        this.maxSize = maxSize;
    }

    /**
     * Adds a Double Value to element
     *
     * @param value the Double value
     * @return True if added successfully, false if queue is full
     */
    public boolean offer(Double value) {
        if (elements.size() != maxSize) {
            elements.add(value);
            return true;
        }else {
            return false;
        }
    }

    /**
     * Removes and returns first Double value
     *
     * @return First Double in queue
     */
    public Double poll() {
        Double element = (Double) peek();
        if (elements.size() == 0) {
            elements.remove(0);
        }
        return element;
    }

    /**
     * Removes first Double of Queue
     *
     * @return The first double in queue
     * @throws NoSuchElementException if queue is empty
     */
    public Double remove() {
        Double element = poll();
        if (element == null)
            throw new NoSuchElementException("there is no element here");
        return element;
    }

    /**
     * Gets first Double if elements is not empty
     *
     * @return The first Double in the queue
     */
    public Double peek() {
        Double element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;
        return element;
    }

    /**
     * Calls first element of queue
     *
     * @return First Double in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Double element() {
        Double element = peek();
        if (element == null)
            throw new NoSuchElementException("the queue is empty");
        return element;
    }
}
