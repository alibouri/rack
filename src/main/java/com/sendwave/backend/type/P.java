package com.sendwave.backend.type;

import Bb.q;
import Nb.j;
import com.apollographql.apollo.api.EnumType;

public final class p {
    public static final p a;

    static {
        p.a = new p();  // initializer: Ljava/lang/Object;-><init>()V
        new EnumType("AnnouncementEventType", q.L(new String[]{"SEEN", "DISMISSED", "PLAYED", "SPLASH_PRESENTED", "TAPPED"}));
    }

    public static AnnouncementEventType a(String s) {
        j.f(s, "rawValue");
        switch(s.hashCode()) {
            case 0x8CD18ED3: {
                if(s.equals("PLAYED")) {
                    return PLAYED.X;
                }
                break;
            }
            case 0x93109E8C: {
                if(s.equals("TAPPED")) {
                    return TAPPED.X;
                }
                break;
            }
            case 0xAF995489: {
                if(s.equals("DISMISSED")) {
                    return DISMISSED.X;
                }
                break;
            }
            case 0x26C67B: {
                if(s.equals("SEEN")) {
                    return SEEN.X;
                }
                break;
            }
            case 1229510306: {
                if(s.equals("SPLASH_PRESENTED")) {
                    return SPLASH_PRESENTED.X;
                }
                break;
            }
            default: {
                return new UNKNOWN__(s);
            }
        }
        return new UNKNOWN__(s);
    }
}

