package br.com.univali.consumerservice.rabbitmq.consumers;


import org.rabbitmq.constans.RabbitMQConstans;
import org.rabbitmq.dtos.ProductDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class ProductConsumer {

    private final Logger log = LoggerFactory.getLogger(ProductConsumer.class);

    @RabbitListener(queues = {RabbitMQConstans.RK_PRODUCT_LOG})
    public void consumer(ProductDTO message){
        log.info("Received a message "+ message.toString());
    }
}
