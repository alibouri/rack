package j6;

public enum s0 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    public final String X;

    public s0(String s1) {
        this.X = s1;
    }

    @Override
    public final String toString() {
        return this.X;
    }
}

