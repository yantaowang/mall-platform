package org.tech.ums.service.impl;

import org.tech.ums.model.UmsAdminPermissionRelation;
import org.tech.ums.mapper.UmsAdminPermissionRelationMapper;
import org.tech.ums.service.IUmsAdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author wangyantao
 * @since 2020-10-11
 */
@Service
public class UmsAdminPermissionRelationServiceImpl extends ServiceImpl<UmsAdminPermissionRelationMapper, UmsAdminPermissionRelation> implements IUmsAdminPermissionRelationService {

}
