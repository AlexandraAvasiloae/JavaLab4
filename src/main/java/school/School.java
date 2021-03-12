package school;

import java.util.Objects;

public class School implements Comparable<School>{
    private String name;
    private int capacity;

    /**
     * Constructor
     * @param name
     */
    public School(String name){
        this.name=name;
        this.capacity=capacity;
    }

    /**
     * compare schools by their names
     * @param o
     * @return
     */
    public int compareTo(School o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return capacity == school.capacity && Objects.equals(name, school.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
    /**
     * getter for name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for capacity
     * @return
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * setter for capacity
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
