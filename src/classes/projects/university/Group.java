package classes.projects.university;

import java.util.Arrays;

public class Group {
    private Teacher curator;
    private Student[] students = new Student[8];
    private int currCountOfStudents;

    public Teacher getCurator() {
        return curator;
    }

    public void setCurator(Teacher curator) {
        this.curator = curator;
    }

    public Student[] getStudents() {
        return students;
    }

    public boolean addStudents(Student... studentsToAdd) {
        boolean isAdded = false;
        for (Student stud : studentsToAdd) {
            if (studentsToAdd.length <= students.length && currCountOfStudents <= students.length) {
                students[currCountOfStudents++] = stud;
                isAdded = true;
            }
            isAdded = false;
        }
        return isAdded;
    }

    public boolean deleteStudent(int id) {
        boolean isDeleted = false;
        for (int i = 0; i < students.length; i++) {
            if (!isDeleted && students[i].getId() == id) {
                students[i] = students[i + 1];
                currCountOfStudents--;
                isDeleted = true;
            }
            if (isDeleted & i < students.length - 1) {
                students[i] = students[i + 1];
            }
        }
        return isDeleted;
    }

    @Override
    public String toString() {
        return "Group\n" +
                "[Curator is " + curator + "]\n" +
                Arrays.toString(students) +
                "Count of students in group is " + currCountOfStudents;
    }
}
