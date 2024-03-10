package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{
    private static Map<Long, Member> store = new HashMap<>();
    //여기서 new HashMap<>()는 Map 인터페이스를 구현한 HashMap 클래스의 인스턴스를 생성하는 코드입니다.
    // HashMap은 Map 인터페이스를 구현한 클래스 중 하나로, 키-값 쌍을 해시 테이블에 저장하여 빠른 검색 및 조회를 가능케 합니다.
//참고: `HashMap` 은 동시성 이슈가 발생할 수 있다. 이런 경우 `ConcurrentHashMap` 을 사용하자.
//그러면 member 클래스에 있는 Long 타입인 값은 Id 이니까 id  값을 store 에 저장한다는것 이겠지 ?
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);


    }
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }

}
