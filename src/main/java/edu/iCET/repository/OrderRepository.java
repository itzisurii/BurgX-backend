package edu.iCET.repository;

import edu.iCET.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository <Order, Long> {

    @Query("select coalesce(max(o.orderId), 0) from Order o")
    int findLastOrderId();
}
