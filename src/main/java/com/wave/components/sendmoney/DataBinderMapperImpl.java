package com.wave.components.sendmoney;

import L9.c;
import L9.e;
import L9.f;
import L9.h;
import L9.j;
import L9.l;
import L9.n;
import R1.b;
import R1.g;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends b {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray(9);
        DataBinderMapperImpl.a = sparseIntArray0;
        sparseIntArray0.put(0x7F0D0054, 1);  // layout:enter_recipient_details
        sparseIntArray0.put(0x7F0D006F, 2);  // layout:list_header
        sparseIntArray0.put(0x7F0D00AF, 3);  // layout:overdraft_banner
        sparseIntArray0.put(0x7F0D00D0, 4);  // layout:please_enable_contacts_button
        sparseIntArray0.put(0x7F0D00E4, 5);  // layout:recipient_list_item
        sparseIntArray0.put(0x7F0D00E8, 6);  // layout:scan_to_send_button
        sparseIntArray0.put(0x7F0D00F0, 7);  // layout:send_money_dialog
        sparseIntArray0.put(0x7F0D00F1, 8);  // layout:send_money_select
        sparseIntArray0.put(0x7F0D00F2, 9);  // layout:send_to_a_new_number_item
    }

    @Override  // R1.b
    public final List a() {
        List list0 = new ArrayList(2);
        ((ArrayList)list0).add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        ((ArrayList)list0).add(new com.sendwave.lib.DataBinderMapperImpl());
        return list0;
    }

    @Override  // R1.b
    public final g b(View view0, int v) {
        int v1 = DataBinderMapperImpl.a.get(v);
        if(v1 > 0) {
            Object object0 = view0.getTag();
            if(object0 != null) {
                switch(v1) {
                    case 1: {
                        if(!"layout/enter_recipient_details_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for enter_recipient_details is invalid. Received: " + object0);
                        }
                        return new L9.b(view0);
                    }
                    case 2: {
                        if(!"layout/list_header_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for list_header is invalid. Received: " + object0);
                        }
                        g g0 = new c(null, view0, ((TextView)g.l(view0, 1, null, null)[0]), 0);
                        g0.r = -1L;
                        ((TextView)g0.s).setTag(null);
                        view0.setTag(0x7F0A0104, g0);  // id:dataBinding
                        ((c)g0).j();
                        return g0;
                    }
                    case 3: {
                        if(!"layout/overdraft_banner_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for overdraft_banner is invalid. Received: " + object0);
                        }
                        Object[] arr_object = g.l(view0, 3, null, e.s);
                        ImageView imageView0 = (ImageView)arr_object[1];
                        g g1 = new e(null, view0, ((TextView)arr_object[2]));  // initializer: LL9/d;-><init>(LR1/c;Landroid/view/View;Landroid/widget/TextView;)V
                        g1.r = -1L;
                        ((ConstraintLayout)arr_object[0]).setTag(null);
                        g1.s(view0);
                        ((e)g1).j();
                        return g1;
                    }
                    case 4: {
                        if(!"layout/please_enable_contacts_button_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for please_enable_contacts_button is invalid. Received: " + object0);
                        }
                        return new f(view0, 0);
                    }
                    case 5: {
                        if(!"layout/recipient_list_item_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for recipient_list_item is invalid. Received: " + object0);
                        }
                        return new h(view0);
                    }
                    case 6: {
                        if(!"layout/scan_to_send_button_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for scan_to_send_button is invalid. Received: " + object0);
                        }
                        Object[] arr_object1 = g.l(view0, 2, null, null);
                        g g2 = new c(null, view0, ((ScanToSendButton)arr_object1[1]), 1);
                        g2.r = -1L;
                        ((LinearLayout)arr_object1[0]).setTag(null);
                        ((ScanToSendButton)g2.s).setTag(null);
                        g2.s(view0);
                        ((c)g2).j();
                        return g2;
                    }
                    case 7: {
                        if(!"layout/send_money_dialog_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for send_money_dialog is invalid. Received: " + object0);
                        }
                        return new j(view0);
                    }
                    case 8: {
                        if(!"layout/send_money_select_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for send_money_select is invalid. Received: " + object0);
                        }
                        return new l(view0);
                    }
                    case 9: {
                        if(!"layout/send_to_a_new_number_item_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for send_to_a_new_number_item is invalid. Received: " + object0);
                        }
                        return new n(view0);
                    }
                    default: {
                        return null;
                    }
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override  // R1.b
    public final g c(View[] arr_view, int v) {
        if(arr_view.length == 0) {
            return null;
        }
        if(DataBinderMapperImpl.a.get(v) > 0 && arr_view[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}

