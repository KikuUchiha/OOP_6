package ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }


    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }


    public List<Student> getStudents() {
        return students;
    }
}