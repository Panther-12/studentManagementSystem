public class Course {
    private String code;
    private String title;
    private Lecturer lecturer;
    
    // Constructor
    public Course(String code, String title, Lecturer lecturer) {
        this.code = code;
        this.title = title;
        this.lecturer = lecturer;
    }
    
    // Getters and Setters
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Lecturer getLecturer() {
        return lecturer;
    }
    
    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
