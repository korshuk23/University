package classes.projects.university;

public class Runner {
    public static void main(String[] args) {
        fillGroup();

    }

    public static void fillGroup() {
        Teacher teacher = new Teacher("Alla", "Grishko", "Math faculty", "Doctor of the science");
        Teacher teacher2 = new Teacher("Nina", "Egorova", "Math faculty", "Doctor of the science");
        Group group = new Group("A001", "Informational Technologies Faculty", teacher);
        group.setCurator(teacher);
        Student student1 = new Student("Nikolai", "Sergeev", 3);
        Student student2 = new Student("Sergei", "Egorov", 3);
        Student student3 = new Student("Andrei", "Ivanov", 3);
        Student student4 = new Student("Alexei", "Petrov", 3);
        Student student5 = new Student("Ivan", "Artemov", 3);
        Student student6 = new Student("Petr", "Andreev", 3);
        Student student7 = new Student("Artem", "Nikolaev", 3);
        Student student8 = new Student("Vitaliy", "Alexeev", 3);
        group.addStudents(student1, student2, student3, student4, student5, student6, student7, student8);
        student1.setAcademicPerformance(6.7);
        student2.setAcademicPerformance(9.0);
        student3.setAcademicPerformance(8.8);
        student4.setAcademicPerformance(7.6);
        student5.setAcademicPerformance(9.5);
        student6.setAcademicPerformance(4.5);
        student7.setAcademicPerformance(6.6);
        student8.setAcademicPerformance(7.2);
        System.out.println(group + "\n");

        System.out.println("\n\t\t\t\t After deleting\n");
        group.deleteStudent(student2.getId());
        group.deleteStudent(student7.getId());
        System.out.println(group);


        System.out.println("\n\t\t\t\t After adding\n");
        group.addStudents(student1, student2);
        System.out.println(group);


        System.out.println("\n\t\t\tTraining courses info");
        student4.setTrainingCourses(Courses.JAVA_WEB_COURSE);
        student5.setTrainingCourses(Courses.GOLANG_COURSE);
        group.printTrainingCoursesInfo();
    }
}
