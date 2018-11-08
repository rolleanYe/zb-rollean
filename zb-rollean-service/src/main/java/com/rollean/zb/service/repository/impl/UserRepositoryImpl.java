package com.rollean.zb.service.repository.impl;

import com.rollean.zb.dal.mapper.TbUserMapper;
import com.rollean.zb.dal.model.TbUser;
import com.rollean.zb.domain.User;
import com.rollean.zb.service.convert.UserConvert;
import com.rollean.zb.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rollean.
 */
@Slf4j
@Service
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public User queryByName(String name) {
        log.info("===========开始============");
        TbUser tbUser = new TbUser();
        tbUser.setNickname(name);
        tbUser = tbUserMapper.selectOne(tbUser);

        User user = null;
        if(tbUser != null){
            user = UserConvert.convertUser(tbUser);
        }
        log.info("============结束===========");

        return user;
    }

    @Override
    public User queryById(String id) {

        TbUser tbUser =tbUserMapper.selectByPrimaryKey(new Integer(id));

        return UserConvert.convertUser(tbUser);
    }

    @Override
    public User loginQuery(String userName, String userPassword) {
        TbUser tbUser = tbUserMapper.loginQuery(userName,userPassword);
        return UserConvert.convertUser(tbUser);
    }

    @Override
    public User duplicateCheck(String nickname, String mobile, String email) {
        return null;
    }

    @Override
    public void insertUser(User user) {
        TbUser tbUser = UserConvert.convertTbUser(user);
        tbUserMapper.insert(tbUser);
    }
}
