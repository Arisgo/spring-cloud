package com.arisgo.springcloud.service.utils;

import com.arisgo.springcloud.service.model.BaseEntity;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-21 17:23
 */
public class BaseService {

    @Resource
    private SqlSession session;

    public Page page(Integer pageNo, Integer pageSize, String sqlStatement, String sqlCount, BaseEntity entity) {
        return this.page(pageNo, pageSize, sqlStatement, sqlCount, entity);
    }

    public Page page(Integer pageNo, Integer pageSize, String sqlStatement, String sqlCount, Map<String, Object> map) {
        return this.page(pageNo, pageSize, sqlStatement, sqlCount, map);
    }

    public Page page(Integer pageNo, Integer pageSize, String sqlStatement, String sqlCount, Object params) {
        RowBounds row = new RowBounds(pageNo, pageSize);
        List<?> list = session.selectList(sqlStatement, params, row);
        Integer total = session.selectOne(sqlCount, params);
        return Page.newInstance(total, list);
    }

    public Result exception() {
        return Result.error("系统异常！请联系管理员！");
    }
}
