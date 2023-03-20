public class Human extends CharSelect{

    private String power;
    private String weapon;
    private String build;
    private String style;

    Human(String power, String build) {
        super(100,175);
        this.power= power;
        this.build= build;

    }
    Human(String style, String build, String weapon) {
        super(100,175);
        this.style = style;
        this.build= build;
        this.weapon = weapon;

    }


    @Override
    public String toString() {
        setStatboost(build);
        if (power != null) {
            return super.toString() + " , has a talent for " + power + " and has a " + build + " build. " + statboost;
        }else {
            return super.toString() + " , has a talent for " + style + " " + weapon  +" and has a " + build + " build. " + statboost;
        }
    }

    public static void main(String[] args) {
        CharSelect Maxis = new Human("One Sword style", "knight");
        System.out.println(Maxis.toString());
    }
}
