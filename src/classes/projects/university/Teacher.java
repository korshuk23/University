package classes.projects.university;

public class Teacher extends Person {
    private String faculty;
    private String academicDegree;

    public Teacher(String firstName, String lastName, String faculty, String academicDegree) {
        super(firstName, lastName);
        this.faculty = faculty;
        this.academicDegree = academicDegree;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }


}
