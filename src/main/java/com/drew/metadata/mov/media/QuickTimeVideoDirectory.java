package com.drew.metadata.mov.media;

import C4.a;
import com.apollographql.apollo.api.b;
import java.util.HashMap;

public class QuickTimeVideoDirectory extends QuickTimeMediaDirectory {
    public static final int TAG_COLOR_TABLE = 13;
    public static final int TAG_COMPRESSION_TYPE = 10;
    public static final int TAG_COMPRESSOR_NAME = 8;
    public static final int TAG_DEPTH = 9;
    public static final int TAG_FRAME_RATE = 14;
    public static final int TAG_GRAPHICS_MODE = 11;
    public static final int TAG_HEIGHT = 5;
    public static final int TAG_HORIZONTAL_RESOLUTION = 6;
    public static final int TAG_OPCOLOR = 12;
    public static final int TAG_SPATIAL_QUALITY = 3;
    public static final int TAG_TEMPORAL_QUALITY = 2;
    public static final int TAG_VENDOR = 1;
    public static final int TAG_VERTICAL_RESOLUTION = 7;
    public static final int TAG_WIDTH = 4;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        QuickTimeVideoDirectory._tagNameMap = hashMap0;
        QuickTimeMediaDirectory.addQuickTimeMediaTags(hashMap0);
        hashMap0.put(1, "Vendor");
        hashMap0.put(2, "Temporal Quality");
        b.z(3, hashMap0, "Spatial Quality", 4, "Width");
        b.z(5, hashMap0, "Height", 6, "Horizontal Resolution");
        b.z(7, hashMap0, "Vertical Resolution", 8, "Compressor Name");
        b.z(9, hashMap0, "Depth", 10, "Compression Type");
        b.z(11, hashMap0, "Graphics Mode", 12, "Opcolor");
        b.z(13, hashMap0, "Color Table", 14, "Frame Rate");
    }

    public QuickTimeVideoDirectory() {
        this.setDescriptor(new a(5, this));
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public String getName() {
        return "QuickTime Video";
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public HashMap getTagNameMap() {
        return QuickTimeVideoDirectory._tagNameMap;
    }
}

