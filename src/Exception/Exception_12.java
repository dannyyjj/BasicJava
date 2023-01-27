package Exception;

import java.io.File;

public class Exception_12 {
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("파일이름이 유효하지 않습니다.");
        } catch (Exception e) {
            fileName = "제목없음.txt";
        }finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) {
        }
    }
}

// 예외가 발생한 메서드에서 직접 예외를 처리하도록 되어 있음
// createFile메서드를 호출한 main메서드에서는 예외가 발생한 사실을 알지 못함
// 적절하지 못한 파일이름(fileName)이 입력되면, 예외를 발생시키고, catch블럭에서, 파일이름을 '제목없음.txt'로 설정해서 파일을 생성
// finally블럭에서는 예외의 발생여부에 관계없이 파일을 생성