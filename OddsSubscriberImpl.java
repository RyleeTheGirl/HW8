public class OddsSubscriberImpl implements SubscriberInterface{
	private int eventsReceived;
	private int threshold;
	private PublisherImpl publisherImpl = new PublisherImpl();
	
	@Override
	public void notifySubscriber() {
		
	}
}
