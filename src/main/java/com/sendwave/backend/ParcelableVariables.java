package com.sendwave.backend;

import Nb.j;
import Y8.n2;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.apollographql.apollo.api.Executable.Variables;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class ParcelableVariables implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final LinkedHashMap X;

    static {
        ParcelableVariables.CREATOR = new n2(1);
    }

    public ParcelableVariables(Variables executable$Variables0) {
        j.f(executable$Variables0, "variables");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: executable$Variables0.getValueMap().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            if(object1 instanceof Integer || object1 instanceof Long || object1 instanceof String || object1 instanceof Boolean) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        this(linkedHashMap0);
    }

    public ParcelableVariables(LinkedHashMap linkedHashMap0) {
        this.X = linkedHashMap0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.X.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeInt(this.X.size());
        for(Object object0: this.X.entrySet()) {
            parcel0.writeString(((String)((Map.Entry)object0).getKey()));
            parcel0.writeValue(((Map.Entry)object0).getValue());
        }
    }
}

