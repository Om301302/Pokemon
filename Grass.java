/**
* Interface for grass type pokemon, specific attack types.
* @author Gabriel Villanueva
*/
public interface Grass {
  //Menu of special attacks.
  String specialMenu = "SpecialAttacks:\n1. Vine Whip\n2. Razor Leaf\n3. Solar Beam";
  //Number of special attacks.
  int numSpecialMenuItems = 3;

  /**
  * Method to be overrided for the string of Vine Whip.
  * @param p holds for a defending pokemon.
  */
  String vineWhip(Pokemon p);

  /**
  * Method to be overrided for the string of Razor Leaf.
  * @param p holds for a defending pokemon.
  */
  String razorLeaf(Pokemon p);

  /**
  * Method to be overrided for the string of Solar Beam.
  * @param p holds for a defending pokemon.
  */
  String solarBeam(Pokemon p);
  
}