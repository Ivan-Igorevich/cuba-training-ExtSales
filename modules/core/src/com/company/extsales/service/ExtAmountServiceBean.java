package com.company.extsales.service;

import com.company.extsales.entity.ExtOrder;
import com.company.sales.entity.Order;
import com.company.sales.service.AmountServiceBean;

import java.math.BigDecimal;

public class ExtAmountServiceBean extends AmountServiceBean {
    @Override
    public BigDecimal countAmount(Order order) {
        BigDecimal result = super.countAmount(order);
        ExtOrder o = (ExtOrder) order;
        return (o.getIsUrgent()) ? result.multiply(BigDecimal.valueOf(1.25)) :result;
    }
}
