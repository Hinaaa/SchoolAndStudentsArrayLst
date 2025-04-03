import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
Set, remove and clear method
Food.set(0, “sushi”) //set at index
Food.remove(2);
Food.clear(); //clear all

      //WrapperClass, int=>Integer
        */
        //Adding students
        //Students.add("Max","Jorden", 1); // Because multiple values so have to create object with this add
        List <Student> Students = new ArrayList<>(); //define list
        Student s1 =new Student("Max","John",1);
        Student s2 = new Student("Peter", "Jorden",2);
        Student s3 = new Student("Johny", "Doe",2);

        School school = new School();
        school.addStudents(s1);
        school.addStudents(s2);
        school.addStudents(s3);

        //calls display method from school
        //System.out.println(school); if wanted to print directly with toString() in school
        school.displayStudents();

        //find student
        System.out.println("Student "+ school.findStudent(s2)+" has been found");
        //System.out.println("The Student " + school.findStudent(s1) + " has been found");

        //remove Student
        System.out.println("Student: "+school.removeStudent(s1)+ " has been removed from the list");
        //Validate student has been removed:
        System.out.println("List of Recent Students, to Validate student has been removed");
        school.displayStudents();

    }
        // Student class is just using a data type where id etc has been defined
    // School is a master class to manage
    }
