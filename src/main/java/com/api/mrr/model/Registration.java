package com.api.mrr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mrr_registration")
@IdClass(RegistrationKey.class)
public class Registration  {

    @Id
    @Column(name ="user_no")
    private Long userNo;

    @Id
    @Column (name ="role_id")
    private Long roleId;

    @Column (name ="add_date")
    private Date addDate;

    @Column (name ="add_by")
    private String addBy;
}
