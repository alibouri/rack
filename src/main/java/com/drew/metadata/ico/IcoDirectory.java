package com.drew.metadata.ico;

import com.drew.metadata.b;
import java.util.HashMap;
import r4.a;

public class IcoDirectory extends b {
    public static final int TAG_BITS_PER_PIXEL = 7;
    public static final int TAG_COLOUR_PALETTE_SIZE = 4;
    public static final int TAG_COLOUR_PLANES = 5;
    public static final int TAG_CURSOR_HOTSPOT_X = 6;
    public static final int TAG_CURSOR_HOTSPOT_Y = 8;
    public static final int TAG_IMAGE_HEIGHT = 3;
    public static final int TAG_IMAGE_OFFSET_BYTES = 10;
    public static final int TAG_IMAGE_SIZE_BYTES = 9;
    public static final int TAG_IMAGE_TYPE = 1;
    public static final int TAG_IMAGE_WIDTH = 2;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        IcoDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Image Type", 2, "Image Width");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Image Height", 4, "Colour Palette Size");
        com.apollographql.apollo.api.b.z(5, hashMap0, "Colour Planes", 6, "Hotspot X");
        com.apollographql.apollo.api.b.z(7, hashMap0, "Bits Per Pixel", 8, "Hotspot Y");
        com.apollographql.apollo.api.b.z(9, hashMap0, "Image Size Bytes", 10, "Image Offset Bytes");
    }

    public IcoDirectory() {
        this.setDescriptor(new a(8, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "ICO";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return IcoDirectory._tagNameMap;
    }
}

