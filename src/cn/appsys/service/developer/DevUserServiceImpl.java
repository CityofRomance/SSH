package cn.appsys.service.developer;

import cn.appsys.dao.devuser.DevUserMapper;
import cn.appsys.pojo.DevUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Program: AppInfoSystem
 * @Author: ROMANTIC
 * @Date: 2018/11/27 9:40
 **/
@Service
public class DevUserServiceImpl implements DevUserService{
        @Resource
        private DevUserMapper mapper;
        @Override
        public DevUser login(String devCode, String devPassword) throws Exception {
            // TODO Auto-generated method stub
            DevUser user = null;
            user = mapper.getLoginUser(devCode);
            //匹配密码
            if(null != user){
                if(!user.getDevPassword().equals(devPassword))
                    user = null;
            }
            return user;
        }
}
