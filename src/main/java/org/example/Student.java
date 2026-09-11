package org.example;
import java.util.ArrayList;


// Part C

public class Student {
    private String id;
    private String name;
    private double average;

    public Student(String id, String name, double average) {
        this.id = id;
        this.name = name;

        // Part D
        if (average < 0.0 || average > 100.0) {
            throw new Error("Average must be between 0 and 100");
        } else {
            this.average = average;
        }
    }

    public static void main(String[] args) {

        Student student = new Student("2532424", "Drake", 98);

        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Average: " + student.getAverage());
        // student1.setAverage(101.0);

        /*
       Student[] students = {
                new Student("V100001", "Amina", 86.5),
                new Student("V100002", "Daniel", 72.0),
                new Student("V100003", "Sofia", 91.0)
        };

        for (Student studentList : students) {
        System.out.println(studentList);
        }

        System.out.println(calculateAverage(students));
        System.out.println(findStudent(students, "V100002")); // it will return the student id, name, and average
        System.out.println(findStudent(students, "V999999")); // it return null because there is no studentID with V999999.
        */

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("V100001", "Amina", 86.5));
        students.add(new Student("V100002", "Daniel", 72.0));
        students.add(new Student("V100003", "Sofia", 91.0));
        students.add(new Student("V100004", "Drake", 50.0));
        students.add(new Student("V100005", "Lebron", 99.0));

        System.out.println(findStudent(students, "V100004"));
        System.out.println(findStudent(students, "V100009"));

        System.out.println(countAbove(students, 10.0));
        System.out.println(countAbove(students, 90.0));

    }

    public String getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        // Part D
        if (average < 0.0 || average > 100.0) {
            throw new Error("Average must be between 0 and 100");
        } else {
            this.average = average;
        }
    }

    @Override
    public String toString() {

        return "Student ID:" + id + " " + "Student Name:" + name + " " + "Average:" + average;

    }

    //Part E
    public static double calculateAverage(Student[] students) {

        double finalAverage = 0;
        double calculatedAverage = 0;

        for (Student studentAvg : students) {
            finalAverage = finalAverage + studentAvg.getAverage();

        }
        calculatedAverage = finalAverage / students.length;
        return calculatedAverage;
    }

    public static Student findStudent(Student[] students, String id) {

        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    // Part F

    public static Student findStudent(ArrayList<Student> students, String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public static int countAbove(ArrayList<Student> students, double threshold){
        int count = 0;

        for(Student student : students){
            if(student.getAverage() > threshold){
                count++;
            }
        }
        return count;
    }

}

//Part G
/*
G1:
G2:
G3:
G4:
G5:
 */

//Part H
/*
1. Average is 95
2.  Average is 95
3. they are 2 reference variables
4.  No
5. Create another student

 */




