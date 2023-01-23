package Exception;

public class Exception_03 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0); // 0을 0으로 나눴기 때문에 ArithmeticException 발생
            System.out.println(4); // 실행되지 않음
        } catch (ArithmeticException ae) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
// try-catch문의 흐름
// 1. 발생한 예외와 일치하는 catch블럭이 있는지 확인
// 2. 일치하는 catch블럭을 찾게 되면, 그 catch블럭 내의 문장들을 수행하고 전체 tru-catch문을 빠져나가서 그다음 문장을 계속 수행
// 3. 만일 일치하는 catch블럭을 찾지 못하면, 예외는 처리되지 못함
// * 모든 예외 클래스는 Exception클래스의 자손이므로, catch블럭의 괄호()에 Exception클래스 타입의 참조변수를 선언해 놓으면
// 어떤 종류의 예외가 발생하더라도 이 catch블럭에 의해서 처리됨 *//
