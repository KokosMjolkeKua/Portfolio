package Forelesning2;

public class brod {
    public static void main(String[] args) {

        //du trenger
        double melDL = 2;
        double MelDL = 3.5;

        //stilregler i java ( hva man ikke må gjøre)

        // double mel DL = 2; ikke ha mellomrom
        // double 1vannDL = 2;  ikke sett tall

        //ikke to forskjellige variabler med samme navn :

        // double tall = 1;
        // double tall = 2;

        // variabler bør bruke camelCase, liten forbokstad, resten stort forbokstav, ingen _ understrek, ha meningsfulle navn

        String stringtall1 = "2";
        String stringTall2 = "3";
        String konkatinerteTall = stringtall1 + stringTall2;
        System.out.println(konkatinerteTall);
        // vil printe det ut som om du bare setter 2 og tre sammen, altså 23
        // fordi det er en string, altså tekst, legger ved siden av hverandre

        double desimalTall1 = 2;
        double desimalTall2 = 3;
        double sumTall = desimalTall1 + desimalTall2;
        System.out.println(sumTall);
        // vil printe ut 5 fordi det er et desimaltall
        // altså et tall

    }

}
