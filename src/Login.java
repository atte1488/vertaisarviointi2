import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kysytään kaikki tiedot
        System.out.print("Anna etunimi: ");
        String etunimi = input.nextLine().trim();

        System.out.print("Anna toinen nimesi: ");
        String sukunimi = input.nextLine().trim();

        System.out.print("Anna yrityksen verkkotunnus (esim. hamk.fi): ");
        String verkkotunnus = input.nextLine().trim();

        // Tyhjien kenttien tarkistus
        if (etunimi.isEmpty() || sukunimi.isEmpty() || verkkotunnus.isEmpty()) {
            System.out.println("Virhe! Jokin tiedoista puuttuu.");
        } else {
            // Kentät on täynnä, jatketaan koodia
            generateEmail(etunimi, sukunimi, verkkotunnus);
       
            generateUsername(etunimi, sukunimi);
        }

        input.close();
    }

    // generateemail metodin tiedot
    public static void generateEmail(String etunimi, String sukunimi, String domain) {
        String email = (etunimi + "." + sukunimi + "@" + domain).toLowerCase();
        System.out.println("Sähköpostiosoite: " + email);
    }

    // generateusername metodi 
    public static void generateUsername(String etunimi, String sukunimi) {
        // käyttäjätunnus
        String etuOsa = etunimi.substring(0, 4);
        String sukuOsa = sukunimi.substring(sukunimi.length() - 4);

        String username = (etuOsa + sukuOsa).toLowerCase();
        System.out.println("Käyttäjätunnus: " + username);
    }
}
