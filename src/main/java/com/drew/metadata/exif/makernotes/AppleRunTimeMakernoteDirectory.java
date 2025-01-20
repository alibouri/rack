package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class AppleRunTimeMakernoteDirectory extends b {
    public static final int CMTimeEpoch = 2;
    public static final int CMTimeFlags = 1;
    public static final int CMTimeScale = 3;
    public static final int CMTimeValue = 4;
    protected static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        AppleRunTimeMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Flags", 2, "Epoch");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Scale", 4, "Value");
    }

    public AppleRunTimeMakernoteDirectory() {
        super.setDescriptor(new d(3, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Apple Run Time";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return AppleRunTimeMakernoteDirectory._tagNameMap;
    }
}

