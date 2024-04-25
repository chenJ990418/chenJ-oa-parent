package com.chenJ.dto.system;

import com.chenJ.vo.system.SysRoleVO;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.dto.system
 * @ClassName : SysRoleQueryDTO.java
 * @createTime : 2024/4/25 23:44
 * @Description :
 */
@Data
@ApiModel(value = "角色查询DTO")
public class SysRoleQueryDTO extends SysRoleVO {
    private Integer pageNo;
    private Integer pageSize;
}
