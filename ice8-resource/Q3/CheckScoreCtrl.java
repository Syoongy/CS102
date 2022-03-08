

public class CheckScoreCtrl {
    private QuizDAO quizDAO;

    public CheckScoreCtrl() {
        quizDAO = new QuizDAO();
    }

    public double calculateDifferenceFromAverage(String studentName, String quizName) throws IllegalArgumentException {
        double diff = 0.0;
        Quiz retQuiz = quizDAO.retrieve(quizName);
        if (retQuiz == null) {
            throw new IllegalArgumentException("No such quiz.\n");
        }
        Student retStudent = retQuiz.getStudent(studentName);
        if (retStudent == null) {
            throw new IllegalArgumentException("No such student.\n");
        }

        double avgScore = retQuiz.getAverageScore();
        int score = retStudent.getScore();
        diff = score - avgScore;

        return diff;
    }
}
