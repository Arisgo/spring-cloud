package com.arisgo.springcloud.service.utils;

import java.util.List;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-22 10:50
 */
public class Page {

    private Integer total;
    private List<?> rows;

    public static Page newInstance() {
        return new Page();
    }

    public static Page newInstance(Integer total, List<?> rows) {
        Page page = new Page();
        page.setTotal(total);
        page.setRows(rows);
        return page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
