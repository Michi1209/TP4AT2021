public class VectorMultiply implements Runnable {


    private int start;
    private int ende;
    private Vector[] v1;
    private Vector[] v2;
    private Vector[] erg;


    public VectorMultiply(int start, int ende, Vector[] v1, Vector[] v2) {
        this.start = start;
        this.ende = ende;
        this.v1 = v1;
        this.v2 = v2;

    }

    @Override
    public void run() {
        // start - ende => vektormultipikation machen
        // schleife von start bis ende
        for (int i = start; i < ende; i++) {
            //v1 und v2
            Vector result = v1[i].multiply(v2[i]);
            erg[i] = result;
        }
    }

    public Vector[] getErg() {
        return erg;
    }
}
