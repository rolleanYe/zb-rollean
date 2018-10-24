package com.rollean.zb.service.convert;

import com.rollean.zb.dal.model.TbUser;
import com.rollean.zb.domain.User;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rollean.
 */
public class UserConvert {

    public static User convertUser(TbUser tbUser){
        User user = new User();
        BeanUtils.copyProperties(tbUser,user);
        return user;
    }


    public static List<User> convertUserList(List<TbUser> tbUserList){
        if(tbUserList == null || tbUserList.size() == 0){
            return null;
        }

        List<User> userList = new ArrayList();
        for(TbUser tbUser : tbUserList){
            userList.add(convertUser(tbUser));
        }

        return userList;
    }

}
