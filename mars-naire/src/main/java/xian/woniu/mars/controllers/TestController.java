package xian.woniu.mars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xian.woniu.mars.remote.NaireRemote;
import xian.woniu.mars.utils.ResultVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/7
 */
@RestController
public class TestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private NaireRemote naireRemote;

    @GetMapping("/naire/lb")
    public ResultVO testLoadBalance(HttpServletRequest request) {
        ResultVO resultVO = restTemplate.getForObject( "http://mars-teacher/teacher/lb", ResultVO.class);
        return resultVO;
    }

    @GetMapping("/naire/test1")
    public ResultVO test(){
        return naireRemote.testInterceptor();
    }


}