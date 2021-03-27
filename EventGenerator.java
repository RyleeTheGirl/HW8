import java.util.List;
import java.lang.*;
import java.util.Random;

public class EventGenerator {
    private List<SubscriberInterface> myList;

    public EventGenerator() {}

    public void runSimulation(){
        Random random = new Random();
        for (int i = 0; i < 200; i++){
            System.out.println("Sequence Number: " + i);
            int data = random.nextInt(200);
            System.out.println("Data: " + data);
            Event theNewEvent = generateEvent(i, data);
            for(int k =0; k<myList.size(); k++) {
                myList.get(k).notifySubscriber(theNewEvent);
            }
            if (theNewEvent.getEventDataValue()%40 == 0) {
                for(int j = 0; j < myList.size(); j++) {
                    myList.get(j).registerSubscriber(myList.get(j));
                }
            }
        }
    }

    private Event generateEvent(int i, int data) {
        return new Event(i, data);
    }


}
