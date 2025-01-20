package com.drew.metadata.mov;

import com.drew.metadata.b;
import java.util.HashMap;

public class QuickTimeDirectory extends b {
    public static final int TAG_ADOBE_XMP = 0x3000;
    public static final int TAG_CANON_THUMBNAIL_DT = 0x2000;
    public static final int TAG_COMPATIBLE_BRANDS = 0x1002;
    public static final int TAG_CREATION_TIME = 0x100;
    public static final int TAG_CURRENT_TIME = 0x10C;
    public static final int TAG_DURATION = 0x103;
    public static final int TAG_DURATION_SECONDS = 260;
    public static final int TAG_MAJOR_BRAND = 0x1000;
    public static final int TAG_MEDIA_TIME_SCALE = 0x306;
    public static final int TAG_MINOR_VERSION = 0x1001;
    public static final int TAG_MODIFICATION_TIME = 0x101;
    public static final int TAG_NEXT_TRACK_ID = 0x10D;
    public static final int TAG_POSTER_TIME = 0x109;
    public static final int TAG_PREFERRED_RATE = 0x105;
    public static final int TAG_PREFERRED_VOLUME = 0x106;
    public static final int TAG_PREVIEW_DURATION = 0x108;
    public static final int TAG_PREVIEW_TIME = 0x107;
    public static final int TAG_ROTATION = 270;
    public static final int TAG_SELECTION_DURATION = 0x10B;
    public static final int TAG_SELECTION_TIME = 0x10A;
    public static final int TAG_TIME_SCALE = 0x102;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        QuickTimeDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0x1000, hashMap0, "Major Brand", 0x1001, "Minor Version");
        com.apollographql.apollo.api.b.z(0x1002, hashMap0, "Compatible Brands", 0x100, "Creation Time");
        com.apollographql.apollo.api.b.z(0x101, hashMap0, "Modification Time", 0x102, "Media Time Scale");
        com.apollographql.apollo.api.b.z(0x103, hashMap0, "Duration", 260, "Duration in Seconds");
        com.apollographql.apollo.api.b.z(0x105, hashMap0, "Preferred Rate", 0x106, "Preferred Volume");
        com.apollographql.apollo.api.b.z(0x107, hashMap0, "Preview Time", 0x108, "Preview Duration");
        com.apollographql.apollo.api.b.z(0x109, hashMap0, "Poster Time", 0x10A, "Selection Time");
        com.apollographql.apollo.api.b.z(0x10B, hashMap0, "Selection Duration", 0x10C, "Current Time");
        com.apollographql.apollo.api.b.z(0x10D, hashMap0, "Next Track ID", 270, "Rotation");
        com.apollographql.apollo.api.b.z(0x306, hashMap0, "Media Time Scale", 0x2000, "Canon Thumbnail DateTime");
        hashMap0.put(0x3000, "Adobe Bridge XMP");
    }

    public QuickTimeDirectory() {
        this.setDescriptor(new A4.b(0, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "QuickTime";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return QuickTimeDirectory._tagNameMap;
    }
}

