package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(101, "LEE");
        Member memberKim = new Member(102, "KIM");
        Member memberShin = new Member(103, "SHIN");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberShin);

        memberArrayList.showAll();

        memberArrayList.removeMember(101);
        memberArrayList.showAll();
    }
}
