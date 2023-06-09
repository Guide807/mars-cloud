package xian.woniu.mars.services.impl;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import xian.woniu.mars.entity.CareTeacher;
import xian.woniu.mars.entity.NairePaper;
import xian.woniu.mars.mapper.NairePaperMapper;
import xian.woniu.mars.services.NairePaperService;
import xian.woniu.mars.utils.ResultVO;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@Service
@Transactional
public class NairePaperServiceImpl implements NairePaperService {

    @Resource
    private NairePaperMapper nairePaperMapper;
    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public int savePaper(NairePaper nairePaper) throws InvocationTargetException, IllegalAccessException {
        RestTemplate restTemplate = new RestTemplate();
        ResultVO resultVO = restTemplate.getForObject("http://localhost:8081/teacher/one/" + nairePaper.getTeacherId(), ResultVO.class);
        if (resultVO.getCode() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
            return 0;
        }
        Map map = (Map) resultVO.getData();
        CareTeacher careTeacher = new CareTeacher();
        BeanUtils.populate(careTeacher, map);
        nairePaper.setTeacherName(careTeacher.getTeacherName());
        return nairePaperMapper.insert(nairePaper);
    }
}
