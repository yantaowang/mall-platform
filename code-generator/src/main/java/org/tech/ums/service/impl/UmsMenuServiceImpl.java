package org.tech.ums.service.impl;

import org.tech.ums.model.UmsMenu;
import org.tech.ums.mapper.UmsMenuMapper;
import org.tech.ums.service.IUmsMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台菜单表 服务实现类
 * </p>
 *
 * @author wangyantao
 * @since 2020-10-11
 */
@Service
public class UmsMenuServiceImpl extends ServiceImpl<UmsMenuMapper, UmsMenu> implements IUmsMenuService {

}
