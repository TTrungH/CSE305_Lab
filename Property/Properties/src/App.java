public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
class Property{
    int PropertyID;
    String Description;
    int PropertyOwnerId;
    public Property(int propertyID, String description, int propertyOwnerId) {
        this.PropertyID = propertyID;
        this.Description = description;
        this.PropertyOwnerId = propertyOwnerId;
    }
}