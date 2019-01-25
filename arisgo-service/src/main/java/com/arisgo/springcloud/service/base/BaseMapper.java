package com.arisgo.springcloud.service.base;

import java.util.List;
import java.util.Map;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-24 16:23
 */
public interface BaseMapper<T> {

    List<T> getList(T t);

    List<T> getListByParams(Map<String, Object> map);

    T getEntityById(String id);

    // 时间 desc，只取第一个
    T getEntity(Map<String, Object> map);

    /**
     * 参数以cloum，value的形式交替传入.
     * 如果有多个数据则取desc第一个
     * @param params
     * @return
     */
    T getFirstEntity(Object... params);

    int insert(T t);

    int batchInsert(List<T> list);

    void update(T t);
    // 逻辑删除
    void del(String id);

    void batchDel(String ids);
    // 物理删除
    void delete(String id);

    void batchDelete(String ids);

}
