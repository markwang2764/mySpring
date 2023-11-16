package com.myspring.service.combine.impl;

import com.myspring.entity.bo.HeadLine;
import com.myspring.entity.bo.ShopCategory;
import com.myspring.entity.dto.MainPageInfoDTO;
import com.myspring.entity.dto.Result;
import com.myspring.service.combine.HeadLineShopCategoryCombineService;
import com.myspring.service.solo.HeadLineService;
import com.myspring.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-16 15:10
 **/
public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {
    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;
    @Override
    public Result<?> getMainPageInfo() {
        HeadLine headLineCondition = new HeadLine();
        headLineCondition.setEnableStatus(1);
        Result<List<HeadLine>> headLineResult = headLineService.queryHeadLine(headLineCondition, 1, 4);
        ShopCategory shopCategoryCondition = new ShopCategory();
        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategory(shopCategoryCondition, 1, 100);
        Result<MainPageInfoDTO> result = mergeMainPageInfoResult(headLineResult, shopCategoryResult);
        return result;
    }

    private Result<MainPageInfoDTO> mergeMainPageInfoResult(Result<List<HeadLine>> headLineResult, Result<List<ShopCategory>> shopCategoryResult) {
        return null;
    }
}
