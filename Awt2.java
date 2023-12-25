import java.awt.Frame;

public class Awt2 extends Frame {
    public Awt2() {
        this.setVisible(true);

        this.setSize(400, 400);

        this.setTitle("MY FRAME");
    }

    public static void main(String[] args) {
        Awt2 obj = new Awt2();
    }
}
