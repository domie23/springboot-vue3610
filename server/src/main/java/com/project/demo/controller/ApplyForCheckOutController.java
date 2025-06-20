package com.project.demo.controller;

import com.project.demo.entity.ApplyForCheckOut;
import com.project.demo.service.ApplyForCheckOutService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 申请退房：(ApplyForCheckOut)表控制层
 *
 */
@RestController
@RequestMapping("/apply_for_check_out")
public class ApplyForCheckOutController extends BaseController<ApplyForCheckOut, ApplyForCheckOutService> {

    /**
     * 申请退房对象
     */
    @Autowired
    public ApplyForCheckOutController(ApplyForCheckOutService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapreservation_no = new HashMap<>();
        mapreservation_no.put("reservation_no",String.valueOf(paramMap.get("reservation_no")));
        List listreservation_no = service.select(mapreservation_no, new HashMap<>()).getResultList();
        if (listreservation_no.size()>0){
            return error(30000, "字段预定号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
