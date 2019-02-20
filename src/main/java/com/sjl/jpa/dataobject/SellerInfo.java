package com.sjl.jpa.dataobject;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data; 


/**
 * Created by 廖师兄
 * 2017-07-23 23:02
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;
}
