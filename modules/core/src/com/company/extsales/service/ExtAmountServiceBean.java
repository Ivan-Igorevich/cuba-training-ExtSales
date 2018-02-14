package com.company.extsales.service;

import com.company.extsales.entity.ExtOrder;
import com.company.sales.entity.Item;
import com.company.sales.entity.Order;
import com.company.sales.service.AmountServiceBean;

import java.math.BigDecimal;

public class ExtAmountServiceBean extends AmountServiceBean {
    @Override
    public BigDecimal countAmount(Order order) {
        ExtOrder o = (ExtOrder) order;
        BigDecimal result = BigDecimal.valueOf(0);
        for (Item i : order.getItems()) {
            result = result.add(i.getCost()).multiply(BigDecimal.valueOf((o.getIsUrgent() ? 1.25f : 1)));
        }
        return result;
    }
}
