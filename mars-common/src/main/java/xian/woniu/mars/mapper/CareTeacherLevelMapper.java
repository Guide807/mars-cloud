package xian.woniu.mars.mapper;

import xian.woniu.mars.entity.CareTeacherLevel;

/**
* @author 47681
* @description 针对表【care_teacher_level(老师级别表)】的数据库操作Mapper
* @createDate 2023-06-06 14:59:23
* @Entity xian.woniu.mars.entity.CareTeacherLevel
*/
public interface CareTeacherLevelMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CareTeacherLevel record);

    int insertSelective(CareTeacherLevel record);

    CareTeacherLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CareTeacherLevel record);

    int updateByPrimaryKey(CareTeacherLevel record);

}
