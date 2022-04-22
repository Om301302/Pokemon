/**
* Interface for water type pokemon, specific attack types.
* @author Phillip Huynh
*/
public interface Water {
  //Menu of special attacks.
  String specialMenu = "Special Attacks:\n1. Water Gun\n2. Bubble Beam\n3. Waterfall";
  //Number of special attacks.
  int numSpecialMenuItems = 3;

  /**
  * Method to be overrided for the string of Water Gun.
  * @param p holds for a defending pokemon.
  */
  String waterGun(Pokemon p);

  /**
  * Method to be overrided for the string of Bubble Beam.
  * @param p holds for a defending pokemon.
  */
  String bubbleBeam(Pokemon p);

  /**
  * Method to be overrided for the string of Waterfall.
  * @param p holds for a defending pokemon.
  */
  String waterfall(Pokemon p);
  
}