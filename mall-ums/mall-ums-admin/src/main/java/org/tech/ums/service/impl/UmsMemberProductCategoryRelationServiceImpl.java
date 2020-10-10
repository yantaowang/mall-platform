package org.tech.ums.service.impl;

import org.tech.ums.model.UmsMemberProductCategoryRelation;
import org.tech.ums.mapper.UmsMemberProductCategoryRelationMapper;
import org.tech.ums.service.IUmsMemberProductCategoryRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员与产品分类关系表（用户喜欢的分类） 服务实现类
 * </p>
 *
 * @author wangyantao
 * @since 2020-10-11
 */
@Service
public class UmsMemberProductCategoryRelationServiceImpl extends ServiceImpl<UmsMemberProductCategoryRelationMapper, UmsMemberProductCategoryRelation> implements IUmsMemberProductCategoryRelationService {

}
