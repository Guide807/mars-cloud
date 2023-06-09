package xian.woniu.mars.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName naire_paper
 */
@Data
public class NairePaper implements Serializable {
    private Integer paperId;

    private String paperTitle;

    private Integer paperStatus;

    private Integer teacherId;

    private String teacherName;

    private static final long serialVersionUID = 1L;
}