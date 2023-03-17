public class Score {
    private int catScore;
    private int examScore;
    
    // Constructor
    public Score(int catScore, int examScore) {
        this.catScore = catScore;
        this.examScore = examScore;
    }
    
    // Getters and Setters
    public int getCatScore() {
        return catScore;
    }
    
    public void setCatScore(int catScore) {
        this.catScore = catScore;
    }
    
    public int getExamScore() {
        return examScore;
    }
    
    public void setExamScore(int examScore) {
        this.examScore = examScore;
    }
    
    // Calculate total score
    public int getTotalScore() {
        return catScore + examScore;
    }
    
    // Calculate grade
    public String getGrade() {
        int totalScore = getTotalScore();
        if (totalScore >= 80) {
            return "A";
        } else if (totalScore >= 70) {
            return "B";
        } else if (totalScore >= 60) {
            return "C";
        } else if (totalScore >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
