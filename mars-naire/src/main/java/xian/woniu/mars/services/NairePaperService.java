package xian.woniu.mars.services;

import xian.woniu.mars.entity.NairePaper;

import java.lang.reflect.InvocationTargetException;

public interface NairePaperService {

    public int savePaper(NairePaper nairePaper) throws InvocationTargetException, IllegalAccessException;
}
