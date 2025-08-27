import javax.swing.JOptionPane;

public class heipadeg {
    public static void main(String[] args) {
        String navn;
        navn = JOptionPane.showInputDialog("Hei, hva heter du?");

        String Utskrift;
        Utskrift = JOptionPane.showInputDialog("Hei på deg " + navn + "!");


        JOptionPane.showMessageDialog(null, "Hyggelig å møte deg!");

        //String svar;
       // svar = JOptionPane.showInputDialog("Hyggelig å møte deg!");

        System.out.println(Utskrift);
        JOptionPane.showMessageDialog(null, "Ha en fin dag " + navn + ", hadet bra!");
    }
}
