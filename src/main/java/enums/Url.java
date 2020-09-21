package enums;

/**
 * Enumeration used for URLs of different pages
 */

public enum Url {
    QASANDBOXLOGIN("https://qa-sandbox.apps.htec.rs/login"),
    QASANDBOXDASHBOARD("https://qa-sandbox.apps.htec.rs/dashboard");

    private String envUrl;

    private Url(String envUrl) {
        this.envUrl = envUrl;
    }

    /**
     * Method returns enum url as a string
     *
     * @return url
     */

    public String getUrl() {
        return this.envUrl;
    }
}
