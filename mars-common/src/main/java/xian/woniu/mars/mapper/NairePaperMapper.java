package xian.woniu.mars.mapper;

import xian.woniu.mars.entity.NairePaper;

/**
* @author 47681
* @description 针对表【naire_paper(调查问卷表)】的数据库操作Mapper
* @createDate 2023-06-06 17:25:30
* @Entity xian.woniu.mars.entity.NairePaper
*/
public interface NairePaperMapper {

    int deleteByPrimaryKey(Long id);

    int insert(NairePaper record);

    int insertSelective(NairePaper record);

    NairePaper selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NairePaper record);

    int updateByPrimaryKey(NairePaper record);

}
