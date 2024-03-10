package Hello.core.discount;

import Hello.core.Member.Member;

public interface discountPolicy {
    int  discount(Member member, int price);

}
