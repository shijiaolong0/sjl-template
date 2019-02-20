package com.sjl.jpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sjl.jpa.dataobject.SellerInfo; 


/**
 * Created by 廖师兄
 * 2017-07-23 23:04
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}
