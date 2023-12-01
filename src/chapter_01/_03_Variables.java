package chapter_01;

public class _03_Variables {
    public static void main(String[] args) {

        String name;
        name = "민교";

        String name2 = "minkyo";
        int hour = 15;
        System.out.println(name + "님, 배송 시작 되었습니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송 완료 되었습니다.");


        char grade = 'A';   //한글자는 작은 따옴표로 시행
        double score = 90.1;
        name = "세희";  // 값을 업데이트 할 수 있음
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 "+ grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요? " + pass);

        double d = 3.141231231231231233333333333;  // 3.1412312312312314 정밀한 소수 다룰때 사용
        float f = 3.14123123123123123f; // 3.1412313 짤림
        System.out.println(d);
        System.out.println(f);

//        int i = 1000000000000000;  // -21억~ 21억까지만 표현 가능
        long l = 1000000000000000l;
        l = 1_000_000_000_000_000l;
        System.out.println(l);

        // int, long, float, double, char, String, boolean
        // 범위에 맞는 자료형을 써서 사용하도록
    }
}
