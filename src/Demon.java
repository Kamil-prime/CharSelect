public class Demon extends CharSelect{


    private String style;
    private String power;
    private String build;

    private String weapon;

    Demon(String power, String build) {
        super(100,175);
        this.power= power;
        this.build= build;

    }

    public String getBuild() {
        return build;
    }

     Demon(String style, String build, String weapon) {
        super(100,175);
        this.style = style;
        this.build= build;
        this.weapon = weapon;

    }
    @Override
    public String toString(){
        setStatboost(getBuild());
        if (power != null) {
            return super.toString() + " , has a talent for " + power + " and has a " + build + " build. " + statboost;
        }else {
            return super.toString() + " , has a talent for " + style + " " + weapon  +" and has a " + build + " build. " + statboost;
        }
    }}




