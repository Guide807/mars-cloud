package xian.woniu.mars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xian.woniu.mars.utils.ResultVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/7
 */
@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/teacher/lb")
    public ResultVO testLoadBalance(HttpServletRequest request) {
        return ResultVO.success("处理本次请求的naire-service实例端口：" + request.getServerPort(), null);
    }

    @GetMapping("/teacher/test1")
    public ResultVO testInterceptor(HttpServletRequest request) {
        System.out.println(request.getHeader("foo"));
        return  ResultVO.success(request.getHeader("foo"), null);
    }

}

