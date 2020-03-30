package h10s.son.service;

import h10s.son.model.Member;

import java.util.List;

public interface MemberService {
    Iterable<Member> findAll();

    void save(Member member);
}
