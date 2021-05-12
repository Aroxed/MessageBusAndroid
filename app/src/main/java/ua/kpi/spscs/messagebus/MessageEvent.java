package ua.kpi.spscs.messagebus;

public class MessageEvent {
    public int value;
    public MessageEvent(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
