package com.zktr.yuyi.service.cost;

import com.zktr.yuyi.dao.cost.CostPrestoreDao;
import com.zktr.yuyi.dao.cost.CostTypeDao;
import com.zktr.yuyi.entity.cost.CostPrestore;
import com.zktr.yuyi.service.cost.costprestoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class costprestoreServiceImpl implements costprestoreService {
    @Resource
    private CostPrestoreDao costPrestoreDao;
    //    新增预存
    @Transactional
    @Override
    public CostPrestore insertprestore(CostPrestore costPrestore) {
        costPrestore.setPrestoreOpid(1);
       costPrestoreDao.insert(costPrestore);
       return costPrestore;
    }

    //    根据编号修改预存
    @Transactional
    @Override
    public CostPrestore updateByKey(CostPrestore costPrestore) {
        costPrestoreDao.updateByKey(costPrestore);
        return costPrestore;
    }
    //    根据老人编号查询预存信息
    @Override
    public List<CostPrestore> selectByOldId(Integer oldId) {
        return  costPrestoreDao.selectByOldId(oldId);
    }
    //查询所有预存信息
    @Override
    public List<CostPrestore> selectAll() {
        return costPrestoreDao.selectAll();
    }

    @Override
    public CostPrestore updateById(CostPrestore costPrestore) {
        costPrestoreDao.updateById(costPrestore);
        return costPrestore;
    }
}
