import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showInputDialog;

public class Tall {
    public static void main(String[] args) {

        String sifferstreng;
        // brukes for lagring av sifferstrengen som leses inn
        //leser inn sifferstrengen og lagrer den:
        JOptionPane.showMessageDialog(null, "Dette er en Kalkulator.");
        JOptionPane.showMessageDialog(null, "Skriv inn de tallene du vil legge sammen.");


        String sifferstrengEn = JOptionPane.showInputDialog("Skriv inn tall 1:");
        String sifferstrengTo = JOptionPane.showInputDialog("Skriv inn tall 2");

        // brukes til å lagre tallet som sifferstrengen konverteres til
        //konverterer sifferstrengen til tall og lagrer tallet:

        int tall1 = Integer.parseInt(sifferstrengEn);

        int tall2 = Integer.parseInt(sifferstrengTo);

        //int tall1 = Integer.parseInt(sifferstreng("Skriv inn tall 1"));
        //int tall2 = Integer.parseInt(sifferstreng("Skriv inn tall 2"));

        int sum = tall1 + tall2;

        JOptionPane.showMessageDialog(null, "Summen er: " + sum);
    }
}
