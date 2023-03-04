package com.example.java_servlet.model;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name",length = 150)
    private String userName;

    @Column(name = "password",length = 150)
    private String password;

    @Column(name = "fullname",length = 150)
    private String fullname;

    @Column(name = "status")
    private Integer status;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "modified_date")
    private Timestamp modifiedDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;


}
