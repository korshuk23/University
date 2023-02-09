package classes.projects.university;

public class Student extends Person {
    private int course;
    private Courses trainingCourses;
    private double academicPerformance;

    private String faculty;

    public Student(String firstName, String lastName, int course) {
        super(firstName, lastName);
        this.course = course;
        this.faculty = null;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Courses getTrainingCourses() {
        return trainingCourses;
    }

    public void setTrainingCourses(Courses trainingCourses) {
        this.trainingCourses = trainingCourses;
    }

    public double getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(double academicPerformance) {
        if (academicPerformance >= 0 && academicPerformance <= 10) {
            this.academicPerformance = academicPerformance;
        } else {
            System.out.println("Mark " + academicPerformance + " isn't valid. Current average mark " + this.academicPerformance);
        }
    }
}
