package HW8;

public interface SubscriberInterface {
    public boolean notifySubscriber(Event theEvent);
    public PublisherImpl getPublisherImpl();
    public void setEventsReceived(int eventsReceived);
}
