package lib;

public class EmployeeInfo {
    private final Identity identity;
    private final String address;

    public EmployeeInfo(Identity identity, String address) {
        this.identity = identity;
        this.address = address;
    }

    public Identity getIdentity() {
        return identity;
    }

    public String getAddress() {
        return address;
    }
}
