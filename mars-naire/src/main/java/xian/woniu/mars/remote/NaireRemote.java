package xian.woniu.mars.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xian.woniu.mars.utils.ResultVO;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/7
 */
@FeignClient("mars-teacher")
public interface NaireRemote {
    @GetMapping("teacher/one/{id}")
    public ResultVO getOne(@PathVariable("id") Long teacherId);

    @GetMapping("/teacher/test1")
    public ResultVO testInterceptor();


}
