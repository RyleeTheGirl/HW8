package HW8;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class publisherUnitTests {
    @Test
    public void testRegister() {

        PublisherImpl newPublisher = new PublisherImpl();

        EvensSubscriberImpl evensSubscriber = new EvensSubscriberImpl();

        newPublisher.registerSubscriber(evensSubscriber);

        int size = newPublisher.getMyList().size();


        assertEquals(1, size);
    }
    @Test
    public void testUnregister() {
        PublisherImpl Bpublisher = new PublisherImpl();


        EvensSubscriberImpl evensSubscriber1 = new EvensSubscriberImpl();
        Bpublisher.registerSubscriber(evensSubscriber1);
        int size1 = Bpublisher.getMyList().size() - 1;

        Bpublisher.unregisterSubscriber(evensSubscriber1);

        int size2 = Bpublisher.getMyList().size() - 1;

        String sizes = size1 + ", " + size2;

        assertEquals("1, 0", sizes);

    }
    @Test
    public void testNotify() {
        PublisherImpl Cpublisher = new PublisherImpl();

        Event theEvent3 = new Event(0, 34);

        EvensSubscriberImpl evensSubscriber2 = new EvensSubscriberImpl();


        Cpublisher.registerSubscriber(evensSubscriber2);


        Cpublisher.notifySubscribers(theEvent3);


        assertEquals(true, Cpublisher.result);
    }
}
