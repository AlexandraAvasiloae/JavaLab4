
import java.util.*;
import java.util.stream.IntStream;
import student.Student;
import school.School;

public class Main {
    public static void main(String[] args) {

        Student[] students = IntStream.rangeClosed(0, 3).mapToObj(i -> new Student("S" + i) ).toArray(Student[]::new);

        School[] schools = IntStream.rangeClosed(0,2).mapToObj(i->new School("H"+i)).toArray(School[]::new);
        schools[0].setCapacity(1);
        schools[1].setCapacity(2);
        schools[2].setCapacity(2);


        LinkedList<Student> studentsLinkedList=new LinkedList<Student>();
        studentsLinkedList.add(students[0]);
        studentsLinkedList.addFirst(students[1]);
        studentsLinkedList.addLast(students[2]);
        studentsLinkedList.add(2, students[3]);

        List<Student> sortedStudentList = new LinkedList<>();
        sortedStudentList.sort(Comparator.comparing(Student::getName));

        TreeSet<School> treeSetOfSchools = new TreeSet<>();
        treeSetOfSchools.add(schools[2]);
        treeSetOfSchools.add(schools[0]);
        treeSetOfSchools.add(schools[1]);
        List<Student> studentLinkedList = new LinkedList<>();
        sortedStudentList.sort(Comparator.comparing(Student::getName));


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
