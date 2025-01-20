package com.drew.metadata.webp;

import com.drew.metadata.b;
import java.util.HashMap;

public class WebpDirectory extends b {
    public static final String CHUNK_EXIF = "EXIF";
    public static final String CHUNK_ICCP = "ICCP";
    public static final String CHUNK_VP8 = "VP8 ";
    public static final String CHUNK_VP8L = "VP8L";
    public static final String CHUNK_VP8X = "VP8X";
    public static final String CHUNK_XMP = "XMP ";
    public static final String FORMAT = "WEBP";
    public static final int TAG_HAS_ALPHA = 3;
    public static final int TAG_IMAGE_HEIGHT = 1;
    public static final int TAG_IMAGE_WIDTH = 2;
    public static final int TAG_IS_ANIMATION = 4;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        WebpDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Image Height", 2, "Image Width");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Has Alpha", 4, "Is Animation");
    }

    public WebpDirectory() {
        this.setDescriptor(new A4.b(11, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "WebP";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return WebpDirectory._tagNameMap;
    }
}

