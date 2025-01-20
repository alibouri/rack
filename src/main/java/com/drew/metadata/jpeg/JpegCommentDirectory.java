package com.drew.metadata.jpeg;

import com.drew.metadata.b;
import java.util.HashMap;

public class JpegCommentDirectory extends b {
    public static final int TAG_COMMENT;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        JpegCommentDirectory._tagNameMap = hashMap0;
        hashMap0.put(0, "JPEG Comment");
    }

    public JpegCommentDirectory() {
        this.setDescriptor(new A4.b(15, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "JpegComment";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return JpegCommentDirectory._tagNameMap;
    }
}

