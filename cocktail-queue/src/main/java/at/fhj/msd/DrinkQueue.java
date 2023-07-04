package main.java.at.fhj.msd;
import main.java.at.fhj.msd.Drink;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue {
    /**
     * List of all Drinks
     */
    private List<Drink> elements = new ArrayList<>();
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
    public Drink poll() {
        Drink element = (Drink) peek();
        if (elements.size() > 0) {
            elements.remove(0);
        }
        return element;
    }

    /**
     * Removes first drink of Queue
     *
     * @return element
     */
    public Drink remove() {
        Drink element = poll();
        if (element == null) {
            throw new NoSuchElementException("there is no element here");
        }
        return element;
    }
    /**
     * Gets first element if elements is not empty
     *
     * @return element
     */
    public Drink peek() {
        Drink element;
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
    public Drink element() {
        Drink element = peek();
        if (element == null)
            throw new NoSuchElementException("the queue is empty");
        return element;
    }

}