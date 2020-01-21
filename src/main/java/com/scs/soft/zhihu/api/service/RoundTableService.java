package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

public interface RoundTableService {
    /**
     * 查询所有圆桌
     * @return
     */
    List<RoundTable> getAllRoundTable();

    /***
     * 查询前4个圆桌
     * @Return
     */
    List<RoundTable> getRoundTable();
}