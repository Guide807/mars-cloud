package xian.woniu.mars.service.impl;

import org.springframework.stereotype.Service;
import xian.woniu.mars.entity.SysUser;
import xian.woniu.mars.mapper.SysUserMapper;
import xian.woniu.mars.service.SysUserService;

import javax.annotation.Resource;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/10
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(SysUser record) {
        return 0;
    }

    @Override
    public int insertSelective(SysUser record) {
        return 0;
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return 0;
    }

    @Override
    public SysUser selectByNameAndPwd(SysUser sysUser) {
        return userMapper.selectByNameAndPwd(sysUser);
    }
}
