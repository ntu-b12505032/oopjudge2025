/**
 * A custom resizable array implementation that stores Integer elements.
 * Provides methods to add, get, set, remove elements, and perform operations
 * like retainAll, clear, and size queries.
 *
 * <p>This class does not use any built-in List implementation.
 */
public class SimpleArrayList {
    private Integer[] data;
    private int size;

    /**
     * Constructs an empty SimpleArrayList with initial size zero.
     */
    public SimpleArrayList() {
        data = new Integer[0];
        size = 0;
    }

    /**
     * Constructs a SimpleArrayList with the given initial size,
     * and initializes all elements to zero.
     *
     * @param initialSize the initial number of elements (non-negative)
     */
    public SimpleArrayList(int initialSize) {
        data = new Integer[initialSize];
        for (int i = 0; i < initialSize; i++) {
            data[i] = 0;
        }
        size = initialSize;
    }

    /**
     * Appends the specified element to the end of this array.
     *
     * @param i the Integer to be appended
     */
    public void add(Integer i) {
        Integer[] newData = new Integer[size + 1];
        for (int j = 0; j < size; j++) {
            newData[j] = data[j];
        }
        newData[size] = i;
        data = newData;
        size++;
    }

    /**
     * Returns the element at the specified index, or null if out of range.
     *
     * @param index the index of the element to return
     * @return the Integer at the specified position, or null if out of range
     */
    public Integer get(int index) {
        if (index < 0 || index >= size) return null;
        return data[index];
    }

    /**
     * Replaces the element at the specified index with the given element.
     *
     * @param index   the index to replace
     * @param element the new element
     * @return the original element at the specified index, or null if out of range
     */
    public Integer set(int index, Integer element) {
        if (index < 0 || index >= size) return null;
        Integer old = data[index];
        data[index] = element;
        return old;
    }

    /**
     * Removes the element at the specified index, shifting subsequent elements left.
     *
     * @param index the index of the element to be removed
     * @return true if the element was removed successfully; false if index out of bounds or element is null
     */
    public boolean remove(int index) {
        if (index < 0 || index >= size || data[index] == null) return false;
        Integer[] newData = new Integer[size - 1];
        for (int i = 0, j = 0; i < size; i++) {
            if (i != index) {
                newData[j++] = data[i];
            }
        }
        data = newData;
        size--;
        return true;
    }

    /**
     * Removes all elements from the array, resetting its size to zero.
     */
    public void clear() {
        data = new Integer[0];
        size = 0;
    }

    /**
     * Returns the current number of elements in the array.
     *
     * @return the number of elements
     */
    public int size() {
        return size;
    }

    /**
     * Retains only the elements that are also contained in the specified SimpleArrayList.
     * Removes all elements not in the specified list.
     *
     * @param l the list containing elements to retain
     * @return true if any elements were removed; false otherwise
     */
    public boolean retainAll(SimpleArrayList l) {
        boolean changed = false;
        for (int i = 0; i < size; ) {
            if (!containsInList(l, data[i])) {
                remove(i);
                changed = true;
            } else {
                i++;
            }
        }
        return changed;
    }

    /**
     * Helper method to check if the specified value exists in the given list.
     *
     * @param l     the list to search
     * @param value the value to find
     * @return true if found, false otherwise
     */
    private boolean containsInList(SimpleArrayList l, Integer value) {
        for (int i = 0; i < l.size(); i++) {
            if (value == null && l.get(i) == null) return true;
            if (value != null && value.equals(l.get(i))) return true;
        }
        return false;
    }
}
