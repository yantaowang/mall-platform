package org.tech.ums.service.impl;

import org.tech.ums.model.UmsPermission;
import org.tech.ums.mapper.UmsPermissionMapper;
import org.tech.ums.service.IUmsPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author wangyantao
 * @since 2020-10-11
 */
@Service
public class UmsPermissionServiceImpl extends ServiceImpl<UmsPermissionMapper, UmsPermission> implements IUmsPermissionService {

}
