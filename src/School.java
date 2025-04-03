import java.util.ArrayList;
import java.util.List;

public class School {
    //Declare a list to hold students
    private List<Student> students; //Declare a list to hold students (student Objects)

    public School() {
        students = new ArrayList<>();
    }

    public void addStudents(Student student) {
        students.add(student);  // Add a student to the list. new student ijnstance passed

    }

    public void displayStudents() {
        System.out.println("List of all Students: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public Student findStudent(Student studentToFind) {
        //Object: {firstName='Peter', lastName='Jorden', studentID=2}
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(studentToFind)) { //using equals instead of == for object conparision
                return students.get(i);
            }
        }
        return null;
    }
    //Remove Student
    public Student removeStudent(Student studentToRemove) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).equals(studentToRemove)) {
                students.remove(studentToRemove);
               return students.get(i);
            }
        }
        return null;
    }
}

//student class holds student data and School class: add remove Students
