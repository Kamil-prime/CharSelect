public class CharSelect {


    int health;
    int atk;
    String statboost;


    CharSelect(int health, int atk) {
        this.health = health;
        this.atk = atk;

    }

     public void setStatboost(String build){
        if (build.equalsIgnoreCase("mage")){
            atk+= 10;
            health+= 10;
            statboost= "(10% mana recovery boost, +10 atk, +10hp)";
        } else if (build.equalsIgnoreCase("knight") ) {
            atk+= 40;
            health+= 40;
            statboost= "(20% slower mana regen, 20% faster combat mastery exp gain, +40 atk, +40 health)";
        } else if (build.equalsIgnoreCase("juggernaut") ) {
            health+= 100;
            statboost = "(50% more mana, 50% more health, 10% speed lost)";
        }
     }


    @Override
    public String toString(){
        return "Your character has " + atk + " attack and " + health + " HP";

    }

}
