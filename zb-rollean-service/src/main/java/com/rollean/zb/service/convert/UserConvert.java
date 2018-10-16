package com.rollean.zb.service.convert;

import com.rollean.zb.dal.model.TbUser;
import com.rollean.zb.domain.User;
import org.springframework.beans.BeanUtils;

/**
 * Created by rollean.
 */
public class UserConvert {

    public static User convertFundChannel(TbUser tbUser){
        User user = new User();
        BeanUtils.copyProperties(tbUser,user);
        return user;
    }

}
