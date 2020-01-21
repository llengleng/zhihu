package com.scs.soft.zhihu.api.service.ipml;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.entity.Special;
import com.scs.soft.zhihu.api.mapper.RoundTableMapper;
import com.scs.soft.zhihu.api.mapper.SpecialMapper;
import com.scs.soft.zhihu.api.service.RoundTableService;
import com.scs.soft.zhihu.api.service.SpecialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RoundTableImpl implements RoundTableService {
    @Resource
    private RoundTableMapper roundTableMapper;

    @Override
    public List<RoundTable> getAllRoundTable() {
        return roundTableMapper.getAllRoundTable();
    }

    @Override
    public List<RoundTable> getRoundTable() {
        return roundTableMapper.getRoundTable();
    }
}
