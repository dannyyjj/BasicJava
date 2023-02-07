package Object_oriented_Programing.inheritance;

class Tv {
    boolean power; // 전원상태(on/off)
    int channel; // 채널
    void power() {power = !power;}
    void channelUp() {++channel;}
    void chaanelDown() {--channel;}
}

class CaptionTv extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if (caption) { // 캡션이 on(true)일 때만 text를 보여줌
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

// TV클래스로부터 상속받고 기능을 추가하여 CaptionTv클래스 생성
// 멤버변수 caption은 캡션기능의 상태를 저장하기 위한 boolean형 변수
// displayCaption(String text)은 매개변수로 넘겨받은 문자열(text)을 캡션이 켜져있는 경우(caption의 값이 true인 경우)에만 화면에 출력

// 자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버도 함께 생성되기 때문에
// 따로 조상클래스의 인스턴스를 생성하지 않고도 조상 클래스들의 멤버들을 사용할 수 있음