package weapon;

import java.util.Random;

public abstract class Weapon {
  private int damageAmount;
  private int dexterityCost;
  private String weaponType;
  protected Random randNum = new Random();

  public Weapon (String weaponType) {
    this.weaponType = weaponType;
    this.damageAmount = 0; 
    this.dexterityCost = 0;

    // do nothing for now
  }

  //==============>>
  // GETTERS
  public int getDamageAmount() {
    return this.damageAmount;
  }
  public int getDexterityCost() {
    return this.dexterityCost;
  }
  public String getWeaponType() {
    return this.weaponType;
}

  //==============>>
  // SETTERS
  public void setDamageAmount(int damageAmount) {
    this.damageAmount = damageAmount;
  }
  public void setDexterityCost(int dexterityCost) {
    this.dexterityCost = dexterityCost;
  }
  // an abstract method is polymorphic
  // meaning the children determine how
  // this method will be implemented
  public abstract int strike(int attackType, int dexterity, int strength);

} // class
