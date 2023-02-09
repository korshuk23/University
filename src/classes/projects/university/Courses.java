package classes.projects.university;

public enum Courses {
    JAVA_FUNDAMENTALS_COURSE("\"Java fundamentals course\""),
    JAVA_CORE_COURSE("\"Java core course\""),
    JAVA_WEB_COURSE("\"Java web course\""),
    PYTHON_COURSE("\"Python course\""),
    JAVASCRIPT_COURSE("\"Javascript course\""),
    GOLANG_COURSE("\"Golang course\"");
    private final String title;
    Courses(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
