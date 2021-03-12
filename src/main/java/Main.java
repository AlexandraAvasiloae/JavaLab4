
import java.util.*;
import java.util.stream.IntStream;
import student.Student;
import school.School;

public class Main {
    public static void main(String[] args) {

        Student[] students = IntStream.rangeClosed(0, 3).mapToObj(i -> new Student("S" + i) ).toArray(Student[]::new);

        School[] schools = IntStream.rangeClosed(0,2).mapToObj(i->new School("H"+i)).toArray(School[]::new);
        schools[0].setCapacity(3);
        schools[1].setCapacity(2);
        schools[2].setCapacity(7);

        LinkedList<Student> studentLinkedList=new LinkedList<Student>(Arrays.asList(students));

        List<Student> sortedStudentList = new LinkedList<>(studentLinkedList);
        sortedStudentList.sort(Comparator.comparing(Student::getName));

        TreeSet<School> SchoolSet = new  TreeSet<School>(Arrays.asList(schools));

        Map<Student, List<School>> studentsPreferences = new HashMap();
        studentsPreferences.put(students[0],Arrays.asList(schools[0],schools[1],schools[2]));
        studentsPreferences.put(students[1],Arrays.asList(schools[0],schools[1],schools[2]));
        studentsPreferences.put(students[2], Arrays.asList(schools[0],schools[1]));
        studentsPreferences.put(students[3], Arrays.asList(schools[0],schools[2]));

        Map<School,List<Student>> schoolsPreferences = new TreeMap();
        schoolsPreferences.put(schools[0],Arrays.asList(students[3],students[0],students[1],students[2]));
        schoolsPreferences.put(schools[1],Arrays.asList(students[0],students[2],students[1]));
        schoolsPreferences.put(schools[2],Arrays.asList(students[0],students[1],students[3]));

        System.out.println("Student preferences are: ");
        System.out.println(studentsPreferences);
        System.out.println("School preferences are: ");
        System.out.println(schoolsPreferences);

    }

}
