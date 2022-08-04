package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(101, "LEE");
        Member memberKim = new Member(102, "KIM");
        Member memberShin = new Member(103, "SHIN");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberShin);

        memberHashSet.showAll();

        Member memberLee2 = new Member(101, "LEE2");
        memberHashSet.addMember(memberLee2);

        memberHashSet.showAll();

    }
}
