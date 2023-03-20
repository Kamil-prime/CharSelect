public class Angel extends CharSelect {
    private String blessing;
    private String build;

    public Angel (String blessing, String build) {
        super(200,75);
        this.blessing = blessing;
        this.build = build;
    }
    @Override
    public String toString(){
        setStatboost(build);
        return super.toString() + ", has a " + blessing + " blessing and has a " + build + " build. " + statboost;

    }

    public static void main(String[] args) {
        Angel Alex = new Angel("ally buff", "mage");
        System.out.println(Alex.toString());
    }
}
