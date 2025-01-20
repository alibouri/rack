package com.drew.metadata.gif;

import com.drew.metadata.b;
import com.drew.metadata.e;
import java.util.HashMap;
import r4.a;

public class GifCommentDirectory extends b {
    public static final int TAG_COMMENT = 1;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        GifCommentDirectory._tagNameMap = hashMap0;
        hashMap0.put(1, "Comment");
    }

    public GifCommentDirectory(e e0) {
        this.setDescriptor(new a(2, this));
        this.setStringValue(1, e0);
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "GIF Comment";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return GifCommentDirectory._tagNameMap;
    }
}

