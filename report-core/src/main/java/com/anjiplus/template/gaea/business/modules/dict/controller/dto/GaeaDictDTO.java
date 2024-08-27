package com.anjiplus.template.gaea.business.modules.dict.controller.dto;

import com.anji.plus.gaea.curd.dto.GaeaBaseDTO;
import lombok.Data;

import java.io.Serializable;

/**
 * (GaeaDict)实体类
 *
 * @author lr
 * @since 2021-02-23 10:01:02
 */
@Data
public class GaeaDictDTO extends GaeaBaseDTO implements Serializable {
    /**
     * 字典名称
     */
    private String dictName;
    /**
     * 字典编号
     */
    private String dictCode;
    /**
     * 字典描述
     */
    private String remark;

}
