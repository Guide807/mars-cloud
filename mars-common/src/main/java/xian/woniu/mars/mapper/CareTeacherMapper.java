package xian.woniu.mars.mapper;

import xian.woniu.mars.entity.CareTeacher;

import java.util.List;

/**
* @author 47681
* @description 针对表【care_teacher(辅导老师)】的数据库操作Mapper
* @createDate 2023-06-06 14:59:23
* @Entity xian.woniu.mars.entity.CareTeacher
*/
public interface CareTeacherMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CareTeacher record);

    int insertSelective(CareTeacher record);

    CareTeacher selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CareTeacher record);

    int updateByPrimaryKey(CareTeacher record);

    List<CareTeacher> selectAll(CareTeacher careTeacher);

    int updateNaireCountById(Long teacherId);

    int deleteTeacherByIds(Long ids[]);

}
