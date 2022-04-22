/*This class represent a Squirtle object that extends from Pokemon and impelements the
* Water interface.
* @author Phillip Huynh
**/
public class Squirtle extends Pokemon implements Water {
  
  /**
  * This constructs a Squirtle object, where the string "Squirtle" is passed into super.
  */
  public Squirtle() {
    super("Squirtle");
  }
  
  /**
  * Method overrides Pokemon and gets the special attack menu from the Fire interface.
  * @return the menu of water special attacks.
  */
  @Override
  public String getSpecialMenu() {
    return Water.specialMenu;
  }

  /**
  * Method overrides Pokemon and gets prompts user to input the number
  * that corresponds to special attacks.
  * @return the number which corresponds to a water special attack
  */
  @Override
  public int getNumSpecialMenuItems() {
    int numSpecialMenuItem = CheckInput.getIntRange(1, Water.numSpecialMenuItems);
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
      specialAttack = this.waterGun(p);

    } else if (move == 2) {
      specialAttack = this.bubbleBeam(p);

    } else if (move == 3) {
      specialAttack = this.waterfall(p);
    }
    return specialAttack;
  }

  /**
  * Method generates a random damage, multiplies it depending on the defending pokemon type
  * and does damage to the defending pokemon. Overrides water interface.
  * @param p holds for a defending pokemon
  * @return the string of the attacking pokemon attacking the defending pokemon, along with damage calculated.
  */
  @Override
  public String waterGun(Pokemon p) {
    /*Initialize a string then add to it depending on what type of move is chosen, where
    a move is called using one of the methods below. */
    String strWaterGun = "";

    /*A random damage is generated and multplied based on the defending pokemon type, then
    damage is dealt. */
    int randNumDamage = (int) (Math.random() * 4) + 2;
    randNumDamage *= battleTable[this.getType()][p.getType()];
    int damageFinal = (int) randNumDamage;
    p.takeDamage(damageFinal);

    //Depending on the type of pokemon, different outputs of effectiveness are returned.
    if(p.getType() == 0) {
      strWaterGun += this.getName() + " used Water Gun on " + p.getName() + " and deals " + damageFinal + " damage.\nSuper Effective!";

    } else if(p.getType() == 1) {
      strWaterGun += this.getName() + " used Water Gun on " + p.getName() + " and deals " + damageFinal + " damage.";

    } else if(p.getType() == 2) {
      strWaterGun += this.getName() + " used Water Gun on " + p.getName() + " and deals " + damageFinal + " damage.\nIt was not very effective...";

    }
    return strWaterGun;
  }

  /**
  * Method generates a random damage, multiplies it depending on the defending pokemon type
  * and does damage to the defending pokemon. Overrides water interface.
  * @param p holds for a defending pokemon
  * @return the string of the attacking pokemon attacking the defending pokemon, along with damage calculated.
  */
  @Override
  public String bubbleBeam(Pokemon p){
    /*Initialize a string then add to it depending on what type of move is chosen, where
    a move is called using one of the methods below. */
    String strBubbleBeam = "";

    /*A random damage is generated and multplied based on the defending pokemon type, then
    damage is dealt. */
    int randNumDamage = (int) (Math.random() * 3) + 1;
    randNumDamage *= battleTable[this.getType()][p.getType()];
    int damageFinal = (int) randNumDamage;
    p.takeDamage(damageFinal);

    //Depending on the type of pokemon, different outputs of effectiveness are returned.
    if(p.getType() == 0) {
      strBubbleBeam += this.getName() + " used Bubble Beam on " + p.getName() + " and deals " + damageFinal + " damage.\nSuper Effective!";

    } else if(p.getType() == 1) {
      strBubbleBeam += this.getName() + " used Bubble Beam on " + p.getName() + " and deals " + damageFinal + " damage.";

    } else if(p.getType() == 2) {
      strBubbleBeam += this.getName() + " used Bubble Beam on " + p.getName() + " and deals " + damageFinal + " damage.\nIt was not very effective...";

    }
    return strBubbleBeam;
  }
  
  /**
  * Method generates a random damage, multiplies it depending on the defending pokemon type
  * and does damage to the defending pokemon. Overrides water interface.
  * @param p holds for a defending pokemon
  * @return the string of the attacking pokemon attacking the defending pokemon, along with damage calculated.
  */
  @Override
  public String waterfall(Pokemon p) {
    /*Initialize a string then add to it depending on what type of move is chosen, where
    a move is called using one of the methods below. */
    String strWaterfall = "";

    /*A random damage is generated and multplied based on the defending pokemon type, then
    damage is dealt. */
    int randNumDamage = (int) (Math.random() * 4) + 1;
    randNumDamage *= battleTable[this.getType()][p.getType()];
    int damageFinal = (int) randNumDamage;
    p.takeDamage(damageFinal);

    //Depending on the type of pokemon, different outputs of effectiveness are returned.
    if(p.getType() == 0) {
      strWaterfall += this.getName() + " used Waterfall on " + p.getName() + " and deals " + damageFinal + " damage.\nSuper Effective!";

    } else if(p.getType() == 1) {
      strWaterfall += this.getName() + " used Waterfall on " + p.getName() + " and deals " + damageFinal + " damage.";

    } else if(p.getType() == 2) {
      strWaterfall += this.getName() + " used Waterfall on " + p.getName() + " and deals " + damageFinal + " damage.\nIt was not very effective...";

    }
    return strWaterfall;
    
  }
  

}