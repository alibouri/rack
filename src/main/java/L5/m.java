package L5;

import com.google.android.gms.common.Feature;

public final class m extends UnsupportedOperationException {
    public final Feature X;

    public m(Feature feature0) {
        this.X = feature0;
    }

    @Override
    public final String getMessage() {
        return "Missing " + this.X;
    }
}

