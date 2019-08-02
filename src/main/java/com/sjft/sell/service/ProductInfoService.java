package com.sjft.sell.service;

import com.sjft.sell.dto.CartDTO;
import com.sjft.sell.model.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品信息service
 */
public interface ProductInfoService {

    ProductInfo findById(String productId);

    /**
     * 查询所有上架的商品
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable page);

    ProductInfo save(ProductInfo productInfo);

    /**
     * 增加库存
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减少库存
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
