package com.sky.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "员工分页查询条件")
public class EmployeePageQueryDTO implements Serializable {

    //
    @Schema(description = "员工名称")
    private String name;

    //页码
    @Schema(description = "页码")
    private int page;

    //每页显示记录数
    @Schema(description = "每页显示记录数")
    private int pageSize;

}
