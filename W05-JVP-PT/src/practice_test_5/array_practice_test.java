package practice_test_5;
public class array_practice_test
{
    public static void main(String[] args) throws Exception
    {
        //학생별 과목점수를 문자열 배열에 저장
        String[] student1 = {"kor:90" , "math:80" , "eng:72"};
        String[] student2 = {"kor:94" , "math:85" , "eng:92"};
        String[] student3 = {"kor:87" , "math:91" , "eng:78"};

        //다차원 배열로 묶기
        String[][] students = {student1, student2, student3};

        //과목별 총점 및 학생 수 선언
        int[] subjectsum = new int[3];     // kor, math, eng
        int numStudents = students.length; //students안에 있는 student의 수(3)

        //총점
        for (int i = 0; i < numStudents; i++)
        {
            int KOR = 0, MATH = 0, ENG = 0;               //kor,math,eng를 선언
            int totalScore = 0;

            //개인의 총점
            /*
            for (String subject : students[i])          //students 안의 student1,2,3의 배열이 들어간다.
            {                                           //예)i = 0일때, String subject는 student1의 모든 각 배열[0][1][2]가 들어간다.
                String[] parts = subject.split(":");    //(:)를 제거, parts에 0에는과목,1에는 점수
                int score = Integer.parseInt(parts[1]); //String점수를 int로 변환
                totalScore += score;
            }
            */

            //각 학생의 총점
            for (int j = 0; j < students[i].length; j++)
            {
                String subject = students[i][j];            //i는 학생번호, j는 과목 별 점수
                String[] parts = subject.split(":");  //student1,2,3의 각 배열에서 :를 제거
                int score = Integer.parseInt(parts[1]);     //parts[0]은 과목,[1]은 점수
                totalScore += score;                        //그 학생의 총 점수

                //학생들의 과목별 총점
                switch (parts[0])
                {
                    case "kor":
                        subjectsum[0] += score;
                        KOR = score;
                        break;
                    case "math":
                        subjectsum[1] += score;
                        MATH = score;
                        break;
                    case "eng":
                        subjectsum[2] += score;
                        ENG = score;
                        break;
                }
            }
            //개인별 평균
            double Avr = totalScore / (double)students[i].length;     //개인의 평균
            System.out.println(i+1 + "student" + " KOR:" + KOR + ", MATH:" + MATH + ", ENG:" + ENG + " [SumVal:" + totalScore + ", Avr:" + Avr +"]");
        }
        //과목별 총점과 평균
        String[] subjects = {"kor", "math", "eng"};
        for (int i = 0; i < subjectsum.length; i++)
        {
            double subjectavr = subjectsum[i] / (double) numStudents; //과목별 평균
            System.out.println(subjects[i] + "sum:" + subjectsum[i] + ", Avr:" + subjectavr);
        }
    }
}