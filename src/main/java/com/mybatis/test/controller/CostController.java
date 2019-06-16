package com.mybatis.test.controller;/**
 * Description xxx<br/>
 * Date:2019年06月16日
 *
 * @author: wxw
 * @version:1.0
 */

import com.mybatis.test.bean.Cost;
import com.mybatis.test.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @ClassName CostController
 * @Author wxw
 * @Date  /
 * @Vesion 1.0
 * @Description //TODO 
 **/
@Controller
public class CostController {
@Autowired
    CostService costService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody List<Cost> check(HttpServletRequest request, HttpServletResponse response) {

        return costService.getCost();
    }

}
