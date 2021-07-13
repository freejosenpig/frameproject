package com.zktr.yuyi.controller.liangzheng;

import com.zktr.yuyi.entity.liangzheng.ABad;
import com.zktr.yuyi.service.liangzheng.ABadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@RestController
public class ABadController {
    @Resource
    private ABadService aBadService;

    @GetMapping("/selectAllBed")
    public List<ABad> selectAllBed(){
        return aBadService.selectAllBed();
    }
}
