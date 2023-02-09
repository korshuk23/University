package classes.projects.university;

import java.util.Arrays;

public class Group {
    private String groupName;
    private String faculty;
    private Teacher curator;
    private final Student[] students = new Student[8];
    private int currCountOfStudents;

    public Group(String groupName, String faculty, Teacher curator) {
        this.groupName = groupName;
        this.faculty = faculty;
        this.curator = curator;
    }

    public Teacher getCurator() {
        return curator;
    }

    public void setCurator(Teacher curator) {
        this.curator = curator;
    }

    public Student[] getStudents() {
        return students.clone();
    }

    public void printTrainingCoursesInfo() {
        System.out.println("\t\t\t\t Group: " + groupName);
        for (Student student : students) {
            if (student.getTrainingCourses() != null) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " - studying in " + student.getTrainingCourses());
            } else {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " - [not enroll at any courses]");
            }
        }
    }

    public boolean addStudents(Student... studentsToAdd) {
        boolean isAdded = false;
        if (studentsToAdd.length <= students.length - currCountOfStudents) {
            for (Student stud : studentsToAdd) {
                if (currCountOfStudents <= students.length) {
                    students[currCountOfStudents++] = stud;
                    isAdded = true;
                }
            }
        }
        return isAdded;
    }

    public boolean deleteStudent(long id) {
        boolean isDeleted = false;
        int initialNumber = currCountOfStudents;
        for (int i = 0; i < initialNumber; i++) {
            if (!isDeleted && students[i].getId() == id) {
                students[i] = null;
                currCountOfStudents--;
                isDeleted = true;
            }
            if (isDeleted && i < students.length - 1) {
                students[i] = students[i + 1];
                students[i + 1] = null;
            }
        }
        return isDeleted;
    }

    @Override
    public String toString() {
        String output = "";
        Student student;
        System.out.println("\t\t\t\tGroup name: " + groupName + ",\n" +
                "\tFaculty: " + faculty + ",\n " +
                "\t  Students count: "
                + currCountOfStudents + ", curator: " + curator.getFirstName() + " " + curator.getLastName());
        System.out.println("id\tFirst name\tLast name\t Course\t\tAcademic performance");
        for (int i = 0; i < currCountOfStudents; i++) {
            student = students[i];
            output = output.concat(student.getId() + "\t" + student.getFirstName() + "\t\t" + student.getLastName()
                    + "  \t\t" + student.getCourse() + "\t\t\t\t" + student.getAcademicPerformance() + "\n");
        }
        return output;
    }
}
