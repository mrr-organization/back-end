package com.api.mrr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(	name = "mrr_user",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "user_id"),
                @UniqueConstraint(columnNames = "user_email"),
                @UniqueConstraint(columnNames = "user_phone")
        })
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no")
    private Long userNo;

    @Column(name ="user_email")
    private String userEmail;

    @Column(name ="user_password")
    private String userPassword;

    @Column(name ="user_phone")
    private String userPhone;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "mrr_user_roles",
            joinColumns = @JoinColumn(name = "user_no"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();


    @Column(name ="user_f_name")
    private String userFName;

    @Column(name ="user_l_name")
    private String userLName;

    @Column(name ="user_full_name")
    private String userFullName;

    @Column(name ="user_id")
    private String userId;

    @Column(name ="enabled")
    private boolean enabled;

    @Column(name ="verification_code")
    private String verificationCode;

    public User(String userEmail, String userPassword, String userFullName) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userFullName = userFullName;
    }

}
