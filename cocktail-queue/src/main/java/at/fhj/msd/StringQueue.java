package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue {

    private List<String> elements = new ArrayList<String>();
    private int maxSize = 5;

    public StringQueue(int maxsize) {
        maxSize = maxSize;
    }

    /**
     * adds elements to list
     *
     * @param obj element to add
     * @return true when added succesfully, false if not added succssfully
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() != maxSize) {
            elements.add(obj);
            return true;
        }
        return false;
    }

    /**
     * deletes and returns the first element
     *
     * @return element of 1st element or null if nothing there
     */
    @Override
    public String poll() {
        String element = peek();

        if (elements.size() > 0) {
            elements.remove(0);
        }

        return element;
    }

    /**
     * deletes the first element
     *
     * @throws NoSuchElementException if no element to delete
     */
    @Override
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        element = "";
        return element;
    }

    /**
     * returns the first element without deleting
     *
     * @return element of 1st element or null if nothing there
     */
    @Override
    public String peek() {
        String element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    /**
     * returns the first element with error if null
     *
     * @return element of 1st element or null if nothing there
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        return element;
    }

}