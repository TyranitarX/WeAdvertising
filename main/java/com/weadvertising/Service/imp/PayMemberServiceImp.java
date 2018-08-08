package com.weadvertising.Service.imp;

import com.weadvertising.Controller.PayMemberController;
import com.weadvertising.Entity.PayMember;
import com.weadvertising.JPA.PayMemberJPA;
import com.weadvertising.Service.PayMemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayMemberServiceImp implements PayMemberService {
    Logger log = LoggerFactory.getLogger(PayMemberService.class);

    @Autowired
    PayMemberJPA payMemberJPA;
    @Override
    public List<PayMember> getAllMember() {
        return payMemberJPA.findAll();
    }
}
