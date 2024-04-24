package com.chenJ.vo.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.chenJ.model.base.BaseEntity;
import com.chenJ.model.system.SysMenuDO;
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
 * @ClassName : SysMenuDO.java
 * @createTime : 2024/4/24 0:29
 * @Description :
 */
@Data
@ApiModel(description = "菜单")
public class SysMenuVO extends SysMenuDO {

    // 下级列表
    @ApiModelProperty(value = "下级列表")
    private List<SysMenuVO> children;

    //是否选中
    @ApiModelProperty(value = "是否选中")
    private boolean isSelect;

}
