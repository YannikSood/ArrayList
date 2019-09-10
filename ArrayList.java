/**
 * ArrayList Class
 * 
 * ArrayList is a part of collection framework and is present in java.util package. It provides us dynamic arrays in Java. 
 * Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
 * ArrayList is initialized by a size, however the size can increase if collection grows or shrunk if objects are removed from the collection.
 * Java ArrayList allows us to randomly access the list.
 * ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases (see this for details).
 * ArrayList in Java can be seen as similar to vector in C++.
 * 
 * @author yanniksood
 *
 */
public class ArrayList<Y> {
    private int size = 0;
    private static int DEFAULT_CAP = 10;
    private int capacity = 0;
    private Object elements [];
    
    /**
     * Initialize with default capacity
     */
    public ArrayList() {
        elements = new Object[DEFAULT_CAP];
        capacity = DEFAULT_CAP;
    }
    
    /**
     * Initialize with specified capacity
     * @param cap the capacity of the ArrayList
     */
    public ArrayList(int cap) {
        elements = new Object[cap];
        capacity = cap;
    }
    
    /**
     * Getter for Size
     * @return how many elements are in the ArrayList
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Getter for capacity
     * @return the capacity 
     */
    public int getCapacity() {
        return capacity;
    }
    
    /**
     * Add an element to the ArrayList. Double the size if capacity is reached.
     * @param object
     * @return
     */
    public void add(Object object) {
        elements[size] = object;
        size++;
        //Copy list, then Double size of the AL and copy new list
        if (size == capacity) {
            Object[] temp = elements.clone();
            elements = new Object[capacity * 2];
            System.arraycopy(temp, 0, elements, 0, size);
            capacity = capacity * 2;
        }
        
    }
    
    /**
     * Delete the last object in the ArrayList
     */
    public void delete() {
        if (size == 0) {
            return;
        }
        size--;
    }
    
    /**
     * Get the object at the index
     * @param index to get from
     */
    public Object get(int index) {
        if (index >= capacity) {
            return null;
        }
        return elements[index];
    }
}
