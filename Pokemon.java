/**
*This class represents a Pokemon object which extends from Entity.
@author Gabriel Villanueva
**/
public abstract class Pokemon extends Entity {

  //holds for damage multiplier of special attacks.
  protected static final double [][] battleTable = {{1, .5, 2}, {2, 1, .5}, {.5, 2, 1}};

  /**
  * This constructs a Pokemon object, where n is passed into super, along with an initial health of
  * 25 hp.
  * @param n holds for the name of the Pokemon 
  */
  public Pokemon(String n)  {
    super(n, 25);

  }
  /**
  * Method to be overrided. Gets the menu of special attacks.
  */
  public abstract String getSpecialMenu();

  /**
  * Method to be overrided. Gets number of special attack.
  */
  public abstract int getNumSpecialMenuItems();

  /**
  * Method to be overrided. Gets the special attack against a wild pokemon.
  * @param p holds for a wild pokemon.
  * @param move holds for the special attack number the trainer chooses.
  */
  public abstract String specialAttack(Pokemon p, int move);

  /**
  * Method that gets the basic attack menu of the pokemon.
  * @return the menu of basic attacks.
  */
  public String getBasicMenu() {
    return "Basic Attacks:\n1. Slam\n2. Tackle\n3. Punch";

  }

  /**
  * Method that gets input from user about which he wants to select from the basic attack menu.
  * It has range of three Slam, Tackle, and punch.
  * @return the number depands on which type of basic attack user wants to do.tack menu
  */
  public int getNumBasicMenuItems() {
    int basicAttackNum = CheckInput.getIntRange(1,3);
    return basicAttackNum;
  }

  /**
  * Method that does a basic attack on another pokemon. Basic attack depends on
  * the integer the user chooses. Calls other methods below to get the string of 
  * the attack sequence.
  * @param p holds for the defending pokemon
  * @param move holds for the integer that corresponds to the basic attack in menu.
  * @return the string of the attack sequence 
  */
  public String basicAttack(Pokemon p, int move) {
    String basicAttack = "";
    
    if (move == 1) {
      basicAttack = this.slam(p);

    } else if (move == 2) {
      basicAttack = this.tackle(p);

    } else if (move == 3) {
      basicAttack = this.punch(p);
    }
    return basicAttack;
  }

  /**
  * Method that gets the attack menu of the pokemon, either basic or special.
  * @return the attack menu of the pokemon. 
  */
  public String getAttackMenu() {
    return "Attack Types:\n1. Basic Attack\n2. Special Attack";
  }

  /**
  * Method that gets input from usrer about which attack user wants to do.
  * In range of 1-2, basic and special attack.
  * @return the number corresponds on which type of attack user wants to do.
  */
  public int getNumAttackMenuItems() {
    int attackTypeNum = CheckInput.getIntRange(1,2);
    return attackTypeNum;
  }

  /**
  * Method that creates a random damage, then deals damage to the defending pokemon.
  * @returns a string of the attack sequence against the defending pokemon.
  */
  public String slam(Pokemon p) {
    //Create a random damage then deal damage.
    int randNumDamage = (int) (Math.random() * 5);
    p.takeDamage(randNumDamage);
    
    return "" + this.getName() + " uses Slam on " + p.getName() + " and deals " + randNumDamage + " damage.";
  }
  
  /**
  * Method that creates a random damage, then deals damage to the defending pokemon.
  * @returns a string of the attack sequence against the defending pokemon.
  */
  public String tackle(Pokemon p) {
    //Create a random damage then deal damage.
    int randNumDamage = (int) (Math.random() * 2) + 2;
    p.takeDamage(randNumDamage);

    return "" + this.getName() + " uses Tackle on " + p.getName() + " and deals " + randNumDamage + " damage.";
  }

  /**
  * Method that creates a random damage, then deals damage to the defending pokemon.
  * @returns a string of the attack sequence against the defending pokemon.
  */
  public String punch(Pokemon p) {
    //Create a random damage then deal damage.
    int randNumDamage = (int) (Math.random() * 4) + 1;
    p.takeDamage(randNumDamage);

    return "" + this.getName() + " uses Punch on " + p.getName() + " and deals " + randNumDamage + " damage.";
  }

  /**
  * Method that returns an integer 0-2 that represents the type of pokemon,
  * whether it is fire(Charmander,Ponyta), water(Squirtle, Staryu), or grass(Bulbasaur,Oddish).
  * @return the integer that corresponds to the type of pokemon.
  */
  public int getType() {
    //intialize the integer
    int numType = 0;

    //0 represents firetypes, 1 represents water types, 2 represents grass types.
    if(this.getName() == "Charmander" || this.getName() == "Ponyta"){
      numType = 0;

    } else if(this.getName() == "Squirtle" || this.getName() == "Staryu"){
      numType = 1;

    } else if(this.getName() == "Bulbasaur" || this.getName() == "Oddish"){
      numType = 2;
    }
    
    return numType;
  }

  

  


}