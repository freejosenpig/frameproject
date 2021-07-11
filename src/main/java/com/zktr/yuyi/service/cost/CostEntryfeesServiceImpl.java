package com.zktr.yuyi.service.cost;

import com.zktr.yuyi.dao.cost.CostEntryfeesDao;
import com.zktr.yuyi.entity.cost.CostEntryfees;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class CostEntryfeesServiceImpl implements CostEntryfeesService {
    @Resource
    private CostEntryfeesDao costEntryfeesDao;

    //    新增缴费
    @Transactional
    @Override
    public CostEntryfees insertentryfees(CostEntryfees costEntryfees) {
        costEntryfeesDao.insert(costEntryfees);
        return costEntryfees;
    }
    //    根据编号修改缴费
    @Override
    @Transactional
    public CostEntryfees updateByKey(CostEntryfees costEntryfees) {
        costEntryfeesDao.updateByKey(costEntryfees);
        return costEntryfees;
    }
    //根据老人编号查询缴费信息
    @Override
    public List<CostEntryfees> selectByoldId(Integer oldId) {
        return costEntryfeesDao.selectByoldId(oldId);
    }
    //查询所有缴费信息
    @Override
    public List<CostEntryfees> selectAll() {
        return costEntryfeesDao.selectAll();
    }
}
