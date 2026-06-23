public class Person {

    String vorname;
    String nachname;

    String plz;
    String ort;
    String strasse;
    String hausnummer;

    int punkte;

    public Person(String vorname, String nachname,
                  String plz, String ort,
                  String strasse, String hausnummer,
                  int punkte) {

        this.vorname = vorname;
        this.nachname = nachname;

        this.plz = plz;
        this.ort = ort;

        this.strasse = strasse;
        this.hausnummer = hausnummer;

        this.punkte = punkte;
    }

    public void ausgeben() {

        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + nachname);
        System.out.println("PLZ: " + plz);
        System.out.println("Ort: " + ort);
        System.out.println("Straße: " + strasse);
        System.out.println("Hausnummer: " + hausnummer);
        System.out.println("Punkte: " + punkte);

        System.out.println("-------------------------");
    }
}
