/*This class represent a Ponyta object that extends from Pokemon and impelements the
* Fire interface.
* @author Om Kakadiya
**/
public class Ponyta extends Pokemon implements Fire {

  /**
  * This constructs a Ponyta object, where the string "Ponyta" is passed into super.
  */
  public Ponyta() {
    super("Ponyta");
  }
  
  /**
  * Method overrides Pokemon and gets the special attack menu from the Fire interface.
  * @return the menu of fire special attacks.
  */
  @Override
  public String getSpecialMenu() {
    return Fire.specialMenu;
  }

  /**
  * Method overrides Pokemon and gets prompts user to input the number
  * that corresponds to special attacks.
  * @return the number which corresponds to a fire special attack
  */
  @Override
  public int getNumSpecialMenuItems() {
    int numSpecialMenuItem = CheckInput.getIntRange(1, Fire.numSpecialMenuItems);
    return numSpecialMenuItem;
  }
  
  /**
  * Method overrides Pokemon and does a special attack on another pokemon.
  * @param p holds for a pokemon defending against the attack.
  * @param move holds for a number that corresponds with a special attack. 
  * @return the special attack of the pokemon that is being used.
  */
  @Override
  public String specialAttack(Pokemon p, int move) {
    String specialAttack = "";
    
    /*Initialize a string then add to it depending on what type of move is chosen, where
    a move is called using one of the methods below. */
    if (move == 1) {
      specialAttack = this.ember(p);

    } else if (move == 2) {
      specialAttack = this.fireBlast(p);

    } else if (move == 3) {
      specialAttack = this.firePunch(p);
    }
    return specialAttack;
  }

  /**
  * Method generates a random damage, multiplies it depending on the defending pokemon type
  * and does damage to the defending pokemon. Overrides fire interface.
  * @param p holds for a defending pokemon
  * @return the string of the attacking pokemon attacking the defending pokemon, along with damage calculated.
  */
  @Override
  public String ember(Pokemon p) {
    /*Initialize a string then add to it depending on what type of move is chosen, where
    a move is called using one of the methods below. */
    String strEmber = "";

    /*A random damage is generated and multplied based on the defending pokemon type, then
    damage is dealt. */
    int randNumDamage = (int) (Math.random() * 5);
    randNumDamage *= battleTable[this.getType()][p.getType()];
    int damageFinal = (int) randNumDamage;
    p.takeDamage(damageFinal);

    //Depending on the type of pokemon, different outputs of effectiveness are returned.
    if(p.getType() == 0) {
      strEmber += this.getName() + " used Ember on " + p.getName() + " and deals " + damageFinal + " damage.";

    } else if(p.getType() == 1) {
      strEmber += this.getName() + " used Ember on " + p.getName() + " and deals " + damageFinal + " damage.\nIt was not very effective...";

    } else if(p.getType() == 2) {
      strEmber += this.getName() + " used Ember on " + p.getName() + " and deals " + damageFinal + " damage.\nSuper Effective!";

    }
    return strEmber;
  }

  /**
  * Method generates a random damage, multiplies it depending on the defending pokemon type
  * and does damage to the defending pokemon. Overrides fire interface.
  * @param p holds for a defending pokemon
  * @return the string of the attacking pokemon attacking the defending pokemon, along with damage calculated.
  */
  @Override
  public String fireBlast(Pokemon p){
    /*Initialize a string then add to it depending on what type of move is chosen, where
    a move is called using one of the methods below. */
    String strFireBlast = "";

    /*A random damage is generated and multplied based on the defending pokemon type, then
    damage is dealt. */
    int randNumDamage = (int) (Math.random() * 4) + 2;
    randNumDamage *= battleTable[this.getType()][p.getType()];
    int damageFinal = (int) randNumDamage;
    p.takeDamage(damageFinal);

    //Depending on the type of pokemon, different outputs of effectiveness are returned.
    if(p.getType() == 0) {
      strFireBlast += this.getName() + " used Fire Blast on " + p.getName() + " and deals " + damageFinal + " damage.";

    } else if(p.getType() == 1) {
      strFireBlast += this.getName() + " used Fire Blast on " + p.getName() + " and deals " + damageFinal + " damage.\nIt was not very effective...";

    } else if(p.getType() == 2) {
      strFireBlast += this.getName() + " used Fire Blast on " + p.getName() + " and deals " + damageFinal + " damage.\nSuper Effective!";

    }
    return strFireBlast;
  }
  
  /**
  * Method generates a random damage, multiplies it depending on the defending pokemon type
  * and does damage to the defending pokemon. Overrides fire interface.
  * @param p holds for a defending pokemon
  * @return the string of the attacking pokemon attacking the defending pokemon, along with damage calculated.
  */
  @Override
  public String firePunch(Pokemon p) {
    /*Initialize a string then add to it depending on what type of move is chosen, where
    a move is called using one of the methods below. */
    String strFirePunch = "";

    /*A random damage is generated and multplied based on the defending pokemon type, then
    damage is dealt. */
    int randNumDamage = (int) (Math.random() * 4) + 1;
    randNumDamage *= battleTable[this.getType()][p.getType()];
    int damageFinal = (int) randNumDamage;
    p.takeDamage(damageFinal);

    //Depending on the type of pokemon, different outputs of effectiveness are returned.
    if(p.getType() == 0) {
      strFirePunch += this.getName() + " used Fire Punch on " + p.getName() + " and deals " + damageFinal + " damage.";

    } else if(p.getType() == 1) {
      strFirePunch += this.getName() + " used Fire Punch on " + p.getName() + " and deals " + damageFinal + " damage.\nIt was not very effective...";

    } else if(p.getType() == 2) {
      strFirePunch += this.getName() + " used Fire Punch on " + p.getName() + " and deals " + damageFinal + " damage.\nSuper Effective!";

    }
    return strFirePunch;
    
  }
  

}