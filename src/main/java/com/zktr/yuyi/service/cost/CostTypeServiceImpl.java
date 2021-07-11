package com.zktr.yuyi.service.cost;

import com.zktr.yuyi.dao.cost.CostTypeDao;
import com.zktr.yuyi.dao.cost.CostTypedetailsDao;
import com.zktr.yuyi.entity.cost.CostType;
import com.zktr.yuyi.entity.cost.CostTypedetails;
import com.zktr.yuyi.service.cost.CostTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class CostTypeServiceImpl implements CostTypeService {
    @Resource
    private CostTypeDao costTypedao;
    @Resource
    private CostTypedetailsDao costTypedetailsdao;
    //    新增费用类别
    @Transactional
    @Override
    public CostType insertcosttype(CostType costType) {
        costTypedao.insert(costType);
        return costType;
    }
    //   修改费用类别
    @Transactional
    @Override
    public CostType updateByKey(CostType costType) {
        costTypedao.insertSelective(costType);
        return costType;
    }
    //    查询所有费用类别
    @Override
    public List<CostType> selectAll() {
        return  costTypedao.selectAll();
    }

    //根据编号查询费用类别
    @Override
    public CostType findByKey(Integer typeId) {
        return costTypedao.selectByKey(typeId);
    }
    //-----------------------------------------------费用详情------------------------------------------------------------
    //新增费用详细
    @Transactional
    @Override
    public CostTypedetails insertdetails(CostTypedetails costTypedetails) {
       costTypedetailsdao.insertdetails(costTypedetails);
       return costTypedetails;
    }
    //修改费用详情
    @Transactional
    @Override
    public CostTypedetails updateByKey(CostTypedetails costTypedetails) {
        costTypedetailsdao.updateByKey(costTypedetails);
        return costTypedetails;
    }
    //    根据类别编号查询费用详情
    @Override
    public List<CostTypedetails> selectBytypeId(int typeId) {
       return costTypedetailsdao.selectBytypeId(typeId);
    }
    //    查询所有费用详情
    @Override
    public List<CostTypedetails> selectAlldetails() {
        return costTypedetailsdao.selectAll();
    }
    //    删除费用详情
    @Override
    public int deleteByPrimaryKey(Integer itemId) {
       int count= costTypedetailsdao.deleteByPrimaryKey(itemId);
       return count;
    }
}
