package HW8;



public abstract interface PublisherInterface {

    public void notifySubscribers(Event theEvent);
    public void registerSubscriber(SubscriberInterface s);
    public void reregisterSubscribers();
    public void unregisterSubscriber(SubscriberInterface s);
}

