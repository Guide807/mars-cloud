package xian.woniu.mars.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName sys_user
 */
@Data
public class SysUser implements Serializable {
    private Integer userId;

    private String username;

    private String password;

    private String realname;

    private String photo;

    private static final long serialVersionUID = 1L;
}