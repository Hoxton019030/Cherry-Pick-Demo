package com.example.cherrypickdemo.service;

import com.example.cherrypickdemo.dao.MemberDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hoxton
 * @version 0.1.0
 * @since 0.1.0
 **/
@Service
@RequiredArgsConstructor
public class MemberService {

    final MemberDao memberDao;
}
