package xian.woniu.mars.mapper;

import xian.woniu.mars.entity.CareHomeworkGuidanceType;

/**
* @author 47681
* @description 针对表【care_homework_guidance_type(作业辅导类型表)】的数据库操作Mapper
* @createDate 2023-06-06 14:59:23
* @Entity xian.woniu.mars.entity.CareHomeworkGuidanceType
*/
public interface CareHomeworkGuidanceTypeMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CareHomeworkGuidanceType record);

    int insertSelective(CareHomeworkGuidanceType record);

    CareHomeworkGuidanceType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CareHomeworkGuidanceType record);

    int updateByPrimaryKey(CareHomeworkGuidanceType record);

}
