public class InsuranceInfo {

    private Property propertyInfo;
    private double insuranceValue;

    // Parametrillinen konstruktori
    public InsuranceInfo(Property propertyInfo, double insuranceValue) {
        this.propertyInfo = propertyInfo;
        this.insuranceValue = insuranceValue;
    }

    // Get-metodi
    public double getInsurance() {
        return insuranceValue;
    }

    // Tulostaa kiinteistön tiedot
    public void printInformation() {
        System.out.println("Kiinteiston tyyppi: " + propertyInfo.getType());
        System.out.println("Kiinteiston sijainti: " + propertyInfo.getLocation());
        System.out.println("Kiinteiston vakuutusarvo: " + insuranceValue + " euroa\n");
    }   
}
