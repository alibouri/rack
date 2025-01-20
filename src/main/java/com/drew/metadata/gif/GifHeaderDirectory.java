package com.drew.metadata.gif;

import com.drew.metadata.b;
import java.util.HashMap;
import r4.a;

public class GifHeaderDirectory extends b {
    public static final int TAG_BACKGROUND_COLOR_INDEX = 8;
    public static final int TAG_BITS_PER_PIXEL = 6;
    public static final int TAG_COLOR_TABLE_SIZE = 4;
    public static final int TAG_GIF_FORMAT_VERSION = 1;
    public static final int TAG_HAS_GLOBAL_COLOR_TABLE = 7;
    public static final int TAG_IMAGE_HEIGHT = 3;
    public static final int TAG_IMAGE_WIDTH = 2;
    public static final int TAG_IS_COLOR_TABLE_SORTED = 5;
    public static final int TAG_PIXEL_ASPECT_RATIO = 9;
    @Deprecated
    public static final int TAG_TRANSPARENT_COLOR_INDEX = 8;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        GifHeaderDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "GIF Format Version", 3, "Image Height");
        com.apollographql.apollo.api.b.z(2, hashMap0, "Image Width", 4, "Color Table Size");
        com.apollographql.apollo.api.b.z(5, hashMap0, "Is Color Table Sorted", 6, "Bits per Pixel");
        com.apollographql.apollo.api.b.z(7, hashMap0, "Has Global Color Table", 8, "Background Color Index");
        hashMap0.put(9, "Pixel Aspect Ratio");
    }

    public GifHeaderDirectory() {
        this.setDescriptor(new a(4, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "GIF Header";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return GifHeaderDirectory._tagNameMap;
    }
}

