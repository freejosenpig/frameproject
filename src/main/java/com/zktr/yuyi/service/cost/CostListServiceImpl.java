package com.zktr.yuyi.service.cost;

import com.zktr.yuyi.dao.cost.CostListDao;
import com.zktr.yuyi.entity.cost.CostList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class CostListServiceImpl implements CostListService {
    @Resource
    private CostListDao costListDao;
//    根据编号修改流水信息
    @Transactional
    @Override
    public CostList updateByKey(CostList costList) {
        costListDao.updateByKey(costList);
        return costList;
    }
    //新增流水信息
    @Transactional
    @Override
    public CostList insertLCostist(CostList costList) {
        costList.setLiatOpid(1);
        costList.setListTime(new Date());
        costListDao.insert(costList);
        return costList;
    }

    //    根据老人编号查询流水信息
    @Override
    public List<CostList> selectByOldId(Integer oldId) {
        return costListDao.selectByOldId(oldId);
    }

    //查询所有流水信息
    @Override
    public List<CostList> selectAll() {
        return costListDao.selectAll();
    }

    @Override
    public List<CostList> selectBycontion(String oldpeopleName) {
        return  costListDao.selectBycontion(oldpeopleName);
    }


}
