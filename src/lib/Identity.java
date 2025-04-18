//identyty.java
package lib;

public class Identity {
    private final String firstName;
    private final String lastName;
    private final String idNumber;

    public Identity(String firstName, String lastName, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
