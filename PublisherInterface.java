public interface PublisherInterface {
    public void notifySubscribers(Event theEvent);
    public void registerSubscriber(SubscriberInterface s);
    public void unregisterSubscriber(SubscriberInterface s);
}
