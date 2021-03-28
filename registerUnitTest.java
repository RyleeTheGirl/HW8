package HW8;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class registerUnitTest {
    @Test
    public void testEvens() {

        EvensSubscriberImpl evensSubscriber = new EvensSubscriberImpl();

        Event theEvent = new Event(13,32);


        evensSubscriber.setEventsReceived(13);

        boolean theReturn = evensSubscriber.notifySubscriber(theEvent);



        assertEquals(false, theReturn);
    }
    @Test
    public void testReset() {
        PublisherImpl Bpublisher = new PublisherImpl();

        Event theEvent2 = new Event(40, 40);

        EvensSubscriberImpl evensSubscriber1 = new EvensSubscriberImpl();
        Bpublisher.registerSubscriber(evensSubscriber1);
        evensSubscriber1.setEventsReceived(5);
        Bpublisher.unregisterSubscriber(evensSubscriber1);




        System.out.println(theEvent2.getEventDataValue() + "" + theEvent2.getEventSequenceNumber());
        boolean theReturn = evensSubscriber1.notifySubscriber(theEvent2);

        Bpublisher.reregisterSubscribers();

        String events = evensSubscriber1.getEventsReceived() + " " + theReturn;
        assertEquals("0 true", events);

    }
    @Test
    public void testUnderThreshold() {
        PublisherImpl Cpublisher = new PublisherImpl();

        Event theEvent3 = new Event(0, 34);

        EvensSubscriberImpl evensSubscriber2 = new EvensSubscriberImpl();

        evensSubscriber2.setEventsReceived(5);

        Cpublisher.registerSubscriber(evensSubscriber2);

        boolean theReturn = evensSubscriber2.notifySubscriber(theEvent3);


        assertEquals(true, theReturn);
    }
}
