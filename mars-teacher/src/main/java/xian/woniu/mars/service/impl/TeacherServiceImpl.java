package xian.woniu.mars.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xian.woniu.mars.entity.CareTeacher;
import xian.woniu.mars.mapper.CareTeacherMapper;
import xian.woniu.mars.service.TeacherService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/6
 */
@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private CareTeacherMapper teacherMapper;

    public List<CareTeacher> getAll(CareTeacher careTeacher) {
        return teacherMapper.selectAll(careTeacher);
    }

    public CareTeacher getOne(Long id) {
        int i = teacherMapper.updateNaireCountById(id);
        return teacherMapper.selectByPrimaryKey(id);
    }

    public int deleteByTeacherId(Long id) {
        return teacherMapper.deleteByPrimaryKey(id);
    }

    public int addTeacher(CareTeacher record) {
        return teacherMapper.insert(record);
    }

    public int addTeacherSelective(CareTeacher record) {
        return teacherMapper.insertSelective(record);
    }

    public int updateByTeacherIdSelective(CareTeacher record) {
        return teacherMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByTeacherId(CareTeacher record) {
        return teacherMapper.updateByPrimaryKey(record);
    }

    public int deleteTeacherByIds(Long[] ids) {
        return teacherMapper.deleteTeacherByIds(ids);
    }
}
