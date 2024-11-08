package com.btgpactual.orderms.listener;

import com.btgpactual.orderms.config.RabbitMqConfig;
import com.btgpactual.orderms.listener.dto.OrderCreatedEvent;
import com.btgpactual.orderms.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {

    private final Logger logger = LoggerFactory.getLogger(OrderCreatedListener.class);

    private final OrderService orderService;

    public OrderCreatedListener(OrderService orderService) {
        this.orderService = orderService;
    }

    @RabbitListener(queues = RabbitMqConfig.ORDER_CREATED_QUEUE)
    protected void listen(Message<OrderCreatedEvent> message){
        logger.info("Message consumed: {}", message);

        orderService.save(message.getPayload());
    }
}
