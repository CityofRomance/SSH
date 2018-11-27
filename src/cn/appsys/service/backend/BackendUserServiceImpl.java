package cn.appsys.service.backend;

import cn.appsys.dao.backenduser.BackendUserMapper;
import cn.appsys.pojo.BackendUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @Program: AppInfoSystem
 * @Author: ROMANTIC
 * @Date: 2018/11/27 9:31
 **/
@Service
public class BackendUserServiceImpl  implements BackendUserService {
    @Resource
    private BackendUserMapper mapper;

    @Override
    public BackendUser login(String userCode, String userPassword) throws Exception {
        // TODO Auto-generated method stub
        BackendUser user = null;
        user = mapper.getLoginUser(userCode);
        //匹配密码
        if(null != user){
            if(!user.getUserPassword().equals(userPassword))
                user = null;
        }
        return user;
    }
}
