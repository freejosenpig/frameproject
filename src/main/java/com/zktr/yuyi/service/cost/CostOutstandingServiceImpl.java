package com.zktr.yuyi.service.cost;

import com.zktr.yuyi.dao.cost.CostOutstandingDao;
import com.zktr.yuyi.entity.cost.CostOutstanding;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class CostOutstandingServiceImpl implements CostOutstandingService {
    @Resource
    private CostOutstandingDao costOutstandingDao;

    //    新增欠费信息
    @Transactional
    @Override
    public CostOutstanding insert(CostOutstanding costOutstanding) {
        costOutstandingDao.insert(costOutstanding);
        return costOutstanding;
    }
    //根据编号修改欠费信息
    @Transactional
    @Override
    public CostOutstanding updateByKey(CostOutstanding costOutstanding) {
        costOutstandingDao.updateByKey(costOutstanding);
        return costOutstanding;
    }
    //    根据老人编号查询欠费信息
    @Override
    public List<CostOutstanding> selectByOldId(Integer oldId) {
        return costOutstandingDao.selectByOldId(oldId);
    }
    //查询所有欠费信息
    @Override
    public List<CostOutstanding> selectAll() {
        return costOutstandingDao.selectAll();
    }
}
