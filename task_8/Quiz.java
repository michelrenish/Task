package task_8;

import java.util.*;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
        loadQuestions();
    }

    private void loadQuestions() {
        questions.add(new Question(
            "What is the capital of India?",
            new String[]{"a) Mumbai", "b) Delhi", "c) Kolkata", "d) Chennai"},
            'b'));

        questions.add(new Question(
            "Which language runs in a web browser?",
            new String[]{"a) Java", "b) C", "c) Python", "d) JavaScript"},
            'd'));

        questions.add(new Question(
            "Who is the founder of Microsoft?",
            new String[]{"a) Steve Jobs", "b) Elon Musk", "c) Bill Gates", "d) Mark Zuckerberg"},
            'c'));

        questions.add(new Question(
            "Which keyword is used to create a subclass in Java?",
            new String[]{"a) implement", "b) extends", "c) inherit", "d) override"},
            'b'));

        questions.add(new Question(
            "What does HTML stand for?",
            new String[]{"a) Hyper Text Markup Language", "b) Home Tool Markup Language", "c) Hyperlinks and Text Markup Language", "d) None"},
            'a'));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Online Quiz App!\n");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Q" + (i + 1) + ": " + q.getQuestionText());
            for (String option : q.getOptions()) {
                System.out.println(option);
            }
            System.out.print("Your answer (a/b/c/d): ");
            char answer = scanner.next().charAt(0);

            if (q.isCorrect(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.getCorrectOption() + "\n");
            }
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + "/" + questions.size());
        scanner.close();
    }
}
