package xian.woniu.mars.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @TableName care_teacher
 */
@Data
public class CareTeacher implements Serializable {
    private Integer teacherId;

    private String teacherName;

    private String teacherGender;

    private Integer teacherNaireCount;

    private Integer teacherStudentCount;

    private Integer teacherSal;

    private Integer homeworkGuidanceTypeId;

    private Integer teacherLevelId;

    private Integer pageSize;
    private Integer currentPage;
    private Integer total;

    private static final long serialVersionUID = 1L;
}