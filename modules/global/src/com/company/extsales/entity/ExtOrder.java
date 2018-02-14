package com.company.extsales.entity;

import javax.persistence.Entity;
import com.haulmont.cuba.core.entity.annotation.Extends;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.company.sales.entity.Order;

@Extends(Order.class)
@Entity(name = "extsales$ExtOrder")
public class ExtOrder extends Order {
    private static final long serialVersionUID = -2094633891886131873L;

    @NotNull
    @Column(name = "IS_URGENT", nullable = false)
    protected Boolean isUrgent = false;

    public void setIsUrgent(Boolean isUrgent) {
        this.isUrgent = isUrgent;
    }

    public Boolean getIsUrgent() {
        return isUrgent;
    }


}