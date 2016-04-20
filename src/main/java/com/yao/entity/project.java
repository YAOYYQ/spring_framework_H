package com.yao.entity;

import javax.persistence.*;

/**
 * Created by YAO on 15/11/24.
 */
@Entity
@Table(name = "student_project")
public class project {
    private Long id;
    private String project;
    private user user;
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REFRESH })
    @JoinColumn(name = "sid")
    public com.yao.entity.user getUser() {
        return user;
    }

    public void setUser(com.yao.entity.user user) {
        this.user = user;
    }

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name="project",length=20)
    public String getProject(String math) {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
