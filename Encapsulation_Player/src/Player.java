public class Player {
    public String name;
    public int health;
    public String weapon;

    public Player(){}

    public void loseHealth(int damage) {
        health -= damage;
        if(health <= 0) {
            System.out.println("KO! The " + name + " is dead");
        }
    }

    public void restoreHealth(int extraHealth) {
        health += extraHealth;
        if(health > 100) {
            health = 100;
            System.out.println("The " + name + " health is " + health + "% restored");
        }
    }

    public int healthRemaining() {
        return health;
    }
}
