package W05_JVP_Package;//gpt

public class W05_JVP_PP_02 {
    public static void main(String[] args) {
        String student1 = "math:85,calc:93,science:71";
        String student2 = "math:88,calc:71,science:92";
        
        // ������ ������ ����
        int mathSum = 0, calcSum = 0, scienceSum = 0;
        
        // �л��� ������ �迭�� ������
        String[] scores1 = student1.split(",");
        String[] scores2 = student2.split(",");
        
        // ù ��° �л��� ���� ���
        for (String score : scores1) {
            String[] subjectScore = score.split(":");
            String subject = subjectScore[0];
            int grade = Integer.parseInt(subjectScore[1]);
            
            switch (subject) {
                case "math":
                    mathSum += grade;
                    break;
                case "calc":
                    calcSum += grade;
                    break;
                case "science":
                    scienceSum += grade;
                    break;
            }
        }
        
        // �� ��° �л��� ���� ���
        for (String score : scores2) {
            String[] subjectScore = score.split(":");
            String subject = subjectScore[0];
            int grade = Integer.parseInt(subjectScore[1]);
            
            switch (subject) {
                case "math":
                    mathSum += grade;
                    break;
                case "calc":
                    calcSum += grade;
                    break;
                case "science":
                    scienceSum += grade;
                    break;
            }
        }
        
        // ���� �հ� ��� ���
        int studentCount = 2; // �л� ��
        double mathAverage = mathSum / (double) studentCount;
        double calcAverage = calcSum / (double) studentCount;
        double scienceAverage = scienceSum / (double) studentCount;

        // ��� ���
        System.out.println("Math Total: " + mathSum + ", Average: " + mathAverage);
        System.out.println("Calc Total: " + calcSum + ", Average: " + calcAverage);
        System.out.println("Science Total: " + scienceSum + ", Average: " + scienceAverage);
    }
}
