package Object_oriented_Programing.inheritance;

class Tv {
    boolean power; // 전원상태(on/off)
    int channel; // 채널
    void power() {power = !power;}
    void channelUp() {++channel;}
    void chaanelDown() {--channel;}
}

class CaptionTv extends Tv {
    boolean caption; // 자막

    void displayCaption(String text) {
        if (caption) { // 자막이 on(true)일 때만 text를 보여줌
            System.out.println(text);
        }
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10; // 조상 클래스로부터 상속받은 멤버
        ctv.channelUp(); // 조상 클래스로부터 상속받은 멤버
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, world");
        ctv.caption = true;
        ctv.displayCaption("Hello, world");
    }
}
