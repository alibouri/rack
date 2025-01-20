package com.drew.metadata.photoshop;

import com.drew.metadata.b;
import java.util.HashMap;

public class PsdHeaderDirectory extends b {
    public static final int TAG_BITS_PER_CHANNEL = 4;
    public static final int TAG_CHANNEL_COUNT = 1;
    public static final int TAG_COLOR_MODE = 5;
    public static final int TAG_IMAGE_HEIGHT = 2;
    public static final int TAG_IMAGE_WIDTH = 3;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        PsdHeaderDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Channel Count", 2, "Image Height");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Image Width", 4, "Bits Per Channel");
        hashMap0.put(5, "Color Mode");
    }

    public PsdHeaderDirectory() {
        this.setDescriptor(new A4.b(18, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "PSD Header";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return PsdHeaderDirectory._tagNameMap;
    }
}

