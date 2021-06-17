package enum_demo;

public class EnumDemo {
    public enum EventType {
        shareToWechat
    }
    public static void main(String[] args) {
        System.out.println(EventType.shareToWechat.name()); // shareToWechat
    }
}
