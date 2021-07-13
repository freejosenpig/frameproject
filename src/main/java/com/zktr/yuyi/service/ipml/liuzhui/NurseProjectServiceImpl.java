package com.zktr.yuyi.service.ipml.liuzhui;

import com.zktr.yuyi.dao.liuzhui.ServeNurseLogDao;
import com.zktr.yuyi.dao.liuzhui.ServeNurseProjectDao;
import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.ServeNurseProject;
import com.zktr.yuyi.service.liuzhui.NurseProjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NurseProjectServiceImpl implements NurseProjectService {

    @Resource
    private ServeNurseProjectDao serveNurseProjectDao;
    /*
        根据id查询
     */
    @Override
    public ServeNurseProject queryById(int nid) {
        return this.serveNurseProjectDao.selectByPrimaryKey(nid);
    }
    /*
        查询全部
     */
    @Override
    public List<ServeNurseProject> queryAll() {
        return serveNurseProjectDao.selectAll();
    }
    /**
     * 多条件查询
     */
    @Override
    public List<ServeNurseProject> queryAllByUser(ServeNurseProject serveNurseProject) {
        return this.serveNurseProjectDao.selectAllByNurse(serveNurseProject);
    }

    /*
        根据id删除
     */
    @Override
    public boolean deleteById(int nid) {
        return this.serveNurseProjectDao.deleteByPrimaryKey(nid) > 0;
    }

    /*
        更新数据
     */
    @Override
    @Transactional
    public ServeNurseProject update(ServeNurseProject serveNurseProject) {
        serveNurseProjectDao.updateByPrimaryKeySelective(serveNurseProject);
        return serveNurseProject;
    }
    /*
       插入数据
     */
    @Override
    @Transactional
    public ServeNurseProject insert(ServeNurseProject serveNurseProject) {
        this.serveNurseProjectDao.insert(serveNurseProject);
        return serveNurseProject;
    }
    
}
