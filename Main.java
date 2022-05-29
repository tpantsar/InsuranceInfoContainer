import java.util.Scanner;

public class Main {

    public static void main(String [] args) throws Exception {
        
        Scanner nappaimisto = new Scanner(System.in);

        InsInfoContainer insuranceList = new InsInfoContainer();
        String type;
        String location;
        double value = 0.0;
        int counter = 0;
        boolean exitFlag = false;

        while (true) { // Loop 1
            if (counter > 4) { // Jos enemmän kuin 5 vakuutustietoa on syötetty:
                System.out.print(counter + " vakuutusta syotetty. Haluatko viela syottaa? Y / N > ");
                while (true) { // Loop 2
                    char prompt = nappaimisto.next().toLowerCase().charAt(0);
                    if (prompt == 'y') {
                        nappaimisto.nextLine(); // Puskurin tyhjennys
                        break; // Jatketaan syötteiden kyselyä (Loop 2)
                    }
                    if (prompt == 'n') {
                        exitFlag = true; // Poistutaan silmukasta (Loop 1)
                        break;
                    }
                    else {
                        System.out.print("Syota vain Y / N  > ");
                    }
                }
            }
            // Jos käyttäjä syöttää kirjaimen 'n', poistutaan silmukasta (Loop 1).
            if (exitFlag) break;

            System.out.print("\nSyota kiinteiston tyyppi > ");
            type = nappaimisto.nextLine();

            System.out.print("Syota kiinteiston sijainti > ");
            location = nappaimisto.nextLine();

            System.out.print("Syota kiinteiston vakuutusarvo > ");
            value = nappaimisto.nextDouble();

            nappaimisto.nextLine(); // Puskurin tyhjennys
            
            // Muodostimet
            Property propertyInfo = new Property(type, location);
            InsuranceInfo insuranceInfo = new InsuranceInfo(propertyInfo, value);

            // Lisätään kiinteistön tiedot ArrayList-kokoelmaan.
            insuranceList.append(insuranceInfo); // InsInfoContainer insuranceList

            counter++;
        }

        // Tulostetaan säiliön koko sisältö.
        insuranceList.printList(); // InsInfoContainer insuranceList

        /* Syötetään näppäimistöltä arvo ja tulostetaan kiinteistöt,
        joiden vakuutusarvo on tätä pienempi. */
        System.out.print("Syota maksimi vakuutusarvo > ");
        insuranceList.printLowerProperty(nappaimisto.nextDouble());

        /* Syötetään näppäimistöltä arvo ja tulostetaan kiinteistöt,
        joiden vakuutusarvo on tätä suurempi. */
        System.out.print("Syota minimi vakuutusarvo > ");
        insuranceList.printUpperProperty(nappaimisto.nextDouble());

        nappaimisto.close(); // Suljetaan näppäimistö
        System.exit(0);
    }
}