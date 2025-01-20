package Y8;

import com.apollographql.apollo.api.Mutation.Data;

public final class j implements Data {
    public final i a;

    public j(i i0) {
        this.a = i0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof j ? Nb.j.a(this.a, ((j)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(acknowledgePushNotification=" + this.a + ")";
    }
}

