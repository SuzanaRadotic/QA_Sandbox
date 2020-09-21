package enums;

/**
 * Enumeration used for test users
 */

public enum Users {

    // username
    AUTOTESTEMAIL("suzana.radotic@gmail.com"),

    // user password
    AUTOTESTEMAILPASS("QASandbox124");

    private String userValue;

    private Users(String userValue) {
        this.userValue = userValue;

    }

    /**
     * Method returns username as a string
     *
     * @return username
     */

    public String getUserParams() {
        return this.userValue;
    }

}
