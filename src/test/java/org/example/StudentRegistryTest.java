package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRegistryTest {

    @Test
    void testAddStudent() {
        StudentRegistry registry = new StudentRegistry();
        Student student = new Student("V100001", "Drake", 67.0);

        registry.addStudent(student);

        assertNotNull(registry.findStudent("V100001"));
        assertEquals("Drake", registry.findStudent("V100001").getName());
    }

    @Test
    void testFindExisting() {
        StudentRegistry registry = new StudentRegistry();
        registry.addStudent(new Student("V100001", "Drake", 67.0));

        Student found = registry.findStudent("V100001");

        assertNotNull(found);
        assertEquals("Drake", found.getName());
    }

    @Test
    void testFindMissing() {
        StudentRegistry registry = new StudentRegistry();

        Student found = registry.findStudent("V999999");

        assertNull(found);
    }

    @Test
    void testRemoveExisting() {
        StudentRegistry registry = new StudentRegistry();
        registry.addStudent(new Student("V100001", "Drake", 67.0));

        boolean isRemoved = registry.removeStudent("V100001");

        assertTrue(isRemoved);
        assertNull(registry.findStudent("V100001"));
    }

    @Test
    void testRemoveMissing() {
        StudentRegistry registry = new StudentRegistry();

        boolean isRemoved = registry.removeStudent("V999999");

        assertFalse(isRemoved);
    }

    @Test
    void testCalculateAverage() {
        StudentRegistry registry = new StudentRegistry();
        registry.addStudent(new Student("V100001", "Drake", 60.0));
        registry.addStudent(new Student("V100002", "Kendrick", 80.0));

        double avg = registry.calculateAverage();

        assertEquals(70.0, avg);
    }

    @Test
    void testFindHighestAverage() {
        StudentRegistry registry = new StudentRegistry();
        registry.addStudent(new Student("V100001", "Drake", 60.0));
        registry.addStudent(new Student("V100002", "Kendrick", 90.0));

        Student top = registry.findHighestAverage();

        assertNotNull(top);
        assertEquals("Kendrick", top.getName());
    }

    @Test
    void testEmptyRegistry() {
        StudentRegistry registry = new StudentRegistry();

        assertNull(registry.findStudent("V100001"));
        assertFalse(registry.removeStudent("V100001"));
        assertNull(registry.findHighestAverage());
    }

    @Test
    void testInvalidAverage() {
        StudentRegistry registry = new StudentRegistry();

        double avg = registry.calculateAverage();

        assertEquals(0.0, avg);
    }
}