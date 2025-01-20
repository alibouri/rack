package N4;

import Nb.j;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public final class g extends ObjectInputStream {
    @Override
    public final ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass objectStreamClass0 = super.readClassDescriptor();
        if(j.a(objectStreamClass0.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
            objectStreamClass0 = ObjectStreamClass.lookup(a.class);
        }
        else if(j.a(objectStreamClass0.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
            objectStreamClass0 = ObjectStreamClass.lookup(e.class);
        }
        j.e(objectStreamClass0, "resultClassDescriptor");
        return objectStreamClass0;
    }
}

