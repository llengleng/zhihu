package com.scs.soft.zhihu.api.service.ipml;

import com.scs.soft.zhihu.api.entity.ColumnItem;
import com.scs.soft.zhihu.api.mapper.ColumnMapper;
import com.scs.soft.zhihu.api.service.ColumnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ColumnServiceImpl implements ColumnService {
    @Resource
    private ColumnMapper columnMapper;

    @Override
    public List<ColumnItem> getAllColumns() {
        return columnMapper.getAllColumns();
    }

    @Override
    public List<ColumnItem> getTop4Columns() {
        return columnMapper.getTop4Columns();
    }
}
