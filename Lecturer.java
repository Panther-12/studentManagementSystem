import java.util.ArrayList;
import java.util.List;

public class Lecturer extends Person {
    private List<Course> courses = new ArrayList<>();

    // Constructor
    public Lecturer(String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
    }

    // Getters and Setters
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    // Add a course to lecturer's list of courses
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Remove a course from lecturer's list of courses
    public void removeCourse(Course course) {
        courses.remove(course);
    }
}


   