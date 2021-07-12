package com.zktr.yuyi.service.lishaofeng.ipml;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.dao.lishaofeng.MedicineDictionaryDao;
import com.zktr.yuyi.entity.lishaofeng.MedicineDictionary;
import com.zktr.yuyi.entity.lishaofeng.result.MedicationSetingsResult;
import com.zktr.yuyi.service.lishaofeng.MedicineDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MedicineDictionaryServiceImp implements MedicineDictionaryService {
    @Resource
    @Autowired
    private MedicineDictionaryDao dictionaryDao;

    @Override
    public List<MedicineDictionary> selectdictionary() {
        return dictionaryDao.selectdictionary();
    }

    @Override
    public int insertSelective(MedicineDictionary record) {
        return dictionaryDao.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(MedicineDictionary record) {
        return dictionaryDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer mdId) {
        return dictionaryDao.deleteByPrimaryKey(mdId);
    }

    @Override
    public List<MedicineDictionary> selectdictionarybylike(String name) {
        return dictionaryDao.selectdictionarybylike(name);
    }

    public PageInfo<MedicineDictionary> selectMedicineDictionarybypage(int page, int size){
        PageHelper.startPage(page, size);
        List<MedicineDictionary>medSetingbyperson =dictionaryDao.selectdictionary();
        PageInfo<MedicineDictionary> pageInfo = new PageInfo<>(medSetingbyperson);
        return pageInfo;
    }
    public PageInfo<MedicineDictionary> selectMedicineDictionarybypageandname(String name,int page, int size){
        PageHelper.startPage(page, size);
        List<MedicineDictionary>medSetingbyperson =dictionaryDao.selectdictionarybylike(name);
        PageInfo<MedicineDictionary> pageInfo = new PageInfo<>(medSetingbyperson);
        return pageInfo;
    }






}
