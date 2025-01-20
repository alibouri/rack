package com.drew.metadata.png;

import com.drew.metadata.b;
import h4.d;
import java.util.HashMap;

public class PngDirectory extends b {
    public static final int TAG_BACKGROUND_COLOR = 15;
    public static final int TAG_BITS_PER_SAMPLE = 3;
    public static final int TAG_COLOR_TYPE = 4;
    public static final int TAG_COMPRESSION_TYPE = 5;
    public static final int TAG_FILTER_METHOD = 6;
    public static final int TAG_GAMMA = 11;
    public static final int TAG_ICC_PROFILE_NAME = 12;
    public static final int TAG_IMAGE_HEIGHT = 2;
    public static final int TAG_IMAGE_WIDTH = 1;
    public static final int TAG_INTERLACE_METHOD = 7;
    public static final int TAG_LAST_MODIFICATION_TIME = 14;
    public static final int TAG_PALETTE_HAS_TRANSPARENCY = 9;
    public static final int TAG_PALETTE_SIZE = 8;
    public static final int TAG_PIXELS_PER_UNIT_X = 16;
    public static final int TAG_PIXELS_PER_UNIT_Y = 17;
    public static final int TAG_SIGNIFICANT_BITS = 19;
    public static final int TAG_SRGB_RENDERING_INTENT = 10;
    public static final int TAG_TEXTUAL_DATA = 13;
    public static final int TAG_UNIT_SPECIFIER = 18;
    private final d _pngChunkType;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        PngDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(2, hashMap0, "Image Height", 1, "Image Width");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Bits Per Sample", 4, "Color Type");
        com.apollographql.apollo.api.b.z(5, hashMap0, "Compression Type", 6, "Filter Method");
        com.apollographql.apollo.api.b.z(7, hashMap0, "Interlace Method", 8, "Palette Size");
        com.apollographql.apollo.api.b.z(9, hashMap0, "Palette Has Transparency", 10, "sRGB Rendering Intent");
        com.apollographql.apollo.api.b.z(11, hashMap0, "Image Gamma", 12, "ICC Profile Name");
        com.apollographql.apollo.api.b.z(13, hashMap0, "Textual Data", 14, "Last Modification Time");
        com.apollographql.apollo.api.b.z(15, hashMap0, "Background Color", 16, "Pixels Per Unit X");
        com.apollographql.apollo.api.b.z(17, hashMap0, "Pixels Per Unit Y", 18, "Unit Specifier");
        hashMap0.put(19, "Significant Bits");
    }

    public PngDirectory(d d0) {
        this._pngChunkType = d0;
        this.setDescriptor(new A4.b(10, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "PNG-" + this._pngChunkType.a();
    }

    public d getPngChunkType() {
        return this._pngChunkType;
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return PngDirectory._tagNameMap;
    }
}

