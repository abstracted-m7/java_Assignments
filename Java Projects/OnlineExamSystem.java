import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;
    private String name;
    private int age;

    public User(String username, String password, String name, int age) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password updated successfully.");
    }

    public void updateProfile(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
        System.out.println("Profile updated successfully.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Question {
    private String questionText;
    private Map<String, String> options;
    private String correctAnswer;

    public Question(String questionText, Map<String, String> options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public boolean isCorrectAnswer(String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }
}

class Exam {
    private ArrayList<Question> questions;
    private int timeLimitMinutes;

    public Exam(ArrayList<Question> questions, int timeLimitMinutes) {
        this.questions = questions;
        this.timeLimitMinutes = timeLimitMinutes;
    }

    public void startExam(User user) {
        System.out.println("Welcome, " + user.getName() + "!");
        System.out.println("You have " + timeLimitMinutes + " minutes to complete the exam.");

        Scanner scanner = new Scanner(System.in);
        int totalQuestions = questions.size();
        int correctAnswers = 0;

        // Timer
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (timeLimitMinutes * 60 * 1000);

        for (int i = 0; i < totalQuestions; i++) {
            Question currentQuestion = questions.get(i);

            System.out.println("\nQuestion " + (i + 1) + ": " + currentQuestion.getQuestionText());

            Map<String, String> options = currentQuestion.getOptions();
            for (Map.Entry<String, String> entry : options.entrySet()) {
                System.out.println(entry.getKey() + ". " + entry.getValue());
            }

            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (currentQuestion.isCorrectAnswer(userAnswer)) {
                correctAnswers++;
            }
        }

        // Check if time is up
        long currentTime = System.currentTimeMillis();
        if (currentTime < endTime) {
            System.out.println("\nExam completed. You answered " + correctAnswers + " out of " + totalQuestions + " questions correctly.");
        } else {
            System.out.println("\nTime is up! Exam not completed.");
        }
    }
}

public class OnlineExamSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample questions
        ArrayList<Question> questions = new ArrayList<>();
        Map<String, String> options = new HashMap<>();
        options.put("A", "West Bengal A");
        options.put("B", "Gujrat");
        options.put("C", "Delhi");
        options.put("D", "Rajpur");
        Question question1 = new Question("What is the capital of India?", options, "C");
        Question question2 = new Question("What is the largest planet in our solar system?", options, "B");
        questions.add(question1);
        questions.add(question2);

        // Sample user
        User user = new User("manishgiri", "1234", "Manish giri", 21);

        // Sample exam
        Exam exam = new Exam(questions, 10); // 10 minutes time limit

        int choice;
        do {
            System.out.println("\n1. Login");
            System.out.println("2. Update Profile");
            System.out.println("3. Update Password");
            System.out.println("4. Start Exam");
            System.out.println("5. Logout");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Login
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();

                    if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                        System.out.println("Login successful.");
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;

                case 2:
                    // Update Profile
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();

                    user.updateProfile(newName, newAge);
                    break;

                case 3:
                    // Update Password
                    System.out.print("Enter current password: ");
                    String currentPassword = scanner.nextLine();

                    if (currentPassword.equals(user.getPassword())) {
                        System.out.print("Enter new password: ");
                        String newPassword = scanner.nextLine();

                        user.setPassword(newPassword);
                    } else {
                        System.out.println("Incorrect current password.");
                    }
                    break;

                case 4:
                    // Start Exam
                    exam.startExam(user);
                    break;

                case 5:
                    // Logout
                    System.out.println("Logout successful.");
                    break;

                case 6:
                    System.out.println("Exiting the Online Exam System. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }
}
