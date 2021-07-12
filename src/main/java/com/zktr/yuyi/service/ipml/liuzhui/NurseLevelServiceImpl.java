package com.zktr.yuyi.service.ipml.liuzhui;

import com.zktr.yuyi.dao.liuzhui.ServeNurseLevelDao;
import com.zktr.yuyi.entity.liuzhui.ServeNurseLevel;
import com.zktr.yuyi.service.liuzhui.NurseLevelService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NurseLevelServiceImpl implements NurseLevelService {
    @Resource
    private ServeNurseLevelDao serveNurseLevelDao;
    /*
        根据id查询
     */
    @Override
    public ServeNurseLevel queryById(int nid) {
        return this.serveNurseLevelDao.selectByPrimaryKey(nid);
    }
    /*
        查询全部
     */
    @Override
    public List<ServeNurseLevel> queryAll() {
        return serveNurseLevelDao.selectAll();
    }

    /*
        根据id删除
     */
    @Override
    public boolean deleteById(int nid) {
        return this.serveNurseLevelDao.deleteByPrimaryKey(nid) > 0;
    }

    /*
        更新数据
     */
    @Override
    @Transactional
    public ServeNurseLevel update(ServeNurseLevel serveNurseLevel) {
        serveNurseLevelDao.updateByPrimaryKeySelective(serveNurseLevel);
        return serveNurseLevel;
    }
    /*
       插入数据
     */
    @Override
    @Transactional
    public ServeNurseLevel insert(ServeNurseLevel serveNurseLevel) {
        this.serveNurseLevelDao.insert(serveNurseLevel);
        return serveNurseLevel;
    }
}
