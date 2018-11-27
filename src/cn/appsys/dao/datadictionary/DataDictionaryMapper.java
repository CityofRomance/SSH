package cn.appsys.dao.datadictionary;

import cn.appsys.pojo.DataDictionary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Program: AppInfoSystem
 * @Author: ROMANTIC
 * @Date: 2018/11/27 9:23
 **/
public interface DataDictionaryMapper {
    public List<DataDictionary> getDataDictionaryList(@Param("typeCode") String typeCode)throws Exception;
}
