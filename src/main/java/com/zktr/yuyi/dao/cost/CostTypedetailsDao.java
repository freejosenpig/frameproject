package com.zktr.yuyi.dao.cost;

import com.zktr.yuyi.entity.cost.CostTypedetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CostTypedetailsDao {
    //    删除费用详情
    int deleteByPrimaryKey(Integer itemId);
    //    新增费用类别详细
    int insertdetails(CostTypedetails costTypedetails);

    int insertSelective(CostTypedetails record);

    CostTypedetails selectByPrimaryKey(Integer itemId);
    //    修改费用详情
    int updateByKey(CostTypedetails costTypedetails);

    int updateByPrimaryKey(CostTypedetails record);

    //    根据类别编号查询费用详情
    List<CostTypedetails> selectBytypeId(int typeId);
    //    查询所有费用详情
    List<CostTypedetails> selectAll();
}