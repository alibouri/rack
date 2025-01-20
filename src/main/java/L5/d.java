package L5;

import com.google.android.gms.common.api.Status;

public class d extends Exception {
    public final Status X;

    public d(Status status0) {
        super(status0.X + ": " + (status0.Y == null ? "" : status0.Y));
        this.X = status0;
    }
}

