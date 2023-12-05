package chapter_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산자
        System.out.println(4 + 2);

        // 우선순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2+2)*2); // 8

        // 변수 이용
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);  // 30

        c = a - b;
        System.out.println(c);  // 10

        c = a * b;
        System.out.println(c); //200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); //10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); //

        int b1 = 20;
        int b2 = 6;
        int a1 = 10 - b1++ * 3 - 8 / 2 - --b2 * 3;
        System.out.println(a1);

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3
    }
}
