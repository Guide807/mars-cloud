package xian.woniu.mars.service;

import xian.woniu.mars.entity.CareTeacher;

import java.util.List;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/6
 */
public interface TeacherService {

    List<CareTeacher> getAll(CareTeacher careTeacher);

    CareTeacher getOne(Long id);

    int deleteByTeacherId(Long id);

    int addTeacher(CareTeacher record);

    int addTeacherSelective(CareTeacher record);

    int updateByTeacherIdSelective(CareTeacher record);

    int updateByTeacherId(CareTeacher record);

    int deleteTeacherByIds(Long ids[]);

}
