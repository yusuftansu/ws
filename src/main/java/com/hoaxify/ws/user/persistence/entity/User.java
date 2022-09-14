package com.hoaxify.ws.user.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

//@EntityListeners(ConstraintListener.class)

@Getter
@Setter//@Where(clause = "is_enabled = true")
@Entity
@Table(name = "USER")
@SequenceGenerator(name = "SEQ_GEN_ID", sequenceName = "SEQ_USER", allocationSize = 1)
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @NotNull
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @NotNull
//    @Min(value = 3)
    @Column(name = "displayname", nullable = false, unique = true)
    private String displayName;

    @Column(name = "password")
    private String password;


}
