package com.sjft.sell.vo;

import lombok.Data;

@Data
public class ResultVO<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 信息
     */
    private String message;

    private T data;
}
