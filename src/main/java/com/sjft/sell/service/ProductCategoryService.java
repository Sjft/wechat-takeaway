package com.sjft.sell.service;

import com.sjft.sell.model.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    ProductCategory findById(Integer id);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
