package com.zktr.yuyi.service.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.MedicineDictionary;

import java.util.List;

public interface MedicineDictionaryService {
    List<MedicineDictionary> selectdictionary();
    int insertSelective(MedicineDictionary record);
    int updateByPrimaryKeySelective(MedicineDictionary record);
    int deleteByPrimaryKey(Integer mdId);
    List<MedicineDictionary>selectdictionarybylike(String name);


}
