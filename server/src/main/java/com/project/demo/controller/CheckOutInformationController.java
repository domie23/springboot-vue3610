package com.project.demo.controller;

import com.project.demo.entity.CheckOutInformation;
import com.project.demo.service.CheckOutInformationService;
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
 * 退房信息：(CheckOutInformation)表控制层
 *
 */
@RestController
@RequestMapping("/check_out_information")
public class CheckOutInformationController extends BaseController<CheckOutInformation, CheckOutInformationService> {

    /**
     * 退房信息对象
     */
    @Autowired
    public CheckOutInformationController(CheckOutInformationService service) {
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
        String sql = "SELECT MAX(check_out_information_id) AS max FROM "+"`check_out_information`";
        Query select = service.runCountSql(sql);
        Integer max = (Integer) select.getSingleResult();
        sql = "UPDATE `home_stay_information` INNER JOIN `check_out_information` ON home_stay_information.management_no=check_out_information.management_no SET home_stay_information.number_of_rooms= home_stay_information.number_of_rooms + check_out_information.scheduled_quantity WHERE check_out_information.check_out_information_id="+max;
        select = service.runCountSql(sql);
        select.executeUpdate();
        return success(1);
    }

}
