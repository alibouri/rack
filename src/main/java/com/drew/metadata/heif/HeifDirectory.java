package com.drew.metadata.heif;

import com.drew.metadata.b;
import java.util.HashMap;
import r4.a;

public class HeifDirectory extends b {
    public static final int TAG_BITS_PER_CHANNEL = 7;
    public static final int TAG_COMPATIBLE_BRANDS = 3;
    public static final int TAG_IMAGE_HEIGHT = 5;
    public static final int TAG_IMAGE_ROTATION = 6;
    public static final int TAG_IMAGE_WIDTH = 4;
    public static final int TAG_MAJOR_BRAND = 1;
    public static final int TAG_MINOR_VERSION = 2;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        HeifDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Major Brand", 2, "Minor Version");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Compatible Brands", 4, "Width");
        com.apollographql.apollo.api.b.z(5, hashMap0, "Height", 6, "Rotation");
        hashMap0.put(7, "Bits Per Channel");
    }

    public HeifDirectory() {
        this.setDescriptor(new a(6, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "HEIF";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return HeifDirectory._tagNameMap;
    }
}

