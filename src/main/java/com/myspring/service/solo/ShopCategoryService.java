package com.myspring.service.solo;

import com.myspring.entity.bo.ShopCategory;
import com.myspring.entity.dto.Result;

import java.util.List;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-16 14:58
 **/
public interface ShopCategoryService {
    Result<Boolean> addShopCategory(ShopCategory shopCategory);

    Result<Boolean> removeShopCategory(int shopCategoryId);

    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);

    Result<ShopCategory> queryShopCategoryById(int shopCategoryId);

    Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize);
}
