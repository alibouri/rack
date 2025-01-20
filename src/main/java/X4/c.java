package X4;

public enum c {
    MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
    CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

    public final String X;

    public c(String s1) {
        this.X = s1;
    }

    @Override
    public final String toString() {
        return this.X;
    }
}

