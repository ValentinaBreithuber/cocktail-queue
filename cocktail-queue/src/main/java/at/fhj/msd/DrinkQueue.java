package at.fhj.iit;
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

    public Object poll() {
        Object element = peek();
        if (elements.size() == 0) {
            elements.remove(0);
        }
        return element;
    }

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

    public Object element() {
        //TODO
        return null;
    }
}