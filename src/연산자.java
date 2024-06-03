import java.sql.SQLOutput;

public class 연산자 {
    public static void main(String[] args) {
//        int number1 = 10;
//        int number2 = 3;
//
//        int sum = number1 + number2;
//        int diff1 = number2 - number1;
//        int diff2 = number1 - number2;
//        int product = number1 * number2;
//        int quot = number1 / number2;
//        int remainder = number1 % number2;
//
//        System.out.println("덧셈" + sum);
//        System.out.println("뺄셈1" + diff1);
//        System.out.println("뺄셈1" + diff2);
//        System.out.println("곱셈" + product);

//        나머지 연산자 %

//        byte a = 1;
//        byte b = 1;
//        byte c = a + b; // 에러. byte는 int로 변환 후 연산되기 때문

//        int a = 10;
//        int b = 4;
//        int c = a / b;  // 2
//        double d = a / b;   // 2.0
////        int는 정수 c의 값은 2가됨 정수니까
////        double d 라고해서 바로 2.5가 나올수 있는것이 아니고
////        a와 b가 int(정수) 이기때문에 정수화를 먼저 한뒤
////        2->2.0으로 된다
////        결과같을 2.5로 내고싶으면 = (double)a / b;
////        실수화 형변환을 해주면 된다
//
//
////        문자열 연산을 해봅시다
////
//        String str1 = "안녕하세요";
//        String str2 = "만나서 반갑습니다";
//        String str3 = str1+str2;
//        System.out.println(str3);
//
////        연산의 순서
//        System.out.println("hello"+123+456);
//        System.out.println(123+456+"hello");
////        연산의 순서가 중요하다
//        System.out.println(123+456+"hello");
//        StringBuilder sb =new StringBuilder();
//        sb.append(123);
//        sb.append(456);
//        sb.append("hello");
//        System.out.println(sb);


//        비교연산
        int number1 = 10;
        int number2 = 30;
        System.out.println(number1 > number2);
        System.out.println(number1 >= number2);
        System.out.println(number1 <= number2);
        System.out.println(number1 < number2);

        System.out.println(number2 == number1);
        System.out.println(number2 != number1);


        System.out.println('a'<'b');

//        차타입과 인트타입을 비교할때는 인트로 타입을 일치 시킨 후 비교합니다.
//        더블타입과 인트타입을 비교하면 크기가 더 큰 타입을 기준으로 일치시킨 후 비교한다.
//         new로 생성한 새로운 객체의 주소이다.
    }
}
