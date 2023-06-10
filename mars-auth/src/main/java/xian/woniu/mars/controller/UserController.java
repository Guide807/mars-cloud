package xian.woniu.mars.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xian.woniu.mars.entity.SysUser;
import xian.woniu.mars.service.SysUserService;
import xian.woniu.mars.utils.ResultVO;

import javax.annotation.Resource;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/10
 */
@RestController
public class UserController {
    @Resource
    private SysUserService sysUserService;

    @PostMapping("/users/test1")
    public ResultVO Login(@RequestBody SysUser sysUser) {
        System.out.println(sysUser.getUsername());
        SysUser user = sysUserService.selectByNameAndPwd(sysUser);
        return  user == null ? ResultVO.failure("用户名密码不正确") : ResultVO.success("登陆成功",user);
    }


}
