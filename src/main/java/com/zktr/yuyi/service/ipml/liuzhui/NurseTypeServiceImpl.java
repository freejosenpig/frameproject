package com.zktr.yuyi.service.ipml.liuzhui;

import com.zktr.yuyi.dao.liuzhui.ServeNurseTypeDao;
import com.zktr.yuyi.dao.liuzhui.ServeNurseTypeDao;
import com.zktr.yuyi.entity.liuzhui.NurseType;
import com.zktr.yuyi.service.liuzhui.NurseLogService;
import com.zktr.yuyi.service.liuzhui.NurseTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NurseTypeServiceImpl implements NurseTypeService {
    @Resource
    private ServeNurseTypeDao serveNurseTypeDao;
    /*
        根据id查询
     */
    @Override
    public NurseType queryById(int nid) {
        return this.serveNurseTypeDao.selectByPrimaryKey(nid);
    }
    /*
        查询全部
     */
    @Override
    public List<NurseType> queryAll() {
        return serveNurseTypeDao.selectAll();
    }

    /*
        根据id删除
     */
    @Override
    public boolean deleteById(int nid) {
        return this.serveNurseTypeDao.deleteByPrimaryKey(nid) > 0;
    }

    /*
        更新数据
     */
    @Override
    @Transactional
    public NurseType update(NurseType nurseType) {
        serveNurseTypeDao.updateByPrimaryKeySelective(nurseType);
        return nurseType;
    }
    /*
       插入数据
     */
    @Override
    @Transactional
    public NurseType insert(NurseType nurseTeam) {
        this.serveNurseTypeDao.insert(nurseTeam);
        return nurseTeam;
    }
}
