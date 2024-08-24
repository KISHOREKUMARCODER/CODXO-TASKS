package Quiz;

import java.util.Scanner;

public class OnlineQuiz {
    private static String[] questions = {
        "1. What is the capital of France?\nA. Berlin\nB. Madrid\nC. Paris\nD. Rome",
        "2. Which planet is known as the Red Planet?\nA. Earth\nB. Mars\nC. Jupiter\nD. Venus",
        "3. Who wrote 'Hamlet'?\nA. Charles Dickens\nB. Mark Twain\nC. William Shakespeare\nD. Leo Tolstoy",
        "4. What is the largest ocean on Earth?\nA. Atlantic Ocean\nB. Indian Ocean\nC. Arctic Ocean\nD. Pacific Ocean",
        "5. What is the chemical symbol for water?\nA. O2\nB. H2O\nC. CO2\nD. NaCl"
    };

    private static char[] answers = {'C', 'B', 'C', 'D', 'B'};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Online Quiz!");
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);
            
            if (userAnswer == answers[i]) {
                score++;
            }
        }
        
        System.out.println("You scored: " + score + " out of " + questions.length);
        scanner.close();
    }
}
