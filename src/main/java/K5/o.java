package K5;

public final class o extends p {
    public final i e;

    public o(i i0) {
        super(null, false, null);
        this.e = i0;
    }

    @Override  // K5.p
    public final String a() {
        try {
            return (String)this.e.call();
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }
}

