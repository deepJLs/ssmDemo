package com.mybatis.test.service;/**
 * Description xxx<br/>
 * Date:2019年06月16日
 *
 * @author: wxw
 * @version:1.0
 */

import com.mybatis.test.bean.Cost;
import com.mybatis.test.mapper.CostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CostService
 * @Author wxw
 * @Date  /
 * @Vesion 1.0
 * @Description //TODO 
 **/
@Service
public class CostService {
    @Autowired
    CostMapper costMapper ;
    public List<Cost> getCost(){
        return costMapper.getCost();
    }
}
