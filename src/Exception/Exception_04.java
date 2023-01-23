package Exception;

public class Exception_04 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0); // 0을 0으로 나눴기 때문에 ArithmeticException 발생
            System.out.println(4); // 실행되지 않음
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
// 1. try블럭에서 ArithmeticException 발생
// 2. catch블럭을 하나씩 차례로 검사
// 3. 첫 번째 검사에서 일치하는 catch블럭을 찾았기 때문에 두 번째 catch블럭은 검사하지 않음
// 4. 만일 try문에서 ArithmeticException이 아닌 다른 종류의 예외가 발생한 경우
//    두 번째 catch블럭인 Exception클래스 타입의 참조변수를 선언한 곳에서 처리됨
// * 이처럼, try-catch문의 마지막에 Exception클래스 타입의 참조변수를 선언한 catch블럭을 사용하면,
//   어떤 종류의 예외가 발생하더라도 이 catch블럭에 의해 처리되도록 할 수 있음