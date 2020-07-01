package com.quicktron.business.service;

import com.quicktron.business.entities.BucketTaskVO;
import com.quicktron.business.entities.ReportParamInVO;
import com.quicktron.business.entities.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fangyingsi on 2020-06-30.
 */
public interface IQueryBkSlotSerivce {

    List<BucketTaskVO> queryBucketTask(ReportParamInVO paramInVO, int curPage, int pageSize);

    List<BucketTaskVO> queryPickTask(ReportParamInVO paramInVO, int curPage, int pageSize);
}
