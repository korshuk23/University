package classes.projects.university;

public class Runner {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Alla", "Grishko", "Math faculty", "Doctor of the science");
        Group group = new Group();
        group.setCurator(teacher);
        //System.out.println(group);
        Student student = new Student(1, "Nikolai", "Sergeev", 3, 9);
        Student student1 = new Student(2, "Sergei", "Egorov", 3, 9);
        Student student2 = new Student(3, "Andrei", "Ivanov", 3, 9);
        group.addStudents(student, student1, student2, student, student, student, student, student);
        System.out.println(group);
        group.deleteStudent(2);
        System.out.println(group);

    }
}
