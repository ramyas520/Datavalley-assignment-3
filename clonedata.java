class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(String code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
    }
    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) {
        Organization org1 = new Organization("5541", "Datavalley Company", "Near Govt Hospital, Vijayawada");
        
        // Cloning org1
        Organization org2 = null;
        try {
            org2 = (Organization) org1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        // Printing details of both org1 and its clone org2
        System.out.println("Details of org1:");
        org1.printDetails();
        
        System.out.println("\nDetails of org2 (Clone of org1):");
        org2.printDetails();
    }
}
