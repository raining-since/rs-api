package com.rainingsince.system.permission.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.rainingsince.mybatis.entity.BaseDataEntity;
import lombok.Data;

@Data
@TableName("sys_permission")
public class SysPermissionEntity extends BaseDataEntity {

    private String code;
    private String name;
    private String parentCode;

}
