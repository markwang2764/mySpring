package com.myspring.entity.dto;

import lombok.Data;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-16 14:55
 **/
@Data
public class Result<T> {
    private int code;
    private String message;
    private T data;
}
