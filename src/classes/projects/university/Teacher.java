package classes.projects.university;

public class Teacher extends Person {
    private String faculty;
    private String academicDegree;

    public Teacher(int id, String firstName, String lastName, String faculty, String academicDegree) {
        super(id, firstName, lastName);
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
