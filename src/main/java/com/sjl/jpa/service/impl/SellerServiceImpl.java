package com.sjl.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.sjl.jpa.dataobject.SellerInfo;
import com.sjl.jpa.repository.SellerInfoRepository;
import com.sjl.jpa.service.SellerService;


/**
 * Created by 廖师兄
 * 2017-07-29 23:15
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
