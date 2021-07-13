package com.zktr.yuyi.service.ipml.liuzhui;

import com.zktr.yuyi.dao.liuzhui.ServeNurseLogDao;
import com.zktr.yuyi.dao.liuzhui.ServiceNurseDao;
import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
import com.zktr.yuyi.service.liuzhui.NurseLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NurseLogServiceImpl implements NurseLogService {

    @Resource
    private ServeNurseLogDao serveNurseLogDao;
    /*
        根据id查询
     */
    @Override
    public NurseLog queryById(int nid) {
        return this.serveNurseLogDao.selectByPrimaryKey(nid);
    }
    /*
        查询全部
     */
    @Override
    public List<NurseLog> queryAll() {
        return serveNurseLogDao.selectAll();
    }
    /**
     * 多条件查询
     */
    @Override
    public List<NurseLog> queryAllByUser(NurseLog nurseLog) {
        return this.serveNurseLogDao.selectAllByNurse(nurseLog);
    }


    /*
        根据id删除
     */
    @Override
    public boolean deleteById(int nid) {
        return this.serveNurseLogDao.deleteByPrimaryKey(nid) > 0;
    }

    /*
        更新数据
     */
    @Override
    @Transactional
    public NurseLog update(NurseLog nurseLog) {
        serveNurseLogDao.updateByPrimaryKeySelective(nurseLog);
        return nurseLog;
    }
    /*
       插入数据
     */
    @Override
    @Transactional
    public NurseLog insert(NurseLog nurseLog) {
        this.serveNurseLogDao.insert(nurseLog);
        return nurseLog;
    }
}
