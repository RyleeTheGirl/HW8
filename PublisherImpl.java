import java.util.List;

public class PublisherImpl implements PublisherInterface{
    private List<SubscriberInterface> myList;
    @Override
    public void notifySubscribers(Event theEvent) {

    }
    public void registerSubscriber(SubscriberInterface s){
        myList.add(s);
    }

    @Override
    public void unregisterSubscriber(SubscriberInterface s) {
        myList.remove(s);

    }

    public PublisherImpl PublisherImpl(){
        return this;
    }
}
