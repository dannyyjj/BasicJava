package Exception;

public class Exception_10 {
    public static void main(String[] args) {
        method_01();
    }

    static void method_01() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method_01메서드에서 예외 처리");
            e.printStackTrace();
        }
    }
}

// 예외가 발생한 메서드(method_01) 내에서 처리되어지면,
// 호출한 메서드(main)에서는 예외가 발생했다는 사실조차 모르게 됨