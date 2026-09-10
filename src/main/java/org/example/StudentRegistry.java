package org.example;
import java.util.Iterator;
import java.util.ArrayList;

public class StudentRegistry {
    private ArrayList<Student> students = new ArrayList<>();

    public StudentRegistry() {

    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        StudentRegistry registry = new StudentRegistry();

        Student student1 = new Student("V100001", "Drake", 67);
        registry.addStudent(student1);

        Student student2 = new Student("V100002", "Kendrick", 40);
        registry.addStudent(student2);

        Student student3 = new Student("V100003", "Maes", 59.9);
        registry.addStudent(student3);

        Student student4 = new Student("V100004", "Gims", 55.9);
        registry.addStudent(student4);

        Student student5 = new Student("V100005", "la rvfleuze", 99.9);
        registry.addStudent(student5);

        Student s = registry.findStudent("V100001");
        System.out.println(s);


    }

    public void addStudent(Student student) {

        this.students.add(student);
    }

    public Student findStudent(String id) {

        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public boolean removeStudent(String id) {
        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            Student student = it.next();

            if (student.getId().equals(id)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public double calculateAverage() {
        double finalAverage = 0;
        for (Student student : students) {
            finalAverage = finalAverage + student.getAverage();
        }
        finalAverage = finalAverage / students.size();
        return finalAverage;
    }

    public Student findHighestAverage() {

        Student topStudent = students.get(0);

        for (Student student : students) {
            if (student.getAverage() > topStudent.getAverage()) {
                topStudent = student;
            }
        }
        return topStudent;
    }

    public int countAbove(double threshold) {
        int count = 0;
        for (Student student : students) {
            if (student.getAverage() > threshold) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return ("numberOfStudent =" + students.size() + "students=" + students);
    }
}
