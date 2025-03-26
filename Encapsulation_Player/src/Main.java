public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------\nUnencapsulated");

        /**Unencapsulated*/
        Player player = new Player();
        player.name = "Tim";
        player.health = 22;
        player.weapon = "Sword";
        int damage = 10;

        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());
        player.health = 200;
        player.loseHealth(7);
        System.out.println("Remaining Health = " + player.healthRemaining());

        System.out.println("---------------------\nEncapsulated");

        /**Encapsulation*/
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer(55, "Khan", "Light Saber");
        enhancedPlayer.loseHealth(15);
        System.out.println("Remaining Health = " + enhancedPlayer.healthRemaining());
        enhancedPlayer.loseHealth(7);
        System.out.println("Remaining Health = " + enhancedPlayer.healthRemaining());
        enhancedPlayer.restoreHealth(75);
        System.out.println("Remaining Health = " + enhancedPlayer.healthRemaining());
    }
}