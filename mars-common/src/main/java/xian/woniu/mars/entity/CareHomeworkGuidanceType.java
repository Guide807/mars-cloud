package xian.woniu.mars.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName care_homework_guidance_type
 */
@Data
public class CareHomeworkGuidanceType implements Serializable {
    private Integer homeworkGuidanceTypeId;

    private Integer homeworkGuidanceTypeMaxCount;

    private Integer homeworkGuidanceTypePerCountComm;

    private Integer homeworkGuidanceTypePrice;

    private static final long serialVersionUID = 1L;
}