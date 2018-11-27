package cn.appsys.service.developer;

import cn.appsys.pojo.DataDictionary;

import java.util.List;

/**
 * @Program: AppInfoSystem
 * @Author: ROMANTIC
 * @Date: 2018/11/27 9:38
 **/
public interface DataDictionaryService {
    /**
     * 根据typeCode查询相应的数据字典列表
     * @param typeCode
     * @return
     * @throws Exception
     */
    public List<DataDictionary> getDataDictionaryList(String typeCode)throws Exception;
}
