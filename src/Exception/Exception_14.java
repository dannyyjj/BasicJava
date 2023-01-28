package Exception;

public class Exception_14 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            deleteTempFiles();
        }
    }
    static void startInstall() {
        // 프로그램 설치에 필요한 준비를 하는 코드가 있다고 가정
    }

    static void copyFiles() {
        // 파일들을 복사하는 코드가 있다고 가정
    }

    static void deleteTempFiles() {
        // 임시파일들을 삭제하는 코드가 있다고 가정
    }
}

// 프로그램설치를 위한 준비를 하고 파일들을 복사하고 설치가 완료되면,
// 프로그램을 설치하는데 사용된 임시파일들을 삭제하는 순서로 진행

// 프로그램의 설치과정 중에 예외가 발생하더라도,
// 설치에 사용된 임시파일들이 삭제되도록 설계