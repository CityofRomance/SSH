package cn.appsys.service.developer;

import cn.appsys.pojo.DevUser;

/**
 * @Program: AppInfoSystem
 * @Author: ROMANTIC
 * @Date: 2018/11/27 9:40
 **/
public interface DevUserService {
    /**
     * 用户登录
     * @param devCode
     * @param devPassword
     * @return
     */
    public DevUser login(String devCode, String devPassword) throws Exception;
}
