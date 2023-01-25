package Exception;

public class Exception_08 {
    public static void main(String[] args) {
        throw new RuntimeException(); // 런타임 에러 고의 발생
        // 예외 처리를 하지 않아도 성공적으로 컴파일이 되고 RuntimeException 발생으로 비정상적 종료
        // RuntimeException와 그 자손 클래스들에 해당하는 예외는 프로그래머에 의해 실수로 발생하는 것들이기 때문에
        // 예외처리를 강제하지 않음
    }
}
