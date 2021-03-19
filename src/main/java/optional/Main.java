package optional;

import com.github.javafaker.Faker;
import optional.sap.Matching;
import optional.sap.Problem;
import optional.school.School;
import optional.student.Student;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();

        Student[] students = IntStream.rangeClosed(0, 3).mapToObj(i -> new Student(faker.name().fullName())).toArray(Student[]::new);

        School[] schools = IntStream.rangeClosed(0, 2).mapToObj(i -> new School(faker.company().name())).toArray(School[]::new);

        schools[0].setCapacity(1);
        schools[1].setCapacity(2);
        schools[2].setCapacity(2);

        System.out.println("The candidates are: ");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName());
        }
        System.out.println("\n");
        System.out.println("The schools are: ");
        for (int i = 0; i < schools.length; i++) {
            System.out.println(schools[i].getName() + " with " + schools[i].getCapacity() + " available places");
        }
        System.out.println("\n");
        Problem p1 = new Problem(students, schools);
        p1.addStudentPreferences(students[0], Arrays.asList(schools[0], schools[1], schools[2]));
        p1.addStudentPreferences(students[1], Arrays.asList(schools[0], schools[1], schools[2]));
        p1.addStudentPreferences(students[2], Arrays.asList(schools[0], schools[1]));
        p1.addStudentPreferences(students[3], Arrays.asList(schools[0], schools[2]));

        p1.addSchoolPreferences(schools[0], Arrays.asList(students[3], students[0], students[1], students[2]));
        p1.addSchoolPreferences(schools[1], Arrays.asList(students[0], students[2], students[1]));
        p1.addSchoolPreferences(schools[2], Arrays.asList(students[0], students[1], students[3]));

        System.out.println("The students preferences are: ");
        for (Map.Entry<Student, List<School>> entry : p1.getStudentsPreferences().entrySet()) {
            System.out.println(entry.getKey().getName() + " prefers: ");
            for (School h : entry.getValue()) {
                System.out.println(h.getName());
            }
            System.out.println("\n");
        }
        System.out.println("The schools preferences are: ");
        for (Map.Entry<School, List<Student>> entry : p1.getSchoolsPreferences().entrySet()) {
            System.out.println(entry.getKey().getName() + " prefers: ");
            for (Student s : entry.getValue()) {
                System.out.println(s.getName());
            }
            System.out.println("\n");
        }

        //Using Java Stream API, write queries that display the students who find acceptable a given list of schools, and the schools that have a given student as their top preference.
        System.out.println("The list of acceptable school for " + students[0].getName() + " is " + p1.getListOfAcceptableSchools(students[0].getName()));
        System.out.println("\n");
        System.out.println(schools[0].getName() + "'s favorite stundet is " + p1.getFavoriteStudent(schools[0].getName()));
        System.out.println("\n");

        Matching solution = new Matching(p1);
        solution.getMatching();


    }
}
