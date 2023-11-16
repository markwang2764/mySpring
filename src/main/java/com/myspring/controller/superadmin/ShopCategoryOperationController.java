package com.myspring.controller.superadmin;

import com.myspring.entity.bo.ShopCategory;
import com.myspring.entity.dto.Result;
import com.myspring.service.solo.ShopCategoryService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-16 21:28
 **/
public class ShopCategoryOperationController {
    private ShopCategoryService shopCategoryService;

    Result<Boolean> addShopCategory(HttpServletRequest req, HttpServletResponse response) {
        //        TODO 参数校验以及请求参数转化
        return shopCategoryService.addShopCategory(new ShopCategory());
    }
    Result<Boolean> removeShopCategory(HttpServletRequest req, HttpServletResponse response) {
        //        TODO 参数校验以及请求参数转化
        return shopCategoryService.removeShopCategory(1);
    }
    Result<Boolean> modifyShopCategory(HttpServletRequest req, HttpServletResponse response) {
        //        TODO 参数校验以及请求参数转化
        return shopCategoryService.modifyShopCategory(new ShopCategory());
    }

    Result<ShopCategory> queryShopCategoryById(HttpServletRequest req, HttpServletResponse response) {
        //        TODO 参数校验以及请求参数转化
    }

    Result<List<ShopCategory>> queryShopCategory(HttpServletRequest req, HttpServletResponse response) {
        //        TODO 参数校验以及请求参数转化
        return shopCategoryService.queryShopCategory(null, 1, 100);
    }
}
