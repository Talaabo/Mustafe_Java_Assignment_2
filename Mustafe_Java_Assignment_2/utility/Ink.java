package utility;
import warrior.*;

/*
 * Class for all of our in-game prints
 */
public class Ink {

    public Ink() {
        // do nothing
    } // constructor

    public void welcome() {
        System.out.printf("""
                __        __             _             ____   ___ ____  _  _
                \\ \\      / /_ _ _ __ ___(_)_ __ ___   |___ \\ / _ \\___ \\| || |
                 \\ \\ /\\ / / _` | '__/ __| | '_ ` _ \\    __) | | | |__) | || |_
                  \\ V  V / (_| | |  \\__ \\ | | | | | |  / __/| |_| / __/|__   _|
                   \\_/\\_/ \\__,_|_|  |___/_|_| |_| |_| |_____|\\___/_____|  |_|
                """);
    } // welcome()

    public void printWarriorMenu() {
        System.out.println("#############################################");
        System.out.println("Pick your Warrior:");
        System.out.println("1. Human");
        System.out.println("2. Elf");
        System.out.println("3. Orc");
    }

    public void printWeaponMenu() {
        System.out.println("##############################################");
        System.out.println("Pick your Weapon:");
        System.out.println("1. Dagger");
        System.out.println("2. Sword");
        System.out.println("3. Axe");
    }

    public void printArmourMenu() {
        System.out.println("##############################################");
        System.out.println("Pick your Armour:");
        System.out.println("1. Leather");
        System.out.println("2. Chainmail");
        System.out.println("3. Platemail");
    }

    public void printAttackMenu() {
        System.out.println("##############################################");
        System.out.println("Select Attack Type:");
        System.out.println("1. Normal");
        System.out.println("2. Heavy");
    }

    public void printStats(Warrior player, Warrior enemy) {
        System.out.println("\n**********************************************");
        System.out.printf("* %-33s%-33s\n",
                "Player: " + player.getWarriorType(), "Enemy: " + enemy.getWarriorType());
        System.out.printf("* Health: %-25dHealth: %-25d\n", player.getHealth(),
                enemy.getHealth());
        System.out.printf("* Strength: %-23dStrength: %-23d\n",
                player.getStrength(), enemy.getDexterity());
        System.out.printf("* Dexterity: %-22dDexterity: %-22d\n",
                player.getDexterity(), enemy.getDexterity());
        System.out.println("\n**********************************************");
    }

    public void printGameOver(String winner) {
        System.out.printf("""
                ____                         ___
               / ___| __ _ _ __ ___   ___   / _ \\__   _____ _ __
              | |  _ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|
              | |_| | (_| | | | | | |  __/ | |_| |\\ V /  __/ |
               \\____|\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_|\n %s
                """, winner + " wins!");
    } // printGameOver()

} // class
