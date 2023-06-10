package xian.woniu.mars.mapper;

import xian.woniu.mars.entity.SysUser;

/**
* @author 47681
* @description 针对表【sys_user(员工表)】的数据库操作Mapper
* @createDate 2023-06-10 10:25:52
* @Entity xian.woniu.mars.entity.SysUser
*/
public interface SysUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);


    SysUser selectByNameAndPwd(SysUser sysUser);

}
