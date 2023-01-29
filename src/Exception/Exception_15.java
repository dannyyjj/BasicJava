package Exception;

public class Exception_15 {
    public static void main(String[] args) {
        method_01();
        System.out.println("method_01()의 수행을 마치고 main메서드로 돌아왔습니다.");
    }
    static void method_01() {
        try {
            System.out.println("method_01()이 호출되었습니다.");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("method_01()의 finally블럭이 실행되었습니다.");
        }
    }
}
// try -> finally -> main