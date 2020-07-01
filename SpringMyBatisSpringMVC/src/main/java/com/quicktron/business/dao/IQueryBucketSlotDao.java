package com.quicktron.business.dao;

import com.quicktron.business.entities.BucketTaskVO;
import com.quicktron.business.entities.ReportParamInVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IQueryBucketSlotDao {

    List<BucketTaskVO> queryBucketTask(@Param("_bucket")String bucketCode, @Param("_curPage") int curPage, @Param("_pageSize") int pageSize);

    List<BucketTaskVO> queryPickTask(@Param("_vo")ReportParamInVO paramInVO, @Param("_curPage") int curPage, @Param("_pageSize") int pageSize);
}
