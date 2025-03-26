public class EnhancedPlayer {
    private String name;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(100, name, "Sword");
    }

    public EnhancedPlayer(int healthPercentage, String name, String weapon) {
        this.name = name;
        if (healthPercentage <= 0) {
            this.healthPercentage = 1;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            System.out.println("KO! The " + name + " is dead");
        }
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage += extraHealth;
        if (healthPercentage > 100) {
            healthPercentage = 100;
            System.out.println("The " + name + " health is " + healthPercentage + "% restored");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

}
