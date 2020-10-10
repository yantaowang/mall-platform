package org.tech.ums.service.impl;

import org.tech.ums.model.UmsMember;
import org.tech.ums.mapper.UmsMemberMapper;
import org.tech.ums.service.IUmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author wangyantao
 * @since 2020-10-11
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements IUmsMemberService {

}
