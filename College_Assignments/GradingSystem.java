public class GradingSystem {
    public static void main(String[] args) {
        double percentage = 91.1;
        char grade;
        if(percentage >= 90) {
            grade = 'A';
        } else if(percentage >= 80) {
            grade = 'B';
        } else if(percentage >= 70) {
            grade = 'C';
        } else if(percentage >= 60) {
            grade = 'D';
        } else if(percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
    }
}
