package com.weadvertising.JPA;

import com.weadvertising.Entity.PayMember;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PayMemberJPA extends BaseJPA<PayMember,Integer> {
    @Query(value = "select * from paymember ORDER BY pid ASC " ,nativeQuery = true)
    public List<PayMember> findAll();
}
