import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class Student extends Person {
    private static final List<Course> Course = null;
    private String regNumber;
    private String program;
    private List<Course> courses = new ArrayList<>();
    
    // Constructor
    public Student(String name, String address, String phoneNumber, String email, String regNumber, String program) {
        super(name, address, phoneNumber, email);
        this.regNumber = regNumber;
        this.program = program;
    }
    
    // Getters and Setters
    public String getRegNumber() {
        return regNumber;
    }
    
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
    
    public String getProgram() {
        return program;
    }
    
    public void setProgram(String program) {
        this.program = program;
    }
    
    public List<Course> getCourses() {
        return Course;
    }
    
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    
    // Add a course to student's list of courses
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    // Remove a course from student's list of courses
    public void removeCourse(Course course) {
        courses.remove(course);
    }
    
    // Get the student's result slip
    public String getResultSlip() {
        String resultSlip = "Result Slip for " + getName() + "\n\n";
        int totalScore = 0;
        int totalCourses = courses.size();
        
        // Iterate over the student's courses
        for (Course course : courses) {
            Score score = getScore(course);
            String grade = score.getGrade();
            
            // Update total score
            totalScore += score.getTotalScore();
            
            // Add course details to result slip
            resultSlip += course.getCode() + " - " + course.getTitle() + "\n";
            resultSlip += "CAT Score: " + score.getCatScore() + "\n";
            resultSlip += "Exam Score: " + score.getExamScore() + "\n";
            resultSlip += "Grade: " + grade + "\n\n";
        }
        
        // Calculate average score and grade
        int averageScore = totalScore / totalCourses;
        String averageGrade = new Score(averageScore, 0).getGrade();
        
        // Add average to result slip
        resultSlip += "Average Score: " + averageScore + "\n";
        resultSlip += "Average Grade: " + averageGrade + "\n";
        
        return resultSlip;
    }
    
    // Get the student's score for a particular course
    public Score getScore(Course course) {
        // TODO: Implement database logic to retrieve score for student and course
        // For now, return a random score between 0 and 100
        Random random = new Random();
        int catScore = random.nextInt(31);
        int examScore = random.nextInt(71);
        return new Score(catScore, examScore);
    }
}
