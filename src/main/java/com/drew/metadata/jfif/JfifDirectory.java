package com.drew.metadata.jfif;

import com.drew.metadata.b;
import java.util.HashMap;
import r4.a;

public class JfifDirectory extends b {
    public static final int TAG_RESX = 8;
    public static final int TAG_RESY = 10;
    public static final int TAG_THUMB_HEIGHT = 13;
    public static final int TAG_THUMB_WIDTH = 12;
    public static final int TAG_UNITS = 7;
    public static final int TAG_VERSION = 5;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        JfifDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(5, hashMap0, "Version", 7, "Resolution Units");
        com.apollographql.apollo.api.b.z(10, hashMap0, "Y Resolution", 8, "X Resolution");
        com.apollographql.apollo.api.b.z(12, hashMap0, "Thumbnail Width Pixels", 13, "Thumbnail Height Pixels");
    }

    public JfifDirectory() {
        this.setDescriptor(new a(10, this));
    }

    @Deprecated
    public int getImageHeight() {
        return this.getInt(8);
    }

    @Deprecated
    public int getImageWidth() {
        return this.getInt(10);
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "JFIF";
    }

    public int getResUnits() {
        return this.getInt(7);
    }

    public int getResX() {
        return this.getInt(8);
    }

    public int getResY() {
        return this.getInt(10);
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return JfifDirectory._tagNameMap;
    }

    public int getVersion() {
        return this.getInt(5);
    }
}

