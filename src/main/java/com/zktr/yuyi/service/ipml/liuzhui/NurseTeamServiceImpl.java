package com.zktr.yuyi.service.ipml.liuzhui;

import com.zktr.yuyi.dao.liuzhui.ServeNurseTeamDao;
import com.zktr.yuyi.dao.liuzhui.ServiceNurseDao;
import com.zktr.yuyi.entity.liuzhui.NurseTeam;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
import com.zktr.yuyi.service.liuzhui.NurseTeamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NurseTeamServiceImpl implements NurseTeamService {
    @Resource
    private ServeNurseTeamDao serveNurseTeamDao;
    /*
        根据id查询
     */
    @Override
    public NurseTeam queryById(int nid) {
        return this.serveNurseTeamDao.selectByPrimaryKey(nid);
    }
    /*
        查询全部
     */
    @Override
    public List<NurseTeam> queryAll() {
        return serveNurseTeamDao.selectAll();
    }

    /*
        根据id删除
     */
    @Override
    public boolean deleteById(int nid) {
        return this.serveNurseTeamDao.deleteByPrimaryKey(nid) > 0;
    }

    /*
        更新数据
     */
    @Override
    @Transactional
    public NurseTeam update(NurseTeam nurseTeam) {
        serveNurseTeamDao.updateByPrimaryKeySelective(nurseTeam);
        return nurseTeam;
    }
    /*
       插入数据
     */
    @Override
    @Transactional
    public NurseTeam insert(NurseTeam nurseTeam) {
        this.serveNurseTeamDao.insert(nurseTeam);
        return nurseTeam;
    }
}
