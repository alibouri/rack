package L5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class n extends BasePendingResult {
    public final Status a;

    public n(Status status0) {
        super(null);
        this.a = status0;
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public final l m0(Status status0) {
        return this.a;
    }
}

