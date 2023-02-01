package Exception;

public class Exception_18 {
    public static void main(String[] args) {
        try {
            method_01();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리됨");
        }
    }
    static void method_01() throws Exception{
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method_01메서드에서 예외가 처리됨");
            throw e;
        }
    }
}

// 하나의 예외에 대해서도 예외가 발생한 메서드와 호출한 메서드, 양쪽에서 처리하도록 할 수 있음
// 예외 되던지기(exception re-throwing) - 예외를 처리한 후에 인위적으로 다시 발생시키는 방법

// 1. 예외가 발생할 가능성이 있는 메서드에서 try-catch문을 사용해서 예외를 처리
// 2. catch문에서 필요한 작업을 행한 후에 throw문을 사용해서 예외를 다시 발생
// 3. 다시 발생한 예외는 이 메서드를 호출한 메서드에게 전달되고 호출한 메서드의 try-catch문에서 예외를 다시 처리