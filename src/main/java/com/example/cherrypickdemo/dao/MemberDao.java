package com.example.cherrypickdemo.dao;

import com.example.cherrypickdemo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hoxton
 * @version 0.1.0
 * @since 0.1.0
 **/
@Repository
public interface MemberDao extends JpaRepository<Member,Integer> {
}
