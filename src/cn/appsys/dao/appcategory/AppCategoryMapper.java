package cn.appsys.dao.appcategory;

import cn.appsys.pojo.AppCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Program: AppInfoSystem
 * @Author: ROMANTIC
 * @Date: 2018/11/27 9:11
 **/
public interface AppCategoryMapper {
    public List<AppCategory> getAppCategoryListByParentId(@Param("parentId") Integer parentId)throws Exception;
}
