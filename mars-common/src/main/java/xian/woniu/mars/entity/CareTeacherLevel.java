package xian.woniu.mars.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName care_teacher_level
 */
@Data
public class CareTeacherLevel implements Serializable {
    private Integer teacherLevelId;

    private String teacherLevelName;

    private Integer teacherLevelCommon;

    private static final long serialVersionUID = 1L;
}