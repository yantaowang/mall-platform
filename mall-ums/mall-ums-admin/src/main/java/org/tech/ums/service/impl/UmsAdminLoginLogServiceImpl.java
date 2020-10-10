package org.tech.ums.service.impl;

import org.tech.ums.model.UmsAdminLoginLog;
import org.tech.ums.mapper.UmsAdminLoginLogMapper;
import org.tech.ums.service.IUmsAdminLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户登录日志表 服务实现类
 * </p>
 *
 * @author wangyantao
 * @since 2020-10-11
 */
@Service
public class UmsAdminLoginLogServiceImpl extends ServiceImpl<UmsAdminLoginLogMapper, UmsAdminLoginLog> implements IUmsAdminLoginLogService {

}
