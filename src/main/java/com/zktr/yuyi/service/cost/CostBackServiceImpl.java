package com.zktr.yuyi.service.cost;

import com.zktr.yuyi.dao.cost.CostBackDao;
import com.zktr.yuyi.entity.cost.CostBack;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class CostBackServiceImpl implements CostBackService  {
    @Resource
    private CostBackDao costBackdao;

    //新增退住结算
    @Override
    @Transactional
    public CostBack insertcostback(CostBack costBack) {
        costBackdao.insert(costBack);
        return costBack;
    }


    //根据编号修改退住结算
    @Transactional
    @Override
    public CostBack updateByKey(CostBack costBack) {
        costBack.setBackTime(new Date());
        costBackdao.updateByKey(costBack);
        return costBack;
    }
    //编号根据老人编号查询退住信息
    @Override
    public CostBack selectByoldId(Integer oldId) {
        return costBackdao.selectByoldId(oldId);
    }

    @Override
    public List<CostBack> selectAll() {
        return costBackdao.selectAll();
    }

    @Override
    public List<CostBack> selectBycontion(String backname) {
        return costBackdao.selectBycontion(backname);
    }
    //根据老人编号修改退住结算
//    @Transactional
//    @Override
//    public CostBack updateisback(Integer oldId) {
//        return costBackdao.updateisback(oldId);
//    }
}
