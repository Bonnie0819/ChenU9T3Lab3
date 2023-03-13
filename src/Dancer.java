public class Dancer extends Performer {
    private int shoeSize;
    public Dancer(String name, int age, Agent agent, int shoeSize) {
        super(name, age, agent);
        this.shoeSize = shoeSize;
    }
    //getter methods
    public int getShoeSize() {
        return shoeSize;
    }
    public void pirouette(int spins) {
        System.out.println("I am spinning " + spins + " times!");
    }

    @Override
    public void rehearse() {
        pirouette(3);
        super.rehearse();
    }

    public void perform(boolean warmUp) {
        if(warmUp) {
            this.rehearse();
        }
        perform();
    }

    @Override
    public void callAgent() {
        System.out.println("I am calling my agent! Siri, call " + getAgent().getName());
        System.out.println("My shoes don't fit! Please pick me up a new pair.");
    }

    public void callAgent(int correctSize) {
        callAgent();
        System.out.println("I wear size " + correctSize + " by the way!");
    }

    @Override
    public String getName() {
        return super.getName() + " is a dancer!";
    }


}
