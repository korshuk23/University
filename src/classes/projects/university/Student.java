package classes.projects.university;

public class Student extends Person{
    private int course;
    private double academicPerformance;

    public Student(int id, String firstName, String lastName, int course, double academicPerformance) {
        super(id,firstName, lastName);
        this.course = course;
        this.academicPerformance = academicPerformance;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(double academicPerformance) {
        this.academicPerformance = academicPerformance;
    }
}
