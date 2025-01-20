package I7;

import com.google.firebase.perf.config.RemoteConfigManager;
import o6.d;
import o6.e;

public final class w implements d, e {
    public final RemoteConfigManager X;

    public w(RemoteConfigManager remoteConfigManager0) {
        this.X = remoteConfigManager0;
        super();
    }

    @Override  // o6.e
    public void k(Object object0) {
        this.X.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(((Boolean)object0));
    }

    @Override  // o6.d
    public void u(Exception exception0) {
        this.X.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exception0);
    }
}

