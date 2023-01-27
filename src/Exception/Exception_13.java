package Exception;

import java.io.File;

public class Exception_13 {
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals(""))
            throw new Exception("파일이름이 유효하지 않습니다.");
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}

// 예외가 발생한 createFile메서드에서 잘못 입력된 파일이름을 임의로 처리하지 않고,
// 호출한 main메서드에 예외가 발생했음을 알려서 파일이름을 다시 입력 받도록 함