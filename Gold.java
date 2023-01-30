public class Gold extends Item {

    private int amt;

    public Gold(int amt){
        super("Gold", String.format("A round coin with %s stamped on the front.", String.valueOf(amt)), amt);
        this.amt = amt;
    }

    public Gold(String name, String description, int amt){
        super(name, description, amt);
        this.amt = amt;
    }

}