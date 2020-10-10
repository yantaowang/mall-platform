package org.tech.ums.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 后台用户登录日志表
 * </p>
 *
 * @author wangyantao
 * @since 2020-10-11
 */
@Data
public class UmsAdminLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long adminId;

    private String ip;

    private String address;

    /**
     * 浏览器登录类型
     */
    private String userAgent;
}
