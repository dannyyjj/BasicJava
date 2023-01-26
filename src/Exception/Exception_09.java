package Exception;

public class Exception_09 {
    public static void main(String[] args) throws Exception {
        method_01();
    }
    static void method_01() throws Exception{
        method_02();
    }
    static void method_02() throws Exception{
        throw new Exception();
    }
}

// 1. 예외가 발생했을 때, 모두 3개의 메서드(main, method_01, method_02)가 호출스택에 있었으며
// 2. 예외가 발생한 곳은 제일 윗줄에 있는 method_02()라는 것과
// 3. main메서드가 method_01을, 그리고 method_01()은 method_02()를 호출했다는 것을 알 수 있음

// method_02에서 'throw new Exception();'문장에 의해 예외가 강제적으로 발생하였으나
// try-catch문으로 예외처리를 해주지 않았으므로
// method_02 -> method_01 그리고 main메서드에서 조차 예외처리를 해주지 않았으므로
// main메서드가 종료되어 프로그램이 예외로 인해 비정상적으로 종료됨