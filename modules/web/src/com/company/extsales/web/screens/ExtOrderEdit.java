package com.company.extsales.web.screens;

import com.company.extsales.entity.ExtOrder;
import com.company.sales.service.AmountService;
import com.company.sales.web.order.OrderEdit;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.util.Map;

public class ExtOrderEdit extends OrderEdit {
    @Inject
    private Datasource<ExtOrder> orderDs;

    @Inject
    private AmountService amountService;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);
        orderDs.addItemPropertyChangeListener(new Datasource.ItemPropertyChangeListener<ExtOrder>() {
            @Override
            public void itemPropertyChanged(Datasource.ItemPropertyChangeEvent<ExtOrder> e) {
                if (getItem().getItems() == null) return;
                getItem().setAmount(amountService.countAmount(getItem()));
            }
        });
    }
}