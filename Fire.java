/**
* Interface for fire type pokemon, specific attack types.
* @author Om Kakadiya
*/
public interface Fire{
  //Menu of special attacks.
  String specialMenu = "SpecialAttacks:\n1. Ember\n2. Fire Blast\n3. Fire Punch";
  //Number of special attacks.
  int numSpecialMenuItems = 3;
  
  /**
  * Method to be overrided for the string of Ember.
  * @param p holds for a defending pokemon.
  */
  String ember(Pokemon p);

  /**
  * Method to be overrided for the string of Fire Blast.
  * @param p holds for a defending pokemon.
  */
  String fireBlast(Pokemon p);

  /**
  * Method to be overrided for the string of Fire Punch.
  * @param p holds for a defending pokemon.
  */
  String firePunch(Pokemon p);

  
}