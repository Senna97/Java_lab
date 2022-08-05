package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberLee = new Member(102, "LEE");
        Member memberKim = new Member(101, "KIM");
        Member memberShin = new Member(103, "SHIN");

        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberKim);
        memberTreeMap.addMember(memberShin);

        memberTreeMap.showAllMember();

//        System.out.println();
//        memberTreeMap.removeMember(102);
//        memberTreeMap.showAllMember();
    }
}