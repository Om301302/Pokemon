/*This class represent a Bulbasaur object that extends from Pokemon and impelements the
* Grass interface.
* @author Gabriel Villanueva
**/
public class Bulbasaur extends Pokemon implements Grass {

  /**
  * This constructs a Bulbasaur object, where the string "Bulbasaur" is passed into super.
  */
  public Bulbasaur() {
    super("Bulbasaur");
  }

  /**
  * Method overrides Pokemon and gets the special attack menu from the Grass interface.
  * @return the menu of grass special attacks.
  */
  @Override
  public String getSpecialMenu() {
    return Grass.specialMenu;
  }

  /**
  * Method overrides Pokemon and gets prompts user to input the number
  * that corresponds to special attacks.
  * @return the number which corresponds to a grass special attack
  */
  @Override
  public int getNumSpecialMenuItems() {
    int numSpecialMenuItem = CheckInput.getIntRange(1, Grass.numSpecialMenuItems);
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

    /*Initialize a string then add to it depending on what type of move is chosen, where
    a move is called using one of the methods below. */
    String specialAttack = "";

    if (move == 1) {
      specialAttack = this.vineWhip(p);

    } else if (move == 2) {
      specialAttack = this.razorLeaf(p);

    } else if (move == 3) {
      specialAttack = this.solarBeam(p);
    }
    return specialAttack;
  }

  /**
  * Method generates a random damage, multiplies it depending on the defending pokemon type
  * and does damage to the defending pokemon. Overrides grass inteface.
  * @param p holds for a defending pokemon
  * @return the string of the attacking pokemon attacking the defending pokemon, along with damage calculated.
  */
  @Override
  public String vineWhip(Pokemon p) {
    /*Initialize a string then add to it depending on what type of move is chosen, where
    a move is called using one of the methods below. */
    String strVineWhip = "";

    /*A random damage is generated and multplied based on the defending pokemon type, then
    damage is dealt. */
    int randNumDamage = (int) (Math.random() * 3) + 1;
    randNumDamage *= battleTable[this.getType()][p.getType()];
    int damageFinal = (int) randNumDamage;
    p.takeDamage(damageFinal);

    //Depending on the type of pokemon, different outputs of effectiveness are returned.
    if(p.getType() == 0) {
      strVineWhip += this.getName() + " used Vine Whip on " + p.getName() + " and deals " + damageFinal + " damage.\nIt was not very effective...";

    } else if(p.getType() == 1) {
      strVineWhip += this.getName() + " used Vine Whip on " + p.getName() + " and deals " + damageFinal + " damage.\nSuper Effective!";

    } else if(p.getType() == 2) {
      strVineWhip += this.getName() + " used Vine Whip on " + p.getName() + " and deals " + damageFinal + " damage.";

    }
    return strVineWhip;
  }

  /**
  * Method generates a random damage, multiplies it depending on the defending pokemon type
  * and does damage to the defending pokemon. Overrides grass interface.
  * @param p holds for a defending pokemon
  * @return the string of the attacking pokemon attacking the defending pokemon, along with damage calculated.
  */
  @Override
  public String razorLeaf(Pokemon p){
    /*Initialize a string then add to it depending on what type of move is chosen, where
    a move is called using one of the methods below. */
    String strRazorLeaf = "";

    /*A random damage is generated and multplied based on the defending pokemon type, then
    damage is dealt. */
    int randNumDamage = (int) (Math.random() * 3) + 2;
    randNumDamage *= battleTable[this.getType()][p.getType()];
    int damageFinal = (int) randNumDamage;
    p.takeDamage(damageFinal);

    //Depending on the type of pokemon, different outputs of effectiveness are returned.
    if(p.getType() == 0) {
      strRazorLeaf += this.getName() + " used Razor Leaf on " + p.getName() + " and deals " + damageFinal + " damage.\nIt was not very effective...";

    } else if(p.getType() == 1) {
      strRazorLeaf += this.getName() + " used Razor Leaf on " + p.getName() + " and deals " + damageFinal + " damage.\nSuper Effective!";

    } else if(p.getType() == 2) {
      strRazorLeaf += this.getName() + " used Razor Leaf on " + p.getName() + " and deals " + damageFinal + " damage.";

    }
    return strRazorLeaf;
  }
  
  /**
  * Method generates a random damage, multiplies it depending on the defending pokemon type
  * and does damage to the defending pokemon. Overrides grass interface.
  * @param p holds for a defending pokemon
  * @return the string of the attacking pokemon attacking the defending pokemon, along with damage calculated.
  */
  @Override
  public String solarBeam(Pokemon p) {
    /*Initialize a string then add to it depending on what type of move is chosen, where
    a move is called using one of the methods below. */
    String strSolarBeam = "";

    /*A random damage is generated and multplied based on the defending pokemon type, then
    damage is dealt. */
    int randNumDamage = (int) (Math.random() * 6);
    randNumDamage *= battleTable[this.getType()][p.getType()];
    int damageFinal = (int) randNumDamage;
    p.takeDamage(damageFinal);

    //Depending on the type of pokemon, different outputs of effectiveness are returned.
    if(p.getType() == 0) {
      strSolarBeam += this.getName() + " used Solar Beam on " + p.getName() + " and deals " + damageFinal + " damage.\nIt was not very effective...";

    } else if(p.getType() == 1) {
      strSolarBeam += this.getName() + " used Solar Beam on " + p.getName() + " and deals " + damageFinal + " damage.\nSuper Effective!";

    } else if(p.getType() == 2) {
      strSolarBeam += this.getName() + " used Solar Beam on " + p.getName() + " and deals " + damageFinal + " damage.";

    }
    return strSolarBeam;
    
  }
  

}