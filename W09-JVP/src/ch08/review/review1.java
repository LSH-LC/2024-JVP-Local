package ch08.review;

public class review1 {
    public static void main(String[] args) {
        String grade;
        int score = (int)(Math.random() * 100 + 1);

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("������ " + score + "�̰�, ������ " + grade + "�Դϴ�.");
    }
}
