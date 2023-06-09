package xian.woniu.mars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xian.woniu.mars.entity.NairePaper;
import xian.woniu.mars.remote.NaireRemote;
import xian.woniu.mars.services.NairePaperService;
import xian.woniu.mars.utils.ResultVO;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;

@RestController
public class NairePaperController {

    @Resource
    private NairePaperService nairePaperService;

    @Autowired
    private NaireRemote naireRemote;

    @PostMapping("paper/save")
    public ResultVO addPaper(@RequestBody NairePaper nairePaper) throws InvocationTargetException, IllegalAccessException {
       int count =  nairePaperService.savePaper(nairePaper);
       return count==0?ResultVO.failure("问卷增加失败"):ResultVO.success("问卷增加成功");
    }

    @GetMapping("/naire/lb/{id}")
    public ResultVO test(@PathVariable("id") Long id){
        return naireRemote.getOne(id);
    }


}
