package W05_JVP_Package;//gpt

public class W05_JVP_PP_01 {
    public static void main(String[] args) {
        String sTot = "10Point,23Point,33Point,45Point,55Point,67Point";
        
        // ������ �հ� ������ ������ ����
        int sum = 0;
        int count = 0;

        // ���ڿ��� ','�� ������ ������ �迭�� ����
        String[] scores = sTot.split(",");

        // �� ������ ó��
        for (String score : scores) {
            // "Point"�� �����ϰ� ������ ��ȯ
            int point = Integer.parseInt(score.replace("Point", ""));
            sum += point; // �ջ�
            count++; // ���� ����
        }

        // ��� ���
        double average = sum / (double) count;

        // ��� ���
        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);
    }
}
