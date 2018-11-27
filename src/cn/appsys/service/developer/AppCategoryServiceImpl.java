package cn.appsys.service.developer;

import cn.appsys.dao.appcategory.AppCategoryMapper;
import cn.appsys.pojo.AppCategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Program: AppInfoSystem
 * @Author: ROMANTIC
 * @Date: 2018/11/27 9:33
 **/
@Service
public class AppCategoryServiceImpl implements AppCategoryService{
    @Resource
    private AppCategoryMapper mapper;

    @Override
    public List<AppCategory> getAppCategoryListByParentId(Integer parentId)
            throws Exception {
        // TODO Auto-generated method stub
        return mapper.getAppCategoryListByParentId(parentId);
    }
}
