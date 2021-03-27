public class ThreesSubscriverImpl implements SubscriberInterface{
    private int eventsReceived = 0;
    private int threshold = 10;
    private PublisherImpl publisherImpl = new PublisherImpl();

    public void notifySubscriber(Event theEvent) {
        if(theEvent.getEventDataValue()%3 == 0) {
            eventsReceived = eventsReceived + 1;
            if(eventsReceived <= threshold) {
                System.out.println("SubscriberThrees Event is divisible by 3: " + theEvent.getEventDataValue());

            }
            if(eventsReceived == threshold) {
                publisherImpl.unregisterSubscriber(this);
            }
        }
    }

    public PublisherImpl getPublisherImpl() {
        return publisherImpl;
    }
}
