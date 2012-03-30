package org.cse.springtute;

public class Student {

	private String firstName;
	private String lastName;
	private long regNumber;
	private String address;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the regNumber
     */
    public long getRegNumber() {
        return regNumber;
    }

    /**
     * @param regNumber the regNumber to set
     */
    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
