package cn.appsys.service.developer;

import cn.appsys.pojo.AppCategory;

import java.util.List;

/**
 * @Program: AppInfoSystem
 * @Author: ROMANTIC
 * @Date: 2018/11/27 9:32
 **/
public interface AppCategoryService {
    /**
     * 根据父节点parentId获取相应的分类列表
     * @param parentId
     * @return
     * @throws Exception
     */
    public List<AppCategory> getAppCategoryListByParentId(Integer parentId)throws Exception;
}
