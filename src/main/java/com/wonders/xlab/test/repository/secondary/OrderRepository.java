package com.wonders.xlab.test.repository.secondary;

import com.wonders.xlab.test.entity.secondary.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wangqiang on 15/10/20.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
