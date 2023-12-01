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
        float score_f =93.3f;
        double score_b = 93.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_b); // 93

        // int > 소수점 이하는 버려지는 정수 3
        // float > 소수점 7번째 자리까지 표시 이하로 버려짐 3.1412313
        // double > 소수점 16번째 자리까지 표시 이하로 버려짐 3.1412312312312314
    }
}
