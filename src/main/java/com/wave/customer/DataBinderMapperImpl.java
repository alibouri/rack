package com.wave.customer;

import R1.b;
import R1.g;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ca.A;
import ca.C;
import ca.E;
import ca.G;
import ca.H;
import ca.I;
import ca.J;
import ca.K;
import ca.M;
import ca.N;
import ca.P;
import ca.S;
import ca.T;
import ca.V;
import ca.X;
import ca.Z;
import ca.b0;
import ca.c;
import ca.d0;
import ca.d;
import ca.f0;
import ca.f;
import ca.h;
import ca.j;
import ca.l;
import ca.n;
import ca.p;
import ca.r;
import ca.s;
import ca.t;
import ca.v;
import ca.x;
import ca.z;
import com.sendwave.components.CustomKeyboardRequesterEditText;
import com.sendwave.components.KeypadView;
import com.sendwave.components.QRCodeView;
import com.sendwave.components.SimpleRecyclerView;
import com.sendwave.util.CurrencyAmountView;
import com.sendwave.util.DynamicImageView;
import com.sendwave.util.WaveBarcodeView;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends b {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray(36);
        DataBinderMapperImpl.a = sparseIntArray0;
        sparseIntArray0.put(0x7F0D0027, 1);  // layout:api_checkout_confirm
        sparseIntArray0.put(0x7F0D002A, 2);  // layout:bill_category_item
        sparseIntArray0.put(0x7F0D002E, 3);  // layout:business_search_item
        sparseIntArray0.put(0x7F0D002F, 4);  // layout:buy_airtime_dialog
        sparseIntArray0.put(0x7F0D0030, 5);  // layout:buy_airtime_recipient_header
        sparseIntArray0.put(0x7F0D0031, 6);  // layout:buy_airtime_select
        sparseIntArray0.put(0x7F0D0032, 7);  // layout:card_full_screen
        sparseIntArray0.put(0x7F0D0033, 8);  // layout:card_full_screen_portrait
        sparseIntArray0.put(0x7F0D0035, 9);  // layout:confirm_checkout
        sparseIntArray0.put(0x7F0D0039, 10);  // layout:create_linked_account
        sparseIntArray0.put(0x7F0D003A, 11);  // layout:create_linked_account_field
        sparseIntArray0.put(0x7F0D003B, 12);  // layout:create_linked_account_header
        sparseIntArray0.put(0x7F0D003C, 13);  // layout:create_linked_account_terms
        sparseIntArray0.put(0x7F0D0053, 14);  // layout:enter_name
        sparseIntArray0.put(0x7F0D0066, 15);  // layout:linked_account_activation_key
        sparseIntArray0.put(0x7F0D0067, 16);  // layout:linked_account_creation_otp
        sparseIntArray0.put(0x7F0D0068, 17);  // layout:linked_account_list_item
        sparseIntArray0.put(0x7F0D0069, 18);  // layout:linked_account_select
        sparseIntArray0.put(0x7F0D006A, 19);  // layout:linked_account_success_dialog
        sparseIntArray0.put(0x7F0D006B, 20);  // layout:linked_account_transfer
        sparseIntArray0.put(0x7F0D006C, 21);  // layout:linked_account_transfer_choose_direction
        sparseIntArray0.put(0x7F0D006D, 22);  // layout:linked_account_transfer_choose_direction_item
        sparseIntArray0.put(0x7F0D006E, 23);  // layout:linked_account_transfer_confirmation
        sparseIntArray0.put(0x7F0D00AE, 24);  // layout:offline_indicator
        sparseIntArray0.put(0x7F0D00BC, 25);  // layout:pay_merchant
        sparseIntArray0.put(0x7F0D00BD, 26);  // layout:pay_merchant_confirmation
        sparseIntArray0.put(0x7F0D00BE, 27);  // layout:payment_categories
        sparseIntArray0.put(0x7F0D00BF, 28);  // layout:payment_category_header_item
        sparseIntArray0.put(0x7F0D00C0, 29);  // layout:payment_list
        sparseIntArray0.put(0x7F0D00C1, 30);  // layout:payment_list_empty_message
        sparseIntArray0.put(0x7F0D00CE, 0x1F);  // layout:pin_entry
        sparseIntArray0.put(0x7F0D00E2, 0x20);  // layout:qr_scan_or_card
        sparseIntArray0.put(0x7F0D00E7, 33);  // layout:scan_qr
        sparseIntArray0.put(0x7F0D00F3, 34);  // layout:signup_login
        sparseIntArray0.put(0x7F0D0104, 35);  // layout:upgrade_to_pin
        sparseIntArray0.put(0x7F0D0107, 36);  // layout:virtual_card_qr_code
    }

    @Override  // R1.b
    public final List a() {
        List list0 = new ArrayList(3);
        ((ArrayList)list0).add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        ((ArrayList)list0).add(new com.sendwave.lib.DataBinderMapperImpl());
        ((ArrayList)list0).add(new com.wave.components.sendmoney.DataBinderMapperImpl());
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
                        if(!"layout/api_checkout_confirm_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for api_checkout_confirm is invalid. Received: " + object0);
                        }
                        return new ca.b(view0);
                    }
                    case 2: {
                        if(!"layout/bill_category_item_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for bill_category_item is invalid. Received: " + object0);
                        }
                        return new c(view0, 0);
                    }
                    case 3: {
                        if(!"layout/business_search_item_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for business_search_item is invalid. Received: " + object0);
                        }
                        return new d(view0);
                    }
                    case 4: {
                        if(!"layout/buy_airtime_dialog_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for buy_airtime_dialog is invalid. Received: " + object0);
                        }
                        return new f(view0);
                    }
                    case 5: {
                        if(!"layout/buy_airtime_recipient_header_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for buy_airtime_recipient_header is invalid. Received: " + object0);
                        }
                        Object[] arr_object = g.l(view0, 6, null, h.w);
                        ImageView imageView0 = (ImageView)arr_object[1];
                        ConstraintLayout constraintLayout0 = (ConstraintLayout)arr_object[4];
                        TextView textView0 = (TextView)arr_object[3];
                        View view1 = (View)arr_object[5];
                        h h0 = new h(null, view0, imageView0, textView0, ((ConstraintLayout)arr_object[0]), ((TextView)arr_object[2]));  // initializer: Lca/g;-><init>(LR1/c;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;)V
                        h0.v = -1L;
                        ((ImageView)h0.s).setTag(null);
                        h0.q.setTag(null);
                        ((ConstraintLayout)h0.t).setTag(null);
                        h0.r.setTag(null);
                        view0.setTag(0x7F0A0104, h0);  // id:dataBinding
                        h0.j();
                        return h0;
                    }
                    case 6: {
                        if(!"layout/buy_airtime_select_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for buy_airtime_select is invalid. Received: " + object0);
                        }
                        return new j(view0);
                    }
                    case 7: {
                        if(!"layout/card_full_screen_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for card_full_screen is invalid. Received: " + object0);
                        }
                        return new l(view0);
                    }
                    case 8: {
                        if(!"layout/card_full_screen_portrait_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for card_full_screen_portrait is invalid. Received: " + object0);
                        }
                        return new n(view0);
                    }
                    case 9: {
                        if(!"layout/confirm_checkout_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for confirm_checkout is invalid. Received: " + object0);
                        }
                        Object[] arr_object1 = g.l(view0, 6, null, p.u);
                        CurrencyAmountView currencyAmountView0 = (CurrencyAmountView)arr_object1[2];
                        TextView textView1 = (TextView)arr_object1[5];
                        RelativeLayout relativeLayout0 = (RelativeLayout)arr_object1[3];
                        TextView textView2 = (TextView)arr_object1[4];
                        g g0 = new p(null, view0, currencyAmountView0, ((TextView)arr_object1[1]));  // initializer: Lca/o;-><init>(LR1/c;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V
                        g0.t = -1L;
                        ((CurrencyAmountView)g0.r).setTag(null);
                        ((LinearLayout)arr_object1[0]).setTag(null);
                        g0.q.setTag(null);
                        g0.s(view0);
                        ((p)g0).j();
                        return g0;
                    }
                    case 10: {
                        if(!"layout/create_linked_account_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for create_linked_account is invalid. Received: " + object0);
                        }
                        return new r(view0);
                    }
                    case 11: {
                        if(!"layout/create_linked_account_field_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for create_linked_account_field is invalid. Received: " + object0);
                        }
                        return new s(view0, 0);
                    }
                    case 12: {
                        if(!"layout/create_linked_account_header_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for create_linked_account_header is invalid. Received: " + object0);
                        }
                        Object[] arr_object2 = g.l(view0, 3, null, null);
                        L9.f f0 = new L9.f(null, view0, ((ConstraintLayout)arr_object2[0]), ((ImageView)arr_object2[1]), ((TextView)arr_object2[2]), 1);
                        f0.s = -1L;
                        ((ConstraintLayout)f0.t).setTag(null);
                        ((ImageView)f0.u).setTag(null);
                        ((TextView)f0.r).setTag(null);
                        view0.setTag(0x7F0A0104, f0);  // id:dataBinding
                        f0.j();
                        return f0;
                    }
                    case 13: {
                        if(!"layout/create_linked_account_terms_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for create_linked_account_terms is invalid. Received: " + object0);
                        }
                        return new t(view0, 0);
                    }
                    case 14: {
                        if(!"layout/enter_name_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for enter_name is invalid. Received: " + object0);
                        }
                        return new v(view0);
                    }
                    case 15: {
                        if(!"layout/linked_account_activation_key_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for linked_account_activation_key is invalid. Received: " + object0);
                        }
                        return new x(view0);
                    }
                    case 16: {
                        if(!"layout/linked_account_creation_otp_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for linked_account_creation_otp is invalid. Received: " + object0);
                        }
                        return new z(view0);
                    }
                    case 17: {
                        if(!"layout/linked_account_list_item_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for linked_account_list_item is invalid. Received: " + object0);
                        }
                        return new A(view0);
                    }
                    case 18: {
                        if(!"layout/linked_account_select_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for linked_account_select is invalid. Received: " + object0);
                        }
                        return new C(view0);
                    }
                    case 19: {
                        if(!"layout/linked_account_success_dialog_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for linked_account_success_dialog is invalid. Received: " + object0);
                        }
                        Object[] arr_object3 = g.l(view0, 4, null, E.r);
                        TextView textView3 = (TextView)arr_object3[2];
                        TextView textView4 = (TextView)arr_object3[3];
                        ImageView imageView1 = (ImageView)arr_object3[1];
                        g g1 = new E(null, view0, 0);  // initializer: LR1/g;-><init>(Ljava/lang/Object;Landroid/view/View;I)V
                        g1.q = -1L;
                        ((ConstraintLayout)arr_object3[0]).setTag(null);
                        g1.s(view0);
                        ((E)g1).j();
                        return g1;
                    }
                    case 20: {
                        if(!"layout/linked_account_transfer_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for linked_account_transfer is invalid. Received: " + object0);
                        }
                        return new G(view0);
                    }
                    case 21: {
                        if(!"layout/linked_account_transfer_choose_direction_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for linked_account_transfer_choose_direction is invalid. Received: " + object0);
                        }
                        return new H(view0);
                    }
                    case 22: {
                        if(!"layout/linked_account_transfer_choose_direction_item_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for linked_account_transfer_choose_direction_item is invalid. Received: " + object0);
                        }
                        return new I(view0);
                    }
                    case 23: {
                        if(!"layout/linked_account_transfer_confirmation_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for linked_account_transfer_confirmation is invalid. Received: " + object0);
                        }
                        return new J(view0);
                    }
                    case 24: {
                        if(!"layout/offline_indicator_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for offline_indicator is invalid. Received: " + object0);
                        }
                        Object[] arr_object4 = g.l(view0, 3, null, K.r);
                        AppCompatImageView appCompatImageView0 = (AppCompatImageView)arr_object4[1];
                        TextView textView5 = (TextView)arr_object4[2];
                        g g2 = new K(null, view0, 0);  // initializer: LR1/g;-><init>(Ljava/lang/Object;Landroid/view/View;I)V
                        g2.q = -1L;
                        ((ConstraintLayout)arr_object4[0]).setTag(null);
                        g2.s(view0);
                        ((K)g2).j();
                        return g2;
                    }
                    case 25: {
                        if(!"layout/pay_merchant_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for pay_merchant is invalid. Received: " + object0);
                        }
                        return new M(view0);
                    }
                    case 26: {
                        if(!"layout/pay_merchant_confirmation_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for pay_merchant_confirmation is invalid. Received: " + object0);
                        }
                        return new N(view0, 0);
                    }
                    case 27: {
                        if(!"layout/payment_categories_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for payment_categories is invalid. Received: " + object0);
                        }
                        g g3 = new P(null, view0, ((SimpleRecyclerView)g.l(view0, 1, null, null)[0]));  // initializer: Lca/O;-><init>(LR1/c;Landroid/view/View;Lcom/sendwave/components/SimpleRecyclerView;)V
                        g3.s = -1L;
                        g3.q.setTag(null);
                        view0.setTag(0x7F0A0104, g3);  // id:dataBinding
                        ((P)g3).j();
                        return g3;
                    }
                    case 28: {
                        if(!"layout/payment_category_header_item_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for payment_category_header_item is invalid. Received: " + object0);
                        }
                        Object[] arr_object5 = g.l(view0, 3, null, null);
                        g g4 = new L9.f(null, view0, ((LinearLayout)arr_object5[1]), ((TextView)arr_object5[2]));
                        g4.s = -1L;
                        ((LinearLayout)g4.t).setTag(null);
                        ((FrameLayout)arr_object5[0]).setTag(null);
                        ((TextView)g4.r).setTag(null);
                        g4.s(view0);
                        ((L9.f)g4).j();
                        return g4;
                    }
                    case 29: {
                        if(!"layout/payment_list_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for payment_list is invalid. Received: " + object0);
                        }
                        return new S(view0);
                    }
                    case 30: {
                        if(!"layout/payment_list_empty_message_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for payment_list_empty_message is invalid. Received: " + object0);
                        }
                        Object[] arr_object6 = g.l(view0, 4, null, T.r);
                        AppCompatImageView appCompatImageView1 = (AppCompatImageView)arr_object6[1];
                        TextView textView6 = (TextView)arr_object6[2];
                        TextView textView7 = (TextView)arr_object6[3];
                        g g5 = new T(null, view0, 0);  // initializer: LR1/g;-><init>(Ljava/lang/Object;Landroid/view/View;I)V
                        g5.q = -1L;
                        ((ConstraintLayout)arr_object6[0]).setTag(null);
                        g5.s(view0);
                        ((T)g5).j();
                        return g5;
                    }
                    case 0x1F: {
                        if(!"layout/pin_entry_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for pin_entry is invalid. Received: " + object0);
                        }
                        return new V(view0);
                    }
                    case 0x20: {
                        if(!"layout/qr_scan_or_card_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for qr_scan_or_card is invalid. Received: " + object0);
                        }
                        return new X(view0);
                    }
                    case 33: {
                        if(!"layout/scan_qr_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for scan_qr is invalid. Received: " + object0);
                        }
                        Object[] arr_object7 = g.l(view0, 11, null, Z.w);
                        WaveBarcodeView waveBarcodeView0 = (WaveBarcodeView)arr_object7[1];
                        View view2 = (View)arr_object7[4];
                        FrameLayout frameLayout0 = (FrameLayout)arr_object7[8];
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView)arr_object7[9];
                        Guideline guideline0 = (Guideline)arr_object7[2];
                        DynamicImageView dynamicImageView0 = (DynamicImageView)arr_object7[7];
                        View view3 = (View)arr_object7[5];
                        ConstraintLayout constraintLayout1 = (ConstraintLayout)arr_object7[0];
                        View view4 = (View)arr_object7[6];
                        TextView textView8 = (TextView)arr_object7[10];
                        View view5 = (View)arr_object7[3];
                        Z z0 = new Z(null, view0, waveBarcodeView0, frameLayout0, appCompatImageView2, constraintLayout1);  // initializer: Lca/Y;-><init>(LR1/c;Landroid/view/View;Lcom/sendwave/util/WaveBarcodeView;Landroid/widget/FrameLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/constraintlayout/widget/ConstraintLayout;)V
                        z0.v = -1L;
                        z0.t.setTag(null);
                        view0.setTag(0x7F0A0104, z0);  // id:dataBinding
                        z0.j();
                        return z0;
                    }
                    case 34: {
                        if(!"layout/signup_login_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for signup_login is invalid. Received: " + object0);
                        }
                        return new b0(view0);
                    }
                    case 35: {
                        if(!"layout/upgrade_to_pin_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for upgrade_to_pin is invalid. Received: " + object0);
                        }
                        Object[] arr_object8 = g.l(view0, 6, null, d0.v);
                        CustomKeyboardRequesterEditText customKeyboardRequesterEditText0 = (CustomKeyboardRequesterEditText)arr_object8[2];
                        KeypadView keypadView0 = (KeypadView)arr_object8[5];
                        TextView textView9 = (TextView)arr_object8[4];
                        ProgressBar progressBar0 = (ProgressBar)arr_object8[1];
                        Toolbar toolbar0 = (Toolbar)arr_object8[3];
                        g g6 = new d0(null, view0, customKeyboardRequesterEditText0, progressBar0);  // initializer: Lca/c0;-><init>(LR1/c;Landroid/view/View;Lcom/sendwave/components/CustomKeyboardRequesterEditText;Landroid/widget/ProgressBar;)V
                        g6.u = -1L;
                        g6.q.setTag(null);
                        ((ConstraintLayout)arr_object8[0]).setTag(null);
                        g6.r.setTag(null);
                        g6.s(view0);
                        ((d0)g6).j();
                        return g6;
                    }
                    case 36: {
                        if(!"layout/virtual_card_qr_code_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for virtual_card_qr_code is invalid. Received: " + object0);
                        }
                        Object[] arr_object9 = g.l(view0, 3, null, f0.t);
                        ImageView imageView2 = (ImageView)arr_object9[2];
                        g g7 = new f0(null, view0, ((QRCodeView)arr_object9[1]));  // initializer: Lca/e0;-><init>(LR1/c;Landroid/view/View;Lcom/sendwave/components/QRCodeView;)V
                        g7.s = -1L;
                        ((FrameLayout)arr_object9[0]).setTag(null);
                        g7.q.setTag(null);
                        g7.s(view0);
                        ((f0)g7).j();
                        return g7;
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

