package com.zktr.yuyi.service.ipml.liuzhui;

import com.zktr.yuyi.dao.liuzhui.ServeNursePlanDao;
import com.zktr.yuyi.dao.liuzhui.ServeNursePlanDao;
import com.zktr.yuyi.entity.liuzhui.NursePlan;
import com.zktr.yuyi.entity.liuzhui.NursePlan;
import com.zktr.yuyi.service.liuzhui.NursePlanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NursePlanServiceImpl implements NursePlanService {

    @Resource
    private ServeNursePlanDao serveNursePlanDao;
    /*
        根据id查询
     */
    @Override
    public NursePlan queryById(int nid) {
        return this.serveNursePlanDao.selectByPrimaryKey(nid);
    }
    /*
        查询全部
     */
    @Override
    public List<NursePlan> queryAll() {
        return serveNursePlanDao.selectAll();
    }

    /*
        根据id删除
     */
    @Override
    public boolean deleteById(int nid) {
        return this.serveNursePlanDao.deleteByPrimaryKey(nid) > 0;
    }

    /*
        更新数据
     */
    @Override
    @Transactional
    public NursePlan update(NursePlan nursePlan) {
        serveNursePlanDao.updateByPrimaryKeySelective(nursePlan);
        return nursePlan;
    }
    /*
       插入数据
     */
    @Override
    @Transactional
    public NursePlan insert(NursePlan nursePlan) {
        this.serveNursePlanDao.insert(nursePlan);
        return nursePlan;
    }
}
