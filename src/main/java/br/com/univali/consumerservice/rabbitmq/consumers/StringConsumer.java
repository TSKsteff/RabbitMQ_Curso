package br.com.univali.consumerservice.rabbitmq.consumers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import static org.rabbitmq.constans.RabbitMQConstans.*;

@Component
public class StringConsumer {

    private final Logger log = LoggerFactory.getLogger(StringConsumer.class);

    @RabbitListener(queues = {RK_PRODUCT_LOG})
    public void consumer(String message){
        log.info("Consumer received a message "+ message );
    }
}
