package mallhossun.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import mallhossun.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import mallhossun.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired OrderRepository orderRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryStarted'")
    public void wheneverDeliveryStarted_UpdateStatue(@Payload DeliveryStarted deliveryStarted){

        DeliveryStarted event = deliveryStarted;
        System.out.println("\n\n##### listener UpdateStatue : " + deliveryStarted + "\n\n");


        

        // Sample Logic //
        Order.updateStatue(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryReturned'")
    public void wheneverDeliveryReturned_UpdateStatue(@Payload DeliveryReturned deliveryReturned){

        DeliveryReturned event = deliveryReturned;
        System.out.println("\n\n##### listener UpdateStatue : " + deliveryReturned + "\n\n");


        

        // Sample Logic //
        Order.updateStatue(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryCancelled'")
    public void wheneverDeliveryCancelled_UpdateStatue(@Payload DeliveryCancelled deliveryCancelled){

        DeliveryCancelled event = deliveryCancelled;
        System.out.println("\n\n##### listener UpdateStatue : " + deliveryCancelled + "\n\n");


        

        // Sample Logic //
        Order.updateStatue(event);
        

        

    }

}


