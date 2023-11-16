package com.myspring.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-16 13:39
 **/
@Data
public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
