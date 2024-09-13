package com.wl.project.model.dto.interfaceInfo;
/***********************************************************************
 * 版权所有(C) 纯米科技（上海）股份有限公司 2014-2023
 * Copyright 2014-2023 CHUNMI TECHNOLOGY CO..
 * <p/>
 * This software is the confidential and proprietary information of
 * CHUNMI Corporation ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with CHUNMI.
 ***********************************************************************/

import com.wl.project.common.PageRequest;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wanglong
 * @since 2024/9/13 14:29
 */
@Data
public class InterfaceInfoQueryRequest extends PageRequest implements Serializable {


    private static final long serialVersionUID = -1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 接口状态（0-关闭，1-开启）
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;

    /**
     * 创建人
     */
    private Long userId;


}
