package student;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparator<Student> {

    private String name;
    public Student(String name){
        this.name=name;
    }
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    /**
     * getter for name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
