package com.sjft.sell.service.impl;

import com.sjft.sell.dao.ProductInfoDao;
import com.sjft.sell.enums.ProductStatusEnum;
import com.sjft.sell.model.ProductInfo;
import com.sjft.sell.service.ProductInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void findById() {
        ProductInfo productInfo = productInfoService.findById("0");
        Assert.assertEquals("0",productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() {
        //PageRequest request = new PageRequest(0,2);
        PageRequest request = PageRequest.of(0,2);
        Page<ProductInfo> productInfoPage = productInfoService.findAll(request);
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());

    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setProductName("iphone 6s");
        productInfo.setProductPrice(new BigDecimal(2988));
        productInfo.setProductDescription("A10 64位处理器");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(0);
        productInfo.setProductStock(1000);
        ProductInfo result = productInfoService.save(productInfo);
        Assert.assertNotNull(result);
    }
}