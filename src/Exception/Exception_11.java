package Exception;

public class Exception_11 {
    public static void main(String[] args) {
        try {
            method_01();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외 처리");
            e.printStackTrace();
        }
    }

    static void method_01() throws Exception {
        throw new Exception();
    }
}

// 예외가 발생한 메서드에서 예외를 처리하지 않고 호출한 메서드로 넘겨주면,
// 호출한 메서드에서는 method_01()을 호출한 라인에서 예외가 발생한 것으로 간주되어 이에 대한 처리를 하게 됨