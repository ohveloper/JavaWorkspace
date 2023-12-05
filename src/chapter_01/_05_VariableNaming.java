package chapter_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능
        // 3. 시작은 밑줄과 문자로만 가능
        // 4. 한 단어 또는 2개 이상 단어 연속으로 지음
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, int, doule, float, ....)

        // 입국 신고서 (여행)
        String nationality = "대한민국";
        String firstName = "민교";
        String lastName = "오";
        String dateOfBirth = "2022-03-01";
        String residentialAddress = "킹호텔";
        String purposeOfVisit = "관광";

        String flightNo = "EK221";
        String _flightNo = "EK221";
        String flight_no = "EK221";

        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "시계";
        String item2 = "과자";

        // 반복문 내 변수 등 흐름을 크게 망치지 않는 경우 간단하게 사용
        int i = 0;
        String s = "";

        // 상수는 선언된 뒤 절대 바뀌지 않는 경우 대문자로 적는다.
        final String CODE = "KR";

        int b1 = 20;
        int z = --b1;
//        System.out.println(z);
//        System.out.println(b1);
        int b2 = 6;
        int b3 = 10 - b1++ * 3 - 8 / 2- --b2 * 3;
        System.out.println(b3);
//        System.out.println(--b2);
    }
}
