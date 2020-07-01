package com.quicktron.business.controller;

import com.alibaba.fastjson.JSONArray;
import com.quicktron.business.entities.BucketTaskVO;
import com.quicktron.business.entities.ReportParamInVO;
import com.quicktron.business.entities.User;
import com.quicktron.business.service.IQueryBkSlotSerivce;
import com.quicktron.business.service.impl.QueryBkSlotSerivceImpl;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import com.alibaba.fastjson.JSON;

@RestController
public class PcQyBuckSlotController {
    private static final Logger LOGGER = Logger.getLogger(QueryBkSlotSerivceImpl.class);

    @Resource
    private IQueryBkSlotSerivce queryBkSlotSerivce;

    /*
    查询搬运记录
    **/
    @ResponseBody
    @RequestMapping("/queryBucketTaskList")
    public String queryBucketTaskList(@RequestParam(value = "bucketCode",defaultValue = "0") String bucketCode){
        try {
            ReportParamInVO paramInVO = new ReportParamInVO();
            paramInVO.setBucketCode(bucketCode);
            List<BucketTaskVO> bucketTaskVOList = queryBkSlotSerivce.queryBucketTask(paramInVO,1,20);
            String returnResult = JSONArray.toJSON(bucketTaskVOList).toString();
            //            String json=JSON.toJSONString(user);//关键
            return returnResult;
        }catch(Exception e){
            LOGGER.error("Internal error:"+e.getMessage());
            return null;
        }

    }

    /*
    查询拣货任务
    **/
    @ResponseBody
    @RequestMapping("/queryPickTaskList")
    public List<BucketTaskVO> queryPickTaskList(@RequestParam(value = "bucketCode",defaultValue = "0") String bucketCode){
        try {
            ReportParamInVO paramInVO = new ReportParamInVO();
            paramInVO.setBucketCode(bucketCode);
            List<BucketTaskVO> bucketTaskVOList = queryBkSlotSerivce.queryBucketTask(paramInVO,1,20);
            return bucketTaskVOList;
        }catch(Exception e){
            LOGGER.error("Internal error:"+e.getMessage());
            return null;
        }

    }
}
