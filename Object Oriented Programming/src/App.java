public class App {
    public static void main(String[] args) {
        MemberCard goldCard = new GoldCard("Ohm Cambodia", 3000);
        System.out.println("Gold info");
        goldCard.display();
        System.out.println("****************");

        MemberCard silverCard = new SilverCard("Pete Pakret", 5000);
        System.out.println("Silver info");
        silverCard.display();
        System.out.println("****************");

        MemberCard diamondCard = new DiamondCard("Sub Roblox", 5000);
        System.out.println("Diamond info");
        diamondCard.display();
        System.out.println("****************");
        MemberCard platinumCard = new PlatinumCard("Fluke Handsome", 2500);
        System.out.println("Platinum info");
        platinumCard.display();
    }
}
