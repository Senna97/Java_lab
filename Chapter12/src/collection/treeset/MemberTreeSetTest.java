package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(102, "LEE");
        Member memberKim = new Member(101, "KIM");
        Member memberShin = new Member(103, "SHIN");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberShin);

        memberTreeSet.showAll();
    }
}
