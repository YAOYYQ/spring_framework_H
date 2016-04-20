package com.yao.dao;

import com.yao.entity.project;
import org.springframework.stereotype.Repository;

/**
 * Created by YAO on 15/12/23.
 */
@Repository
public class projectDao extends baseDao<project> {
    public projectDao() {
        super(project.class);
    }
}
