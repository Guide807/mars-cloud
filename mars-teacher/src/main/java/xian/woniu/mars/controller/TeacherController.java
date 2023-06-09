package xian.woniu.mars.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import xian.woniu.mars.entity.CareTeacher;
import xian.woniu.mars.service.TeacherService;
import xian.woniu.mars.utils.ResultVO;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/6
 */
@RestController
public class TeacherController {
    @Resource
    private TeacherService teacherService;

    @PostMapping("teacher/list")
    public ResultVO getAll(@RequestBody CareTeacher careTeacher) {
        PageHelper.startPage(careTeacher.getCurrentPage(),careTeacher.getPageSize(),true);
        List<CareTeacher> teachers = teacherService.getAll(careTeacher);
        PageInfo<CareTeacher> pageInfo = new PageInfo(teachers);
        for(int i = 0 ; i < teachers.size(); i++){
            teachers.get(i).setTotal((int) pageInfo.getTotal());
        }
        return pageInfo == null ? ResultVO.failure("老师信息查询失败") : ResultVO.success("查询成功",teachers);
    }

    @GetMapping("teacher/one/{id}")
    public ResultVO getOne(@PathVariable("id") Long teacherId) {
        CareTeacher teacher = teacherService.getOne(teacherId);
        return teacher == null ? ResultVO.failure("老师信息查询失败") : ResultVO.success("老师信息查询成功", teacher);
    }

    @DeleteMapping("teacher/deleteOne/{id}")
    public ResultVO deleteOne(@PathVariable("id") Long teacherId) {
        int teacher = teacherService.deleteByTeacherId(teacherId);
        return teacher == 0 ? ResultVO.failure("老师信息删除失败") : ResultVO.success("老师·信息删除成功", teacher);
    }

    @PostMapping("teacher/update")
    public ResultVO updateOne(@RequestBody CareTeacher careTeacher) {
        int teacher = teacherService.updateByTeacherIdSelective(careTeacher);
        return teacher == 0 ? ResultVO.failure("老师信息修改失败") : ResultVO.success("老师信息修改成功", teacher);
    }

    @PostMapping("teacher/add")
    public ResultVO addOne(@RequestBody CareTeacher careTeacher) {
        int teacher = teacherService.addTeacherSelective(careTeacher);
        return teacher == 0 ? ResultVO.failure("老师信息新增失败") : ResultVO.success("老师信息新增成功", teacher);
    }

    @PostMapping("teacher/deletMulti")
    public ResultVO deleteTeacherByIds(@RequestBody Long ids[]){
        return teacherService.deleteTeacherByIds(ids)>0?ResultVO.success("老师删除成功"):ResultVO.failure("老师删除失败");
    }

}
