package com.wonders.xlab.test.entity.secondary;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by wangqiang on 15/10/20.
 */
@Entity
@Table(name = "ORDERS")
public class Order extends AbstractPersistable<Long> {

    private String name;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
