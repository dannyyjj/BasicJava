package Exception;

public class Exception_06 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시킨 예외");
            throw e; // 예외 발생
            // throw new Exception("고의로 발생시킨 예외"); 위 두줄을 한줄로
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
// throw를 사용해서 고의로 예외를 발생시킬 수 있음
// Exception인스턴스를 생성할 때, 셍성자에 String을 넣어주면
// 이 String이 인스턴스에 메시지로 저장됨