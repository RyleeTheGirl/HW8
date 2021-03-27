public class HWMain {
    
    PublisherImpl publisher = new PublisherImpl();
    EventGenerator eventGenerator = new EventGenerator();
    OddsSubscriberImpl oddsSubscriber = new OddsSubscriberImpl();
    ThreesSubscriverImpl threesSubscriver = new ThreesSubscriverImpl();
    EvensSubscriberImpl evensSubscriber = new EvensSubscriberImpl();

    publisher.register(oddSubscriver);
    


}

