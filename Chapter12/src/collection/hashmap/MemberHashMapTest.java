package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(102, "LEE");
        Member memberKim = new Member(101, "KIM");
        Member memberShin = new Member(103, "SHIN");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberShin);

        memberHashMap.showAllMember();

        System.out.println();
        memberHashMap.removeMember(102);
        memberHashMap.showAllMember();
    }
}