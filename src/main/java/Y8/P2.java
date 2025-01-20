package Y8;

import java.io.IOException;

public final class p2 extends IOException {
    public final String X;

    public p2() {
        super("Apollo is attempting a network call on a cache only FragmentQuery.");
        this.X = "Apollo is attempting a network call on a cache only FragmentQuery.";
    }

    @Override
    public final String getMessage() {
        return this.X;
    }
}

