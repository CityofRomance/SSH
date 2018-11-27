package cn.appsys.dao.devuser;

import cn.appsys.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

/**
 * @Program: AppInfoSystem
 * @Author: ROMANTIC
 * @Date: 2018/11/27 9:25
 **/
public interface DevUserMapper {
    /**
     * 通过userCode获取User
     * @param userCode
     * @return
     * @throws Exception
     */
    public DevUser getLoginUser(@Param("devCode") String devCode)throws Exception;
}
