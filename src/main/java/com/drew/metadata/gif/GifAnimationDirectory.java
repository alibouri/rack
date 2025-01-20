package com.drew.metadata.gif;

import com.drew.metadata.b;
import java.util.HashMap;
import r4.a;

public class GifAnimationDirectory extends b {
    public static final int TAG_ITERATION_COUNT = 1;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        GifAnimationDirectory._tagNameMap = hashMap0;
        hashMap0.put(1, "Iteration Count");
    }

    public GifAnimationDirectory() {
        this.setDescriptor(new a(1, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "GIF Animation";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return GifAnimationDirectory._tagNameMap;
    }
}

