package com.sjft.sell.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(0,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"商品数量不正确"),
    ORDER_NOT_EXIST(12,"订单不存在"),
    ORDERDEATIL_NOT_EXIST(13,"订单详情不存在"),
    ORDER_STATUS_ERROR(14,"订单状态异常"),
    ORDER_UPDATE_FAIL(15,"订单更新失败"),
    ORDER_DETAIL_EMPTY(16,"商品详情为空");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
