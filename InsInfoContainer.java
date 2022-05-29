import java.util.ArrayList;

public class InsInfoContainer {
    
    ArrayList<InsuranceInfo> list; // InsuranceInfo

    public InsInfoContainer() {
        list = new ArrayList<InsuranceInfo>();
    }

    // Lisää vakuutustieto-olion säiliöön
    public void append(InsuranceInfo obj) {
        list.add(obj);
    }

    // Tulostaa säiliön koko sisällön käyttämällä printInformation -metodia.
    public void printList() { 
        System.out.println("\n--- VAKUUTUSTIEDOT ---\n");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).printInformation();
        }
    }

    // Tulostaa tiedot kiinteistöistä, joiden vakuutusarvo on parametrin arvoja pienempiä.
    public void printLowerProperty(double limit) { 
        System.out.println("Naiden kiinteistojen vakuutusarvot ovat antamaasi vakuutusarvoa pienempia:\n");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getInsurance() < limit) {
                list.get(i).printInformation();
            }
        }
    }

    // Tulostaa tiedot kiinteistöistä, joiden vakuutusarvo on parametrin arvoja suurempia.
    public void printUpperProperty(double limit) { 
        System.out.println("Naiden kiinteistojen vakuutusarvot ovat antamaasi vakuutusarvoa suurempia:\n");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getInsurance() > limit) {
                list.get(i).printInformation();
            }
        }
    }
}