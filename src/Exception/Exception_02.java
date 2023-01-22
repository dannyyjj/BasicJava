package Exception;

public class Exception_02 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("0");
                System.out.println(e);
            }
        }
    }
}
// catch (ArithmeticException e) - 예제 Exception_01에서 try/catch 추가
//                                 for문이 돌아가는 동안 ArithmeticException 발생시 catch블럭 내 문장 실행

// ArithmeticException 예외처리 발생시 변수 e를 출력해보면
// java.lang.ArithmeticException: / by zero - 예외처리가 발생한 원인을 볼 수 있음