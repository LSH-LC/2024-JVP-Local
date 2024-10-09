package W05_JVP_Package;//gpt

public class W05_JVP_PP_01 {
    public static void main(String[] args) {
        String sTot = "10Point,23Point,33Point,45Point,55Point,67Point";
        
        // 점수의 합과 개수를 저장할 변수
        int sum = 0;
        int count = 0;

        // 문자열을 ','로 나누어 점수를 배열에 저장
        String[] scores = sTot.split(",");

        // 각 점수를 처리
        for (String score : scores) {
            // "Point"를 제거하고 정수로 변환
            int point = Integer.parseInt(score.replace("Point", ""));
            sum += point; // 합산
            count++; // 개수 증가
        }

        // 평균 계산
        double average = sum / (double) count;

        // 결과 출력
        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);
    }
}
