package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.ColumnItem;

import java.util.List;

public interface ColumnService {
    /**
     * 获取全部栏目
     * @return
     */
    List<ColumnItem> getAllColumns();

    /**
     * 获取前四个栏目
     * @return
     */
    List<ColumnItem> getTop4Columns();
}
