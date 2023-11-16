package com.myspring.entity.dto;

import com.myspring.entity.bo.HeadLine;
import com.myspring.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-16 15:08
 **/
@Data
public class MainPageInfoDTO {
    private List<HeadLine> headLineList;
    private List<ShopCategory> shopCategoriesList;
}
