package com.myspring.service.combine;

import com.myspring.entity.dto.MainPageInfoDTO;
import com.myspring.entity.dto.Result;

/**
 * @program: mySpringFramework
 * @description:
 * @author: Mr.markWang 2764
 * @create: 2023-11-16 15:07
 **/
public interface HeadLineShopCategoryCombineService {
     Result<MainPageInfoDTO> getMainPageInfo();
}
