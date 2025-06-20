package com.project.demo.controller;

import com.project.demo.entity.ConsultationInformation;
import com.project.demo.service.ConsultationInformationService;
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
 * 咨询信息：(ConsultationInformation)表控制层
 *
 */
@RestController
@RequestMapping("/consultation_information")
public class ConsultationInformationController extends BaseController<ConsultationInformation, ConsultationInformationService> {

    /**
     * 咨询信息对象
     */
    @Autowired
    public ConsultationInformationController(ConsultationInformationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
