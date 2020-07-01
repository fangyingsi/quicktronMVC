package com.quicktron.business.service.impl;

import com.github.pagehelper.PageInfo;
import com.quicktron.business.dao.IQueryBucketSlotDao;
import com.quicktron.business.entities.BucketTaskVO;
import com.quicktron.business.entities.ReportParamInVO;
import com.quicktron.business.service.IQueryBkSlotSerivce;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QueryBkSlotSerivceImpl implements IQueryBkSlotSerivce {

    private static final Logger LOGGER = Logger.getLogger(QueryBkSlotSerivceImpl.class);

    @Resource
    private IQueryBucketSlotDao IQueryBucketSlotDao;

    /*
    查询搬运记录
    **/
    public List<BucketTaskVO> queryBucketTask(ReportParamInVO paramInVO, int curPage, int pageSize){
        LOGGER.info("aaaa");
//        PageInfo
        int pageNo = (curPage-1)*pageSize;
        return IQueryBucketSlotDao.queryBucketTask(paramInVO.getBucketCode(),pageNo,pageSize);
    }

    /*
    查询拣货记录
    **/
    public List<BucketTaskVO> queryPickTask(ReportParamInVO paramInVO, int curPage, int pageSize){
        LOGGER.info("aaaa");
        int pageNo = (curPage-1)*pageSize;
        return IQueryBucketSlotDao.queryPickTask(paramInVO,pageNo,pageSize);
    }
}
