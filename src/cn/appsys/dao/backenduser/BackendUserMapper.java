package cn.appsys.dao.backenduser;

import cn.appsys.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

/**
 * @Program: AppInfoSystem
 * @Author: ROMANTIC
 * @Date: 2018/11/27 9:22
 **/
public interface BackendUserMapper {

    /**
     * 通过userCode获取User
     * @param userCode
     * @return
     * @throws Exception
     */
    public BackendUser getLoginUser(@Param("userCode") String userCode)throws Exception;
}
