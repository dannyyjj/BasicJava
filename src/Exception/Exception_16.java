package Exception;

public class Exception_16 {
    public static void main(String[] args) {

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }

        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }

    }
}
    class CloseableResource implements AutoCloseable {
        public void exceptionWork(boolean exception) throws WorkException{
            System.out.println("exceptionWorl("+exception+")가 호출됨");
            if (exception)
                throw new WorkException("WorkException 발생");
        }
        public void close() throws CloseException {
            System.out.println("close()가 호출됨");
            throw new CloseException("CloseException 발생");
        }
    }

    class WorkException extends Exception {
        WorkException(String msg) {
            super(msg);
        }
    }

    class CloseException extends Exception {
        CloseException(String msg) {
            super(msg);
        }
    }

// try-with-resources문의 괄호()안에 객체를 생성하는 문장을 넣으면,
// 이 객체는 따로 close()를 호출하지 않아도 try블럭을 벗어나는 순간 자동적으로 close()가 호출됨
// 그 다음에 catch블럭 또는 finally블럭이 실행됨

// try-with-resources문에 의해 자동으로 객체의 close()가 호출될 수 있으려면,
// 클래스가 AutoCloseable이라는 인터페이스를 구현한 것이여야 함