package k1;

public final class g extends Exception {
    public final String X;
    public final String Y;

    public g(String s, c c0) {
        super(s);
        this.X = s;
        if(c0 != null) {
            this.Y = c0.i();
            return;
        }
        this.Y = "unknown";
    }

    @Override
    public final String toString() {
        return "CLParsingException (" + this.hashCode() + ") : " + (this.X + " (" + this.Y + " at line 0)");
    }
}

