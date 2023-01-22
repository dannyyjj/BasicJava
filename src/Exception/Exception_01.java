package Exception;

public class Exception_01 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int) (Math.random() * 10);
            System.out.println(result);
        }
    }
}
// java.lang.ArithmeticException: / by zero - /(나누기)를 0으로 해서 발생한 예외
// ArithmeticException - 산술연상과정에서 오류가 있을 떄 발생하는 예외
//                       정수는 0으로 나누는 것이 금지되어있기 때문에 발생