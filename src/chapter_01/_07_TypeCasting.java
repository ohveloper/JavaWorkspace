package chapter_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로 서로 전환해 주는것을 말함

//        int score = 3 + 3.14;  에러 발생

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float, double to int
        float score_f = 93.3f;
        double score_d = 93.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 93

        // int > 소수점 이하는 버려지는 정수 3
        // float > 소수점 7번째 자리까지 표시 이하로 버려짐 3.1412313
        // double > 소수점 16번째 자리까지 표시 이하로 버려짐 3.1412312312312314


        // 정수 + 실수 연산
        score = 93 + (int) 98.8;
        System.out.println(score); // 191

        score_d = (double) 93 + 93.8;
        System.out.println(score_d); // 186.8

        // 변수에 형 변환된 데이터 집어넣기
        double convertedScoreDouble = score;  // 191 > 191.0
        System.out.println(convertedScoreDouble);  // 191.0
        // int -> long -> float -> double (자동 형 변환) 커질때

        int convertedScoreInt = (int) score_d;
        System.out.println(convertedScoreInt);
        // double -> float -> long -> int (수동 형 변환) 작아질떄

        // 숫자를 문자열로
        // String class 를 사용하여 전환
        String s1 = String.valueOf(93);
        System.out.println(s1);
        s1 = Integer.toString(93);
        System.out.println(s1);

        // doule을 문자열로
        String s2 = Double.toString(98.9);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.999999999999999");
        System.out.println(d);

        int error = Integer.parseInt("자바");

    }
}
