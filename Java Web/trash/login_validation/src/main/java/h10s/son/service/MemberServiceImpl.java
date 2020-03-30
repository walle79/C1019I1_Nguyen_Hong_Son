package h10s.son.service;

import h10s.son.model.Member;
import h10s.son.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepository;
    @Override
    public Iterable<Member> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public void save(Member member) {
        memberRepository.save(member);
    }

}
