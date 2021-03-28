package HW8;

public class Event {
    private int EventSequenceNumber;
    private int EventDataValue;

   Event(int seqNum, int data){
        EventSequenceNumber = seqNum;
        EventDataValue = data;
    }
    public int getEventSequenceNumber(){
        return EventSequenceNumber;
    }

    public int getEventDataValue() {
        return EventDataValue;
    }
}
