package com.drew.metadata.png;

import com.drew.metadata.b;
import com.drew.metadata.g;
import java.util.HashMap;

public class PngChromaticitiesDirectory extends b {
    public static final int TAG_BLUE_X = 7;
    public static final int TAG_BLUE_Y = 8;
    public static final int TAG_GREEN_X = 5;
    public static final int TAG_GREEN_Y = 6;
    public static final int TAG_RED_X = 3;
    public static final int TAG_RED_Y = 4;
    public static final int TAG_WHITE_POINT_X = 1;
    public static final int TAG_WHITE_POINT_Y = 2;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        PngChromaticitiesDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "White Point X", 2, "White Point Y");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Red X", 4, "Red Y");
        com.apollographql.apollo.api.b.z(5, hashMap0, "Green X", 6, "Green Y");
        com.apollographql.apollo.api.b.z(7, hashMap0, "Blue X", 8, "Blue Y");
    }

    public PngChromaticitiesDirectory() {
        this.setDescriptor(new g(this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "PNG Chromaticities";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return PngChromaticitiesDirectory._tagNameMap;
    }
}

