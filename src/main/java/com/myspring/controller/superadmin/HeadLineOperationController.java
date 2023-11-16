package com.myspring.controller.superadmin;

import com.myspring.entity.bo.HeadLine;
import com.myspring.entity.dto.Result;
import com.myspring.service.solo.HeadLineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-16 21:21
 **/
public class HeadLineOperationController {
    private HeadLineService headLineService;

    public Result<Boolean> addHeadLine(HttpServletRequest req, HttpServletResponse response) {
//        TODO 参数校验以及请求参数转化
        return headLineService.addHeadLine(new HeadLine());
    }
    public Result<Boolean> removeHeadLine(HttpServletRequest req, HttpServletResponse response) {
        //        TODO 参数校验以及请求参数转化
        return headLineService.removeHeadLine(1);
    }
    public Result<Boolean> modifyHeadLine(HttpServletRequest req, HttpServletResponse response) {
        //        TODO 参数校验以及请求参数转化
        return headLineService.modifyHeadLine(new HeadLine());
    }
    public Result<HeadLine> queryHeadLineById(HttpServletRequest req, HttpServletResponse response) {
        //        TODO 参数校验以及请求参数转化
        return headLineService.queryHeadLineById(1);
    }

    public Result<List<HeadLine>> queryHeadLine(HttpServletRequest req, HttpServletResponse response) {
        //        TODO 参数校验以及请求参数转化
        return headLineService.queryHeadLine(null, 1, 100);
    }
}
