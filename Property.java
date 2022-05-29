public class Property {

    private String type;
    private String location;

    // Parametrillinen konstruktori
    public Property(String type, String location) {
        this.type = type;
        this.location = location;
    }

    // Get-metodi
    public String getLocation() {
        return location;
    }

    // Get-metodi
    public String getType() {
        return type;
    }
}