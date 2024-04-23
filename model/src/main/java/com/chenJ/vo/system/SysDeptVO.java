package com.chenJ.vo.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.chenJ.model.base.BaseEntity;
import com.chenJ.model.system.SysDeptDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.model.system
 * @ClassName : SysDeptDO.java
 * @createTime : 2024/4/24 0:22
 * @Description :
 */
@Data
@ApiModel(description = "部门")
public class SysDeptVO extends SysDeptDO {

    @ApiModelProperty(value = "下级部门")
    private List<SysDeptVO> children;

}
