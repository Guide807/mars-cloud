package xian.woniu.mars.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/6
 */
@Data
@AllArgsConstructor
@NoArgsConstructor //无参构造
public class ResultVO {
    private Integer code;
    private String msg;
    private Object data;

    public ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResultVO success() {
        return success("操作成功");
    }

    public static ResultVO success(String msg) {
        return success(msg, null);
    }

    public static ResultVO success(String msg, Object data) {
        ResultVO success = new ResultVO();
        success.setCode(HttpStatus.OK.value());//200
        success.setMsg(msg);
        success.setData(data);
        return success;
    }

    public static ResultVO failure() {
        return failure("操作失败");
    }

    public static ResultVO failure(String msg) {
        return failure(msg, null);
    }

    public static ResultVO failure(String msg, Object data) {
        ResultVO failure = new ResultVO();
        failure.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());//500
        failure.setMsg(msg);
        failure.setData(data);
        return failure;
    }
}
