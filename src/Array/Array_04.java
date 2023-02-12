package Array;
// 섞기
public class Array_04 {
    public static void main(String[] args) {
        int[] numArr = new int[10]; // 배열 10칸 생성

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i ; // 배열에 차례대로 0~9를 할당
            System.out.print(numArr[i]);
        }

        System.out.println();

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10); // 0~9 랜덤값 생성
            int tmp = numArr[0]; // numArr[0]의 값과
            numArr[0] = numArr[n]; // numArr[n]의 값을
            numArr[n] = tmp; // 서로 바꿔줌
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}
