package xian.woniu.mars.service;

import xian.woniu.mars.entity.SysUser;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/10
 */
public interface SysUserService {

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);


    SysUser selectByNameAndPwd(SysUser sysUser);

}
