package com.drew.metadata.adobe;

import com.drew.metadata.b;
import java.util.HashMap;

public class AdobeJpegDirectory extends b {
    public static final int TAG_APP14_FLAGS0 = 1;
    public static final int TAG_APP14_FLAGS1 = 2;
    public static final int TAG_COLOR_TRANSFORM = 3;
    public static final int TAG_DCT_ENCODE_VERSION;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        AdobeJpegDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "DCT Encode Version", 1, "Flags 0");
        com.apollographql.apollo.api.b.z(2, hashMap0, "Flags 1", 3, "Color Transform");
    }

    public AdobeJpegDirectory() {
        this.setDescriptor(new A4.b(20, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Adobe JPEG";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return AdobeJpegDirectory._tagNameMap;
    }
}

