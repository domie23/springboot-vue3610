package com.project.demo.controller;

import com.project.demo.entity.HomeStayInformation;
import com.project.demo.service.HomeStayInformationService;
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
 * 民宿信息：(HomeStayInformation)表控制层
 *
 */
@RestController
@RequestMapping("/home_stay_information")
public class HomeStayInformationController extends BaseController<HomeStayInformation, HomeStayInformationService> {

    /**
     * 民宿信息对象
     */
    @Autowired
    public HomeStayInformationController(HomeStayInformationService service) {
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
