package cn.appsys.service.backend;

import cn.appsys.pojo.BackendUser;

/**
 * @Program: AppInfoSystem
 * @Author: ROMANTIC
 * @Date: 2018/11/27 9:31
 **/
public interface BackendUserService {
    /**
     * 用户登录
     * @param userCode
     * @param userPassword
     * @return
     */
    public BackendUser login(String userCode, String userPassword) throws Exception;
}
