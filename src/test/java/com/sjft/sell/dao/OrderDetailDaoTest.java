package com.sjft.sell.dao;

import com.sjft.sell.model.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {
    @Autowired
    private OrderDetailDao orderDetailDao;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("0");
        orderDetail.setDetailId("0");
        orderDetail.setProductName("柠檬茶");
        orderDetail.setProductId("3");
        orderDetail.setProductPrice(new BigDecimal(16));
        orderDetail.setProductQuantity(250);
        OrderDetail result = orderDetailDao.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> result = orderDetailDao.findByOrderId("0");
        Assert.assertNotEquals(0,result.size());
    }
}