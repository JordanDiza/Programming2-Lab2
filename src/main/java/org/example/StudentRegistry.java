package org.example;

public class StudentRegistry {
    private ArrayList<Student> students;

    public static void main(String[] args) {

    }

    public StudentRegistry() {

    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudent(String id) {
        for (Student student : students) {
            if (student.getID().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public boolean removeStudent(String id) {

    }

    public double calculateAverage() {
        double finalAverage = 0;
        for (Student student : students) {
            finalAverage = finalAverage + student.getAverage();
        }
        finalAverage = finalAverage / students.size();
        return finalAverage;
    }
}

    public Student findHighestAverage(){

    }

    public int countAbove(double threshold){
        int count = 0;
        for(Student student : students){
            if(student.getAverage() > threshold){
                count ++;
            }
        }
        return count;
    }

    @Override
    public String toString(){
        return ("Student ID:" + "" + id + "" + "Student Name:" + "" + name + "" + "Student Average:" + "" + average);
    }
}


