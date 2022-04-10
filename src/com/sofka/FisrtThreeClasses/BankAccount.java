package com.sofka.FisrtThreeClasses;

/**
 * Represent the definition of a bank account
 * @author Alex Lopez
 */
public class BankAccount {
    private int accountNumber;
    protected boolean activated;
    private int accHolderId;
    private String accHolderName;
    private String accHolderLastName;

    /**
     * Creates a bank account object
     * @param activated Flag that indicates if the account is active or not
     * @param accHolderId Owner's ID account
     * @param accHolderName Owner's first name
     * @param accHolderLastName Owner's last name
     */
    public BankAccount(boolean activated, int accHolderId, String accHolderName, String accHolderLastName) {
        this.activated = activated;
        this.accHolderId = accHolderId;
        this.accHolderName = accHolderName;
        this.accHolderLastName = accHolderLastName;
    }

    /**
     * Gets the account ID
     * @return An integer representing the ID account
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Sets the account ID
     * @param accountNumber A number containing the account ID
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Gets the account status (active/inactive)
     * @return A boolean representing the account status
     */
    public boolean isActivated() {
        return this.activated;
    }

    /**
     * Sets the account status
     * @param activated A boolean containing the account status
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Gets the ID of the account holder
     * @return An integer representing the ID of the account holder
     */
    public int getAccHolderId() {
        return this.accHolderId;
    }

    /**
     * Sets the account holder ID
     * @param accHolderId A number containing the account holder ID
     */
    public void setAccHolderId(int accHolderId) {
        this.accHolderId = accHolderId;
    }

    /**
     * Gets the account holder first name
     * @return A string representing the account holder first name
     */
    public String getAccHolderName() {
        return this.accHolderName;
    }

    /**
     * Sets the account holder first name
     * @param accHolderName A string representing the account holder first name
     */
    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    /**
     * Gets the account holder last name
     * @return A string representing the account holder last name
     */
    public String getAccHolderLastName() {
        return this.accHolderLastName;
    }

    /**
     * Sets the account holder last name
     * @param accHolderLastName A string representing the account holder last name
     */
    public void setAccHolderLastName(String accHolderLastName) {
        this.accHolderLastName = accHolderLastName;
    }
}
