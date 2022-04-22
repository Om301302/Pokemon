/**
*This class represents an Entity object with different attributes of name, hp, and maxHp.
@author Phillip Huynh
**/
public abstract class Entity {

  private String name;
  private int hp;
  private int maxHp;
  /**
  *This constructs an Entity object with name, hp, and maxHp.
  @param name - holds for an Entity's name.
  @param hp - holds for an Entity's hp.
  @param maxHp - holds for an Entity's max hp.
  **/
  public Entity(String name, int maxHp) {
    this.name = name;
    this.maxHp = maxHp;
    hp = this.maxHp;
  }
  /**
  *Method that gets hp from user as it is in trainer parameter. 
  *@return the number of hp that pokemon has
  */
  public int getHp() {
    return hp;
  }

  /**
  *Methos that gets the highest amount of hp which is given in the guidlines.
  *@return the highest amount of helth of pokemon.
  */
  public int getMaxHp() {
    return this.maxHp;
 }

  /**
  * Method that takeout points from hp after fighting with other pokemon. 
  *@param d would be the number that is damaged by other pokemon.
  *Also this method will do subtraction from previous hp and if that go less than zero, it will override hp and give zero hp in retuurn.
  */
  public void takeDamage(int d) {
    hp -= d;
    if (hp <= 0) {
      hp = 0;
    }
  }

  /**
  *Method that will give maximum helth to pokemon. So, basically their hp will be max. 
  */
  public void heal() {
    hp = this.maxHp;
  }

  /**
  *Method that gets the name as a string.
  *@return a string which will have the name.
  */

  public String getName() {
    return this.name;
  }

  /**
  * Method that gets the pokemon's hp and max hp.
  * @return a string of the pokemon name with hp and maxhp.
  */
  @Override
  public String toString() {
    return this.name + " HP: " + hp + "/" + this.maxHp + " ";  
  }

  }






