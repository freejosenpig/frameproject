package com.zktr.yuyi.controller.lishaofeng;


import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.lishaofeng.MedicineDictionary;
import com.zktr.yuyi.service.lishaofeng.ipml.MedicineDictionaryServiceImp;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.ResponseWrapper;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class MedicineDictionaryController {
    @Autowired
    private MedicineDictionaryServiceImp medicineDictionaryServiceImp;
    @RequestMapping(value = "/MedicineDictionary",method = RequestMethod.GET)
    public AjaxResponse findMedicineDictionarySeting(){
        List<MedicineDictionary> selectdictionary = medicineDictionaryServiceImp.selectdictionary();
        return AjaxResponse.success(selectdictionary) ;
    }
    @RequestMapping(value = "/MedicineDictionarybypage",method = RequestMethod.PUT)
    public AjaxResponse findallMedicineDictionaryBypage(@RequestBody Map map){
        Object page = map.get("page");
        Object size = map.get("size");
        Object name =map.get("name");
        int page1 = Integer.parseInt(String.valueOf(page));
        int size1 = Integer.parseInt(String.valueOf(size));
        String name1=String.valueOf(name);
        PageInfo<MedicineDictionary> medicineDictionaryPageInfo = medicineDictionaryServiceImp.selectMedicineDictionarybypageandname(name1,page1, size1);
        return AjaxResponse.success(medicineDictionaryPageInfo) ;
    }


}
