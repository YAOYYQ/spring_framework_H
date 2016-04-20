package com.yao.dao;

import com.yao.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by YAO on 15/11/20.
 *
 */
public interface IUserDao extends JpaRepository<user,Long> {


}
