package com.quanhui.huilai.model.dto;

import com.quanhui.huilai.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class TeamQuery extends PageRequest {
    /**
     * id
     */
    private Long id;

    /**
     * 队伍名称
     */
    private String name;

    /**
     * 搜索关键词 (同时对队伍名称和描述搜索)
     */
    private String searchText;


    /**
     * 描述
     */
    private String description;

    /**
      *  id 列表
     */
    private List<Long> idList;

    /**
     * 最大人数
     */
    private Integer maxNum;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 0 - 公开，1 - 私有，2 - 加密
     */
    private Integer status;
}