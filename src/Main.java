import java.util.Scanner;

public class Main {
    public static int moltiplica(int a, int b) {
        return a * b; // Restituisce il prodotto di a e b
    }
    public static String concatena(String str, int num) {
        return str + num; // Concatena la stringa e il numero
    }
    public static String[] inserisciInArray(String[] array, String str) {
        // Creiamo un nuovo array con 6 elementi
        String[] nuovoArray = new String[6];

        // Copiamo i primi due elementi
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];

        // Inseriamo la nuova stringa al terzo posto
        nuovoArray[2] = str;

        // Copiamo il resto degli elementi
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray; // Restituisce il nuovo array
    }
    public static void main(String[] args) {
        // Esempio di chiamata a moltiplica
        int prodotto = moltiplica(3, 4);
        System.out.println("Prodotto: " + prodotto);

        // Esempio di chiamata a concatena
        String concatenazione = concatena("Numero: ", 42);
        System.out.println("Concatenazione: " + concatenazione);

        // Esempio di chiamata a inserisciInArray
        String[] array = {"A", "B", "C", "D", "E"};
        String[] nuovoArray = inserisciInArray(array, "Nuovo");
        System.out.print("Nuovo Array: ");
        for (String s : nuovoArray) {
            System.out.print(s + " ");
        }
    }

    public static void esDue(String[] args) {
        // Creare uno scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiedere all'utente di inserire 3 stringhe
        System.out.println("Inserisci la prima stringa:");
        String stringa1 = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String stringa2 = scanner.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String stringa3 = scanner.nextLine();

        // Concatenare le stringhe in ordine di inserimento
        String concatenazioneOrdinata = stringa1 + stringa2 + stringa3;

        // Concatenare le stringhe in ordine inverso
        String concatenazioneInversa = stringa3 + stringa2 + stringa1;

        // Stampare i risultati
        System.out.println("Concatenazione in ordine: " + concatenazioneOrdinata);
        System.out.println("Concatenazione in ordine inverso: " + concatenazioneInversa);

        // Chiudere lo scanner
        scanner.close();
    }

}