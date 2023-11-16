package com.myspring.controller.frontend;

import com.myspring.entity.dto.MainPageInfoDTO;
import com.myspring.entity.dto.Result;
import com.myspring.service.combine.HeadLineShopCategoryCombineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-16 21:17
 **/
public class MainPageController {
    private HeadLineShopCategoryCombineService headLineShopCategoryCombineService;

    public Result<MainPageInfoDTO> getMainPageInfo(HttpServletRequest req, HttpServletResponse response) {
        return headLineShopCategoryCombineService.getMainPageInfo();
    }
}
