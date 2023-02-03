package Exception;

public class Exception_19 {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException me) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
//            throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
        }
    }

    static void copyFiles() {
        // 파일들을 복사하는 코드
    }

    static void deleteTempFiles() {
        // 임시파일을 삭제하는 코드
    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}
    class InstallException extends Exception {
        InstallException(String msg) {
            super(msg);
        }
    }
    class SpaceException extends Exception {
        SpaceException(String msg) {
            super(msg);
        }
    }
    class MemoryException extends Exception {
        MemoryException(String msg) {
            super(msg);
        }
    }

// 한 예외가 다른 예외를 발생시킬 수 있음
// ex) 예외A가 예외B를 발생시켰다면, A를 B의 '원인 예외(cause exception)'라고 함
// 상속관계의 예외처리는 실제로 발생한 예외가 어떤 것인지 알 수 없다는 문제가 있음
// 그래서 예외가 원인 예외를 포함할 수 있게 함
// install()메서드에서 InstallException ie = new InstallException("설치 중 예외 발생");
//                  ie.initCause(se);
// 를 통해서 SpaceException를 통해 설치공간 부족 예외를 던져줌