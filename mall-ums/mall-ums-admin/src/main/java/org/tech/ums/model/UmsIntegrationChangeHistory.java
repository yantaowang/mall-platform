package org.tech.ums.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 积分变化历史记录表
 * </p>
 *
 * @author wangyantao
 * @since 2020-10-11
 */
@Data
public class UmsIntegrationChangeHistory implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long memberId;

    /**
     * 改变类型：0->增加；1->减少
     */
    private Integer changeType;

    /**
     * 积分改变数量
     */
    private Integer changeCount;

    /**
     * 操作人员
     */
    private String operateMan;

    /**
     * 操作备注
     */
    private String operateNote;

    /**
     * 积分来源：0->购物；1->管理员修改
     */
    private Integer sourceType;

}
