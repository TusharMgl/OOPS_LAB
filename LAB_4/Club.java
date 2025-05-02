package LAB_4;

class Club { 
    static String clubName = "The Awesome Club";
    String memberName;
    public Club(String memberName) {
        this.memberName = memberName;
    }
    public static void displayClubName() {
        System.out.println("Club Name: " + clubName);
    }
    public void displayMemberName() {
        System.out.println("Member Name: " + memberName);
    }
    public static void main(String[] args) {

        Club member1 = new Club("Tushar");
        Club member2 = new Club("Nakul");
        Club member3 = new Club("Tilak");

        Club.displayClubName();
        member1.displayMemberName();
        member2.displayMemberName();
        member3.displayMemberName();
    }
}
