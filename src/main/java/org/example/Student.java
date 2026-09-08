package org.example;

// Part C

public class Student {
    private String id;
    private String name;
    private double average;

    public static void main(String[] args) {

        Student student = new Student("2532424", "Drake", 98);
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Average: " + student.getAverage());
        // student1.setAverage(101.0);

        Student[] students = {
                new Student("V100001", "Amina", 86.5),
                new Student("V100002", "Daniel", 72.0),
                new Student("V100003", "Sofia", 91.0)};


        for (Student studentList : students) {
        System.out.println(studentList);
        }

        System.out.println(calculateAverage(students));


        System.out.println(findStudent(students, "V100002"));



    }

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
    /*
    public static Student findStudent(ArrayList<Student> students, String id){

    }

    public static int countAbove(ArrayList<Student> students, double threshold){

    }
    */
}





