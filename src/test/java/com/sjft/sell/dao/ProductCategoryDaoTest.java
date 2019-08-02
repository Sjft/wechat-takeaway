package com.sjft.sell.dao;

import com.sjft.sell.model.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = productCategoryDao.findById(1).orElse(null);
        System.out.println(productCategory.toString());
    }

    @Test
    public void insertTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("精选");
        productCategory.setCategoryType(1);
        productCategoryDao.save(productCategory);
    }

    @Test
    public void updateTest() {
        ProductCategory productCategory = productCategoryDao.findById(2).orElse(null);
        productCategory.setCategoryType(2);
        productCategoryDao.save(productCategory);
    }

    @Test
    public void savaTest() {
        ProductCategory productCategory = new ProductCategory("女生最爱", 3);
        ProductCategory result = productCategoryDao.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(0, 2, 3);
        List<ProductCategory> result = productCategoryDao.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());

    }

}