package com.sjft.sell.dao;

import com.sjft.sell.model.ProductInfo;
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
public class ProductInfoDaoTest {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("0");
        productInfo.setProductName("iphone xr");
        productInfo.setProductPrice(new BigDecimal(4988));
        productInfo.setProductDescription("A12 仿生芯片");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(0);
        productInfo.setProductStock(1000);
        ProductInfo result = productInfoDao.save(productInfo);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> reslut = productInfoDao.findByProductStatus(0);
        System.out.println(reslut.size());
        Assert.assertNotEquals(0,reslut.size());

    }
}