package com.drew.metadata.mp4.media;

import com.apollographql.apollo.api.b;
import java.util.HashMap;

public class Mp4VideoDirectory extends Mp4MediaDirectory {
    public static final int TAG_COLOR_TABLE = 0xD5;
    public static final int TAG_COMPRESSION_TYPE = 210;
    public static final int TAG_COMPRESSOR_NAME = 0xD0;
    public static final int TAG_DEPTH = 209;
    public static final int TAG_FRAME_RATE = 0xD6;
    public static final int TAG_GRAPHICS_MODE = 0xD3;
    public static final int TAG_HEIGHT = 205;
    public static final int TAG_HORIZONTAL_RESOLUTION = 206;
    public static final int TAG_OPCOLOR = 0xD4;
    public static final int TAG_SPATIAL_QUALITY = 203;
    public static final int TAG_TEMPORAL_QUALITY = 202;
    public static final int TAG_VENDOR = 201;
    public static final int TAG_VERTICAL_RESOLUTION = 0xCF;
    public static final int TAG_WIDTH = 204;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        Mp4VideoDirectory._tagNameMap = hashMap0;
        Mp4MediaDirectory.addMp4MediaTags(hashMap0);
        hashMap0.put(201, "Vendor");
        hashMap0.put(202, "Temporal Quality");
        b.z(203, hashMap0, "Spatial Quality", 204, "Width");
        b.z(205, hashMap0, "Height", 206, "Horizontal Resolution");
        b.z(0xCF, hashMap0, "Vertical Resolution", 0xD0, "Compressor Name");
        b.z(209, hashMap0, "Depth", 210, "Compression Type");
        b.z(0xD3, hashMap0, "Graphics Mode", 0xD4, "Opcolor");
        b.z(0xD5, hashMap0, "Color Table", 0xD6, "Frame Rate");
    }

    public Mp4VideoDirectory() {
        this.setDescriptor(new A4.b(8, this));
    }

    @Override  // com.drew.metadata.mp4.Mp4Directory
    public String getName() {
        return "MP4 Video";
    }

    @Override  // com.drew.metadata.mp4.Mp4Directory
    public HashMap getTagNameMap() {
        return Mp4VideoDirectory._tagNameMap;
    }
}

