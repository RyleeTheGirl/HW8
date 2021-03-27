public class OddsSubscriberImpl implements SubscriberInterface{
    private int eventsReceived = 0;
    private int threshold = 21;
    private PublisherImpl publisherImpl = new PublisherImpl();

    public void notifySubscriber(Event theEvent) {
        if(theEvent.getEventDataValue()%2 != 0) {
            eventsReceived = eventsReceived + 1;
            if(eventsReceived <= threshold) {
                System.out.println("SubscriberOdds Event is odd: " + theEvent.getEventDataValue());

            }
            if(eventsReceived == threshold) {
                publisherImpl.unregisterSubscriber(this);
            }
        }
    }
}
