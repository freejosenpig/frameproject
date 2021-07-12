package com.zktr.yuyi.dao.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.MedicineDictionary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicineDictionaryDao {
    int deleteByPrimaryKey(Integer mdId);

    int insert(MedicineDictionary record);

    int insertSelective(MedicineDictionary record);

    MedicineDictionary selectByPrimaryKey(Integer mdId);

    int updateByPrimaryKeySelective(MedicineDictionary record);

    int updateByPrimaryKey(MedicineDictionary record);
    List<MedicineDictionary>selectdictionary();
    List<MedicineDictionary>selectdictionarybylike(String name);
}
