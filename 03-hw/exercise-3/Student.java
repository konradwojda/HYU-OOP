public class Student extends Person {
    public String identificationNumber;
    public int absentTime;
    private int scoresMidtermExam;
    private int scoresFinalExam;

    public Student(String firstName, String lastName, Address address,
                   String id, int absentTime, int midterm, int finalExam) {
        super(firstName, lastName, address);
        this.identificationNumber = id;
        this.absentTime = absentTime;
        setScoresMidtermExam(midterm);
        setScoresFinalExam(finalExam);
    }

    public void setScoresMidtermExam(int score) {
        if (score >= 0 && score <= 50)
            this.scoresMidtermExam = score;
        else
            throw new IllegalArgumentException();
    }

    public void setScoresFinalExam(int score) {
        if (score >= 0 && score <= 50)
            this.scoresFinalExam = score;
        else
            throw new IllegalArgumentException();
    }

    public int getScoresAltogether() {
        return scoresMidtermExam + scoresFinalExam;
    }

    public boolean passed() {
        return getScoresAltogether() > 60;
    }

    @Override
    public String toString() {
        return super.toString() + "\nID: " + identificationNumber +
               "\nAbsent Time: " + absentTime +
               "\nMidterm: " + scoresMidtermExam +
               "\nFinal: " + scoresFinalExam +
               "\nTotal: " + getScoresAltogether() +
               "\nPassed: " + (passed() ? "Yes" : "No");
    }
}