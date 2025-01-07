package br.com.univali.consumerservice.rabbitmq.consumers;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class StringConsumer {

    private final Logger log = LoggerFactory.getLogger(StringConsumer.class);

    @RabbitListener(queues = {"product.log"})
    public void consumer(String message){
        log.info("Consumer received a message "+ message );
    }
}
