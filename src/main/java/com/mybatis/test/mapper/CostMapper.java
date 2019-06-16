package com.mybatis.test.mapper;/**
 * Description xxx<br/>
 * Date:2019年06月16日
 *
 * @author: wxw
 * @version:1.0
 */

import com.mybatis.test.bean.Cost;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName CostMap
 *
 *
 * per
 * @Author wxw
 * @Date  /
 * @Vesion 1.0
 * @Description //TODO 
 **/
@Repository
public interface CostMapper {

    public List<Cost> getCost();

    public void delet();
}
