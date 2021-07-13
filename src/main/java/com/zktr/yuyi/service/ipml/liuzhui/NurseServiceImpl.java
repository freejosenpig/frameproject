package com.zktr.yuyi.service.ipml.liuzhui;

import com.zktr.yuyi.dao.liuzhui.ServiceNurseDao;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
import com.zktr.yuyi.service.liuzhui.NurseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *  serve_nurse 表服务实现类
 */
@Service("nurseService")
public class NurseServiceImpl implements NurseService {
    @Resource
    private ServiceNurseDao serviceNurseDao;
    /*
        根据id查询
     */
    @Override
    public ServiceNurse queryById(int nid) {
        return this.serviceNurseDao.selectByPrimaryKey(nid);
    }
    /*
        查询全部
     */
    @Override
    public List<ServiceNurse> queryAll() {
        return serviceNurseDao.selectAll();
    }

    /**
     * 多条件查询
     * @param serviceNurse
     * @return
     */
    @Override
    public List<ServiceNurse> queryAllByUser(ServiceNurse serviceNurse) {
        return this.serviceNurseDao.selectAllByNurse(serviceNurse);
    }

    /*
        根据id删除
     */
    @Override
    public boolean deleteById(int nid) {
        return this.serviceNurseDao.deleteByPrimaryKey(nid) > 0;
    }

    /*
        更新数据
     */
    @Override
    @Transactional
    public ServiceNurse update(ServiceNurse serviceNurse) {
        serviceNurseDao.updateByPrimaryKeySelective(serviceNurse);
        return serviceNurse;
    }
    /*
       插入数据
     */
    @Override
    @Transactional
    public ServiceNurse insert(ServiceNurse serviceNurse) {
        this.serviceNurseDao.insert(serviceNurse);
        return serviceNurse;
    }
}
