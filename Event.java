public class Event {
    private int EventSequenceNumber;
    private int EventDataValue;

    public Event Event(int seqNum, int data){
        EventSequenceNumber = seqNum;
        EventDataValue = data;
        return this;
    }
    public int getEventSequenceNumber(){
        return EventSequenceNumber;
    }

    public int getEventDataValue() {
        return EventDataValue;
    }
}
