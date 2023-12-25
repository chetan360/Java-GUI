import java.awt.Frame;

class Awt1 {
    public Awt1() {
        //creating frame
        Frame fm = new Frame();
        
        //set visibility
        fm.setVisible(true);

        //setting frame size
        fm.setSize(400, 400);
    }

    public static void main(String[] args) {
        Awt1 obj = new Awt1();
    }
}