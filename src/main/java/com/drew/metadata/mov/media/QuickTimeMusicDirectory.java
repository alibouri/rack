package com.drew.metadata.mov.media;

import C4.a;
import com.drew.metadata.mov.QuickTimeDirectory;
import java.util.HashMap;

public class QuickTimeMusicDirectory extends QuickTimeDirectory {
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        QuickTimeMusicDirectory._tagNameMap = hashMap0;
        QuickTimeMediaDirectory.addQuickTimeMediaTags(hashMap0);
    }

    public QuickTimeMusicDirectory() {
        this.setDescriptor(new a(0, this));
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public String getName() {
        return "QuickTime Music";
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public HashMap getTagNameMap() {
        return QuickTimeMusicDirectory._tagNameMap;
    }
}

