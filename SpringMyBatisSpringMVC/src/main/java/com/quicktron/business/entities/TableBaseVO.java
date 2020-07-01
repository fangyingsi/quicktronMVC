package com.quicktron.business.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class TableBaseVO implements Serializable {
    long serialVersionUID = 1L;
    /**
     *备注信息
     */
    private String remarks;
    /**
     *创建人账户id
     */
    private String createBy;
    /**
     *创建时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime = new Date();
    /**
     *最后更新人账户id
     */
    private String updateBy;
    /**
     *最后更新时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime = new Date();
}
