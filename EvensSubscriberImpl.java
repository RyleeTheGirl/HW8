public class EvensSubscriberImpl implements SubscriberInterface{
    private int eventsReceived = 0;
    private int threshold = 14;
    private PublisherImpl publisherImpl = new PublisherImpl();

    public void notifySubscriber(Event theEvent) {
        if(theEvent.getEventDataValue()%2 == 0) {
            eventsReceived = eventsReceived + 1;
            if(eventsReceived <= threshold) {
                System.out.println("SubscriberEvens: Event is even: " + theEvent.getEventDataValue());

            }
            if(eventsReceived == threshold) {
                publisherImpl.unregisterSubscriber(this);
            }
        }
    }
}
