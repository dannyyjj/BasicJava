package Exception;

public class Exception_05 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("예외 메시지 : "+ae.getMessage());
        }
        System.out.println(6);
    }
}
// printStackTrace() - 예외발생 당시의 호출스택(Call Stack)에 있었던
//                     메서드의 정보와 예외 메시지를 화면에 출력
// getMessage() - 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있음