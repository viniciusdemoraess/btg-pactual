package com.btgpactual.orderms.repository;

import com.btgpactual.orderms.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
}
