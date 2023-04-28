public class Die {
    private int numOfSides;


    public int getNumOfSides() {
        return numOfSides;
    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public int rollDie() {
        int result = (int)(Math.floor(Math.random() * this.numOfSides)+1);
        return result;
    }

}
