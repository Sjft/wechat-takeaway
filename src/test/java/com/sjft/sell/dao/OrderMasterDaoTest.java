package com.sjft.sell.dao;

import com.sjft.sell.model.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMasterDaoTest {

    @Autowired
    private OrderMasterDao orderMasterdao;

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1");
        orderMaster.setBuyerName("王也");
        orderMaster.setBuyerPhone("17123456987");
        orderMaster.setBuyerAddress("玛雅");
        orderMaster.setBuyerOpenid("006065");
        orderMaster.setOrderAmount(new BigDecimal(36));
        OrderMaster result = orderMasterdao.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest pageRequest = PageRequest.of(0, 3);
        Page<OrderMaster> result = orderMasterdao.findByBuyerOpenid("006065", pageRequest);
        Assert.assertNotEquals(0,result.getTotalElements());
    }
}