package com.drew.metadata.gif;

import com.drew.metadata.b;
import java.util.HashMap;
import r4.a;

public class GifImageDirectory extends b {
    public static final int TAG_HAS_LOCAL_COLOUR_TABLE = 5;
    public static final int TAG_HEIGHT = 4;
    public static final int TAG_IS_COLOR_TABLE_SORTED = 7;
    public static final int TAG_IS_INTERLACED = 6;
    public static final int TAG_LEFT = 1;
    public static final int TAG_LOCAL_COLOUR_TABLE_BITS_PER_PIXEL = 8;
    public static final int TAG_TOP = 2;
    public static final int TAG_WIDTH = 3;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        GifImageDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Left", 2, "Top");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Width", 4, "Height");
        com.apollographql.apollo.api.b.z(5, hashMap0, "Has Local Colour Table", 6, "Is Interlaced");
        com.apollographql.apollo.api.b.z(7, hashMap0, "Is Local Colour Table Sorted", 8, "Local Colour Table Bits Per Pixel");
    }

    public GifImageDirectory() {
        this.setDescriptor(new a(5, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "GIF Image";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return GifImageDirectory._tagNameMap;
    }
}

