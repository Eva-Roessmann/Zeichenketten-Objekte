import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Person> personen = new ArrayList<>();

        int auswahl;

        do {

            System.out.println("\n===== MENÜ =====");
            System.out.println("1. Person eingeben");
            System.out.println("2. Personen ausgeben");
            System.out.println("3. Statistik");
            System.out.println("4. Ende");
            System.out.print("Auswahl: ");

            auswahl = sc.nextInt();
            sc.nextLine();

            switch (auswahl) {

                case 1:

                    System.out.print("Vorname: ");
                    String vorname = sc.nextLine();

                    System.out.print("Nachname: ");
                    String nachname = sc.nextLine();

                    System.out.print("PLZ: ");
                    String plz = sc.nextLine();

                    System.out.print("Ort: ");
                    String ort = sc.nextLine();

                    System.out.print("Straße: ");
                    String strasse = sc.nextLine();

                    System.out.print("Hausnummer: ");
                    String hausnummer = sc.nextLine();

                    System.out.print("Punkte: ");
                    int punkte = sc.nextInt();
                    sc.nextLine();

                    Person p = new Person(
                            vorname,
                            nachname,
                            plz,
                            ort,
                            strasse,
                            hausnummer,
                            punkte);

                    personen.add(p);

                    System.out.println("Person gespeichert.");

                    break;

                case 2:

                    if (personen.size() == 0) {

                        System.out.println("Keine Personen vorhanden.");

                    } else {

                        for (Person person : personen) {

                            person.ausgeben();
                        }
                    }

                    break;

                case 3:

                    if (personen.size() == 0) {

                        System.out.println("Keine Daten vorhanden.");

                    } else {

                        int summe = 0;
                        int max = personen.get(0).punkte;
                        int min = personen.get(0).punkte;

                        for (Person person : personen) {

                            summe += person.punkte;

                            if (person.punkte > max) {
                                max = person.punkte;
                            }

                            if (person.punkte < min) {
                                min = person.punkte;
                            }
                        }

                        double durchschnitt =
                                (double) summe / personen.size();

                        System.out.println("Durchschnitt: " + durchschnitt);
                        System.out.println("Höchste Punktezahl: " + max);
                        System.out.println("Niedrigste Punktezahl: " + min);
                    }

                    break;

                case 4:

                    System.out.println("Programm beendet.");
                    break;

                default:

                    System.out.println("Ungültige Eingabe.");
            }

        } while (auswahl != 4);

        sc.close();
    }
}
