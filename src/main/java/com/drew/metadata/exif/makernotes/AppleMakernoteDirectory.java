package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class AppleMakernoteDirectory extends b {
    public static final int TAG_ACCELERATION_VECTOR = 8;
    public static final int TAG_BURST_UUID = 11;
    public static final int TAG_CONTENT_IDENTIFIER = 17;
    public static final int TAG_HDR_IMAGE_TYPE = 10;
    public static final int TAG_IMAGE_UNIQUE_ID = 21;
    public static final int TAG_LIVE_PHOTO_ID = 23;
    public static final int TAG_RUN_TIME = 3;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        AppleMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(3, hashMap0, "Run Time", 8, "Acceleration Vector");
        com.apollographql.apollo.api.b.z(10, hashMap0, "HDR Image Type", 11, "Burst UUID");
        com.apollographql.apollo.api.b.z(17, hashMap0, "Content Identifier", 21, "Image Unique ID");
        hashMap0.put(23, "Live Photo ID");
    }

    public AppleMakernoteDirectory() {
        this.setDescriptor(new d(2, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Apple Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return AppleMakernoteDirectory._tagNameMap;
    }
}

