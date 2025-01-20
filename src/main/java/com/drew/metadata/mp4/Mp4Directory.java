package com.drew.metadata.mp4;

import com.drew.metadata.b;
import java.util.HashMap;

public class Mp4Directory extends b {
    public static final int TAG_COMPATIBLE_BRANDS = 3;
    public static final int TAG_CREATION_TIME = 0x100;
    public static final int TAG_CURRENT_TIME = 0x10D;
    public static final int TAG_DURATION = 0x103;
    public static final int TAG_DURATION_SECONDS = 260;
    public static final int TAG_LATITUDE = 0x2001;
    public static final int TAG_LONGITUDE = 0x2002;
    public static final int TAG_MAJOR_BRAND = 1;
    public static final int TAG_MEDIA_TIME_SCALE = 0x306;
    public static final int TAG_MINOR_VERSION = 2;
    public static final int TAG_MODIFICATION_TIME = 0x101;
    public static final int TAG_NEXT_TRACK_ID = 270;
    public static final int TAG_POSTER_TIME = 0x10A;
    public static final int TAG_PREFERRED_RATE = 0x105;
    public static final int TAG_PREFERRED_VOLUME = 0x106;
    public static final int TAG_PREVIEW_DURATION = 0x109;
    public static final int TAG_PREVIEW_TIME = 0x108;
    public static final int TAG_ROTATION = 0x200;
    public static final int TAG_SELECTION_DURATION = 0x10C;
    public static final int TAG_SELECTION_TIME = 0x10B;
    public static final int TAG_TIME_SCALE = 0x102;
    public static final int TAG_TRANSFORMATION_MATRIX = 0x10F;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        Mp4Directory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Major Brand", 2, "Minor Version");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Compatible Brands", 0x100, "Creation Time");
        com.apollographql.apollo.api.b.z(0x101, hashMap0, "Modification Time", 0x102, "Media Time Scale");
        com.apollographql.apollo.api.b.z(0x103, hashMap0, "Duration", 260, "Duration in Seconds");
        com.apollographql.apollo.api.b.z(0x105, hashMap0, "Preferred Rate", 0x106, "Preferred Volume");
        com.apollographql.apollo.api.b.z(0x108, hashMap0, "Preview Time", 0x109, "Preview Duration");
        com.apollographql.apollo.api.b.z(0x10A, hashMap0, "Poster Time", 0x10B, "Selection Time");
        com.apollographql.apollo.api.b.z(0x10C, hashMap0, "Selection Duration", 0x10D, "Current Time");
        com.apollographql.apollo.api.b.z(270, hashMap0, "Next Track ID", 0x10F, "Transformation Matrix");
        com.apollographql.apollo.api.b.z(0x200, hashMap0, "Rotation", 0x2001, "Latitude");
        com.apollographql.apollo.api.b.z(0x2002, hashMap0, "Longitude", 0x306, "Media Time Scale");
    }

    public Mp4Directory() {
        this.setDescriptor(new A4.b(2, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "MP4";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return Mp4Directory._tagNameMap;
    }
}

