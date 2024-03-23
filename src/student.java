public class student implements Comparable {
    private String name;
    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private int Score;

    public void setScore(int score) {
        Score = score;
    }

    public int getScore() {
        return Score;
    }

    public student(String name, int studentId, int score) {
        this.name = name;
        this.studentId = studentId;
        Score = score;
    }

    @Override
    public String toString() {
        String result;
        result = "学生姓名："+this.getName()+" 学生分数："+this.getScore()+" 学生ID:"+this.getStudentId();
        return result;
    }

    @Override
    public int compareTo(Object o) {
        student s = (student) o ;
        return this.getScore()-s.getScore();
    }
}
