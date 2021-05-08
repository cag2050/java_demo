package enum_demo;

public class EnumDemo {
    public enum EventType {
        INVITE_SHARE
    }
    public static void main(String[] args) {
        System.out.println(EventType.INVITE_SHARE.name()); // INVITE_SHARE
    }
}
