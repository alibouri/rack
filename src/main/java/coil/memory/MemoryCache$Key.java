package coil.memory;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.support.v4.media.a;
import java.util.Map.Entry;
import java.util.Map;

public final class MemoryCache.Key implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final Map Y;

    static {
        MemoryCache.Key.CREATOR = new a(17);
    }

    public MemoryCache.Key(String s, Map map0) {
        this.X = s;
        this.Y = map0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    // Deobfuscation rating: LOW(40)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof MemoryCache.Key && j.a(this.X, ((MemoryCache.Key)object0).X) && j.a(this.Y, ((MemoryCache.Key)object0).Y);
    }

    @Override
    public final int hashCode() {
        return this.Y.hashCode() + this.X.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Key(key=" + this.X + ", extras=" + this.Y + ')';
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.X);
        parcel0.writeInt(this.Y.size());
        for(Object object0: this.Y.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            String s1 = (String)((Map.Entry)object0).getValue();
            parcel0.writeString(s);
            parcel0.writeString(s1);
        }
    }
}

