package at.fhj.msd;
/**
 * Interface base class for sorting Strings into Queue
 */
public interface IQueue {
  /**
   * adds elements to list
   *
   * @param obj String
   * @return true when added succesfully, false if not added succssfully
   */
  public abstract boolean offer(String obj);
  /**
   * deletes and returns the first element
   *
   * @return element of 1st element, null if nothing there
   */
  public abstract String poll();
  /**
   * deletes the first element
   *
   * @throws NoSuchElementException if no element to delete
   */
  public abstract String remove();
  /**
   * returns the first element without deleting
   *
   * @return element of 1st element, null if nothing there
   */
  public abstract String peek();
  /**
   * returns the first element with error if null
   *
   * @return element of 1st element, null if nothing there
   */
  public abstract String element();
}