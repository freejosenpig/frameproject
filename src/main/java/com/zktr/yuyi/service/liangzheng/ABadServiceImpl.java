package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.dao.liangzheng.ABadDao;
import com.zktr.yuyi.entity.liangzheng.ABad;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ABadServiceImpl implements ABadService {
    @Resource
    private ABadDao badDao;
    @Override
    public List<ABad> selectAllBed() {
        return badDao.selectAllBed();
    }
}
