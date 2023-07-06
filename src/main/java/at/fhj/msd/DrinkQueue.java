package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue {
    /**
     * List of all Drinks
     */
    private List<Object> elements = new ArrayList<Object>();
    /**
     * Maximum size of list
     */
    private int maxSize = 5;
    /**
     * Sets maxSize from input
     *
     * @param maxsize int
     */
    public DrinkQueue(int maxsize) {
        maxSize = maxSize;
    }

    /**
     * Adds Drink to elements if not in it already
     *
     * @param drink Drink
     * @return boolean
     */
    public boolean offer(Drink drink) {
        if (elements.size() != maxSize)
            elements.add(drink);
        else
            return false;
        return true;
    }

    /**
     * Removes and returns first element
     *
     * @return element
     */
    public Object poll() {
        Object element = peek();
        if (elements.size() == 0) {
            elements.remove(0);
        }
        return element;
    }

    /**
     * Removes first drink of Queue
     *
     * @return element
     */
    public Object remove() {
        Object element = poll();
        if (element == null)
            throw new NoSuchElementException("there is no element here");
        return element;
    }
    /**
     * Gets first element if elements is not empty
     *
     * @return element
     */
    public Object peek() {
        Object element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;
        return element;
    }

    /**
     * Gets first element of queue
     *
     * @return element
     * @throws NoSuchElementException if the queue is empty
     */
    public Object element() {
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("the queue is empty");
        return element;
    }

}