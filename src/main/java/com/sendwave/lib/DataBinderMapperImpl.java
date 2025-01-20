package com.sendwave.lib;

import L9.f;
import R1.b;
import R1.g;
import android.util.SparseIntArray;
import android.view.SurfaceView;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sendwave.components.VerticalTextView;
import com.sendwave.util.CurrencyAmountView;
import com.sendwave.util.DynamicImageView;
import com.sendwave.util.WaveBarcodeView;
import com.sendwave.util.supportChannels.SupportChannelsModalComposeView;
import i9.B;
import i9.D;
import i9.E;
import i9.F;
import i9.G;
import i9.L;
import i9.N;
import i9.P;
import i9.Q;
import i9.S;
import i9.T;
import i9.V;
import i9.X;
import i9.Z;
import i9.b0;
import i9.c;
import i9.d0;
import i9.e0;
import i9.e;
import i9.h0;
import i9.h;
import i9.i;
import i9.j0;
import i9.k0;
import i9.k;
import i9.l;
import i9.m0;
import i9.n0;
import i9.n;
import i9.o0;
import i9.p;
import i9.q0;
import i9.r;
import i9.s0;
import i9.s;
import i9.t;
import i9.u0;
import i9.u;
import i9.w;
import i9.y;
import i9.z;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends b {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray(58);
        DataBinderMapperImpl.a = sparseIntArray0;
        sparseIntArray0.put(0x7F0D001C, 1);  // layout:activity_license_photo
        sparseIntArray0.put(0x7F0D001D, 2);  // layout:activity_license_photo_portrait
        sparseIntArray0.put(0x7F0D001E, 3);  // layout:activity_scan_qr_code
        sparseIntArray0.put(0x7F0D001F, 4);  // layout:activity_terms
        sparseIntArray0.put(0x7F0D0020, 5);  // layout:agent_list
        sparseIntArray0.put(0x7F0D0021, 6);  // layout:agent_location_item
        sparseIntArray0.put(0x7F0D0024, 7);  // layout:announcement
        sparseIntArray0.put(0x7F0D0025, 8);  // layout:announcement_audio_player
        sparseIntArray0.put(0x7F0D0026, 9);  // layout:announcement_detail
        sparseIntArray0.put(0x7F0D002B, 10);  // layout:bill_pay_2_confirmation
        sparseIntArray0.put(0x7F0D002C, 11);  // layout:bottom_sheet_dialog_stub
        sparseIntArray0.put(0x7F0D0036, 12);  // layout:confirm_p2p_overdraft_transfer_bottom_sheet
        sparseIntArray0.put(0x7F0D0037, 13);  // layout:confirm_p2p_transfer
        sparseIntArray0.put(0x7F0D0038, 14);  // layout:confirm_p2p_transfer_bottom_sheet
        sparseIntArray0.put(0x7F0D004F, 15);  // layout:dialog_confirm_pin
        sparseIntArray0.put(0x7F0D0052, 16);  // layout:dialog_terms
        sparseIntArray0.put(0x7F0D0056, 17);  // layout:extra_security_challenge
        sparseIntArray0.put(0x7F0D0057, 18);  // layout:extra_security_challenge_base
        sparseIntArray0.put(0x7F0D005C, 19);  // layout:item_bound_view
        sparseIntArray0.put(0x7F0D005D, 20);  // layout:item_confirm_bill_payment_field
        sparseIntArray0.put(0x7F0D005E, 21);  // layout:item_confirm_payment_sheet_field
        sparseIntArray0.put(0x7F0D0062, 22);  // layout:item_empty
        sparseIntArray0.put(0x7F0D0064, 23);  // layout:item_loading
        sparseIntArray0.put(0x7F0D0065, 24);  // layout:item_loading_only_spinner
        sparseIntArray0.put(0x7F0D0070, 25);  // layout:lock_screen
        sparseIntArray0.put(0x7F0D0071, 26);  // layout:login
        sparseIntArray0.put(0x7F0D00B0, 27);  // layout:pay_bill_add_favorite
        sparseIntArray0.put(0x7F0D00B1, 28);  // layout:pay_bill_balance
        sparseIntArray0.put(0x7F0D00B2, 29);  // layout:pay_bill_dialog
        sparseIntArray0.put(0x7F0D00B3, 30);  // layout:pay_bill_dialog_base
        sparseIntArray0.put(0x7F0D00B4, 0x1F);  // layout:pay_bill_dialog_header
        sparseIntArray0.put(0x7F0D00B5, 0x20);  // layout:pay_bill_invoice_dialog
        sparseIntArray0.put(0x7F0D00B6, 33);  // layout:pay_bill_invoice_item
        sparseIntArray0.put(0x7F0D00B7, 34);  // layout:pay_bill_promo_info
        sparseIntArray0.put(0x7F0D00B8, 35);  // layout:pay_bill_select_favorite
        sparseIntArray0.put(0x7F0D00B9, 36);  // layout:pay_bill_select_favorite_add_cta
        sparseIntArray0.put(0x7F0D00BA, 37);  // layout:pay_bill_select_favorite_item
        sparseIntArray0.put(0x7F0D00BB, 38);  // layout:pay_bill_with_invoices_dialog
        sparseIntArray0.put(0x7F0D00C2, 39);  // layout:personal_bill_addons_field
        sparseIntArray0.put(0x7F0D00C3, 40);  // layout:personal_bill_addons_field_selector_title
        sparseIntArray0.put(0x7F0D00C4, 41);  // layout:personal_bill_addons_field_with_toggle
        sparseIntArray0.put(0x7F0D00C5, 42);  // layout:personal_bill_addons_field_with_toggle_item
        sparseIntArray0.put(0x7F0D00C6, 43);  // layout:personal_bill_amount_field
        sparseIntArray0.put(0x7F0D00C7, 44);  // layout:personal_bill_favorite_text_field
        sparseIntArray0.put(0x7F0D00C8, 45);  // layout:personal_bill_fixed_amount_field
        sparseIntArray0.put(0x7F0D00C9, 46);  // layout:personal_bill_fixed_value_field
        sparseIntArray0.put(0x7F0D00CB, 0x2F);  // layout:personal_bill_multi_choice_field
        sparseIntArray0.put(0x7F0D00CC, 0x30);  // layout:personal_bill_pay_hint_text
        sparseIntArray0.put(0x7F0D00CD, 49);  // layout:personal_bill_text_field
        sparseIntArray0.put(0x7F0D00CE, 50);  // layout:pin_entry
        sparseIntArray0.put(0x7F0D00CF, 51);  // layout:pin_lock_screen
        sparseIntArray0.put(0x7F0D00E3, 52);  // layout:rebalance_receipt
        sparseIntArray0.put(0x7F0D00E5, 53);  // layout:retakable_photo
        sparseIntArray0.put(0x7F0D00E9, 54);  // layout:security_question_failed
        sparseIntArray0.put(0x7F0D00EA, 55);  // layout:security_question_form_base
        sparseIntArray0.put(0x7F0D00EB, 56);  // layout:security_question_form_field_dropdown
        sparseIntArray0.put(0x7F0D00EC, 57);  // layout:security_question_form_header
        sparseIntArray0.put(0x7F0D0105, 58);  // layout:verify_auth_code
    }

    @Override  // R1.b
    public final List a() {
        List list0 = new ArrayList(1);
        ((ArrayList)list0).add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return list0;
    }

    @Override  // R1.b
    public final g b(View view0, int v) {
        o0 o00;
        s s0;
        c c0;
        int v1 = DataBinderMapperImpl.a.get(v);
        if(v1 > 0) {
            Object object0 = view0.getTag();
            if(object0 != null) {
                switch((v1 - 1) / 50) {
                    case 0: {
                        switch(v1) {
                            case 1: {
                                if(!"layout/activity_license_photo_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for activity_license_photo is invalid. Received: " + object0);
                                }
                                Object[] arr_object = g.l(view0, 23, null, c.J);
                                AppCompatImageView appCompatImageView0 = (AppCompatImageView)arr_object[2];
                                AppCompatImageView appCompatImageView1 = (AppCompatImageView)arr_object[7];
                                ImageButton imageButton0 = (ImageButton)arr_object[6];
                                ImageButton imageButton1 = (ImageButton)arr_object[1];
                                ImageButton imageButton2 = (ImageButton)arr_object[5];
                                Button button0 = (Button)arr_object[4];
                                VerticalTextView verticalTextView0 = (VerticalTextView)arr_object[13];
                                View view1 = (View)arr_object[18];
                                LinearLayout linearLayout0 = (LinearLayout)arr_object[19];
                                AppCompatButton appCompatButton0 = (AppCompatButton)arr_object[22];
                                TextView textView0 = (TextView)arr_object[20];
                                ImageView imageView0 = (ImageView)arr_object[16];
                                RelativeLayout relativeLayout0 = (RelativeLayout)arr_object[17];
                                ConstraintLayout constraintLayout0 = (ConstraintLayout)arr_object[15];
                                Button button1 = (Button)arr_object[8];
                                ImageButton imageButton3 = (ImageButton)arr_object[3];
                                ConstraintLayout constraintLayout1 = (ConstraintLayout)arr_object[14];
                                ConstraintLayout constraintLayout2 = (ConstraintLayout)arr_object[10];
                                Button button2 = (Button)arr_object[9];
                                SurfaceView surfaceView0 = (SurfaceView)arr_object[12];
                                ConstraintLayout constraintLayout3 = (ConstraintLayout)arr_object[11];
                                AppCompatButton appCompatButton1 = (AppCompatButton)arr_object[21];
                                c0 = new c(null, view0, appCompatImageView0, appCompatImageView1, imageButton0, imageButton1, imageButton2, button0, button1, imageButton3, button2);  // initializer: Li9/a;-><init>(LR1/c;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/ImageButton;Landroid/widget/ImageButton;Landroid/widget/ImageButton;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/ImageButton;Landroid/widget/Button;)V
                                c0.I = -1L;
                                c0.q.setTag(null);
                                c0.r.setTag(null);
                                c0.s.setTag(null);
                                c0.t.setTag(null);
                                c0.u.setTag(null);
                                c0.v.setTag(null);
                                ((ConstraintLayout)arr_object[0]).setTag(null);
                                c0.w.setTag(null);
                                c0.x.setTag(null);
                                c0.y.setTag(null);
                                c0.s(view0);
                                c0.j();
                                return c0;
                            }
                            case 2: {
                                if(!"layout/activity_license_photo_portrait_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for activity_license_photo_portrait is invalid. Received: " + object0);
                                }
                                Object[] arr_object1 = g.l(view0, 23, null, e.J);
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView)arr_object1[2];
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView)arr_object1[7];
                                ImageButton imageButton4 = (ImageButton)arr_object1[6];
                                ImageButton imageButton5 = (ImageButton)arr_object1[1];
                                ImageButton imageButton6 = (ImageButton)arr_object1[5];
                                Button button3 = (Button)arr_object1[4];
                                TextView textView1 = (TextView)arr_object1[13];
                                View view2 = (View)arr_object1[18];
                                LinearLayout linearLayout1 = (LinearLayout)arr_object1[19];
                                AppCompatButton appCompatButton2 = (AppCompatButton)arr_object1[22];
                                TextView textView2 = (TextView)arr_object1[20];
                                ImageView imageView1 = (ImageView)arr_object1[16];
                                RelativeLayout relativeLayout1 = (RelativeLayout)arr_object1[17];
                                ConstraintLayout constraintLayout4 = (ConstraintLayout)arr_object1[15];
                                Button button4 = (Button)arr_object1[8];
                                ImageButton imageButton7 = (ImageButton)arr_object1[3];
                                ConstraintLayout constraintLayout5 = (ConstraintLayout)arr_object1[14];
                                ConstraintLayout constraintLayout6 = (ConstraintLayout)arr_object1[10];
                                Button button5 = (Button)arr_object1[9];
                                SurfaceView surfaceView1 = (SurfaceView)arr_object1[12];
                                ConstraintLayout constraintLayout7 = (ConstraintLayout)arr_object1[11];
                                AppCompatButton appCompatButton3 = (AppCompatButton)arr_object1[21];
                                c0 = new e(null, view0, appCompatImageView2, appCompatImageView3, imageButton4, imageButton5, imageButton6, button3, button4, imageButton7, button5);  // initializer: Li9/d;-><init>(LR1/c;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/ImageButton;Landroid/widget/ImageButton;Landroid/widget/ImageButton;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/ImageButton;Landroid/widget/Button;)V
                                c0.I = -1L;
                                c0.q.setTag(null);
                                c0.r.setTag(null);
                                c0.s.setTag(null);
                                c0.t.setTag(null);
                                c0.u.setTag(null);
                                c0.v.setTag(null);
                                ((ConstraintLayout)arr_object1[0]).setTag(null);
                                c0.w.setTag(null);
                                c0.x.setTag(null);
                                c0.y.setTag(null);
                                c0.s(view0);
                                ((e)c0).j();
                                return c0;
                            }
                            case 3: {
                                if(!"layout/activity_scan_qr_code_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for activity_scan_qr_code is invalid. Received: " + object0);
                                }
                                Object[] arr_object2 = g.l(view0, 10, null, h.x);
                                TextView textView3 = (TextView)arr_object2[9];
                                WaveBarcodeView waveBarcodeView0 = (WaveBarcodeView)arr_object2[3];
                                View view3 = (View)arr_object2[5];
                                Button button6 = (Button)arr_object2[1];
                                ImageButton imageButton8 = (ImageButton)arr_object2[2];
                                DynamicImageView dynamicImageView0 = (DynamicImageView)arr_object2[8];
                                View view4 = (View)arr_object2[6];
                                ConstraintLayout constraintLayout8 = (ConstraintLayout)arr_object2[0];
                                View view5 = (View)arr_object2[7];
                                View view6 = (View)arr_object2[4];
                                c0 = new h(null, view0, button6, imageButton8, constraintLayout8);  // initializer: Li9/f;-><init>(LR1/c;Landroid/view/View;Landroid/widget/Button;Landroid/widget/ImageButton;Landroidx/constraintlayout/widget/ConstraintLayout;)V
                                c0.w = -1L;
                                c0.q.setTag(null);
                                c0.r.setTag(null);
                                c0.s.setTag(null);
                                view0.setTag(0x7F0A0104, c0);  // id:dataBinding
                                ((h)c0).j();
                                return c0;
                            }
                            case 4: {
                                if(!"layout/activity_terms_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for activity_terms is invalid. Received: " + object0);
                                }
                                return new i(view0);
                            }
                            case 5: {
                                if(!"layout/agent_list_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for agent_list is invalid. Received: " + object0);
                                }
                                return new k(view0);
                            }
                            case 6: {
                                if(!"layout/agent_location_item_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for agent_location_item is invalid. Received: " + object0);
                                }
                                Object[] arr_object3 = g.l(view0, 5, null, null);
                                c0 = new ca.c(null, view0, ((TextView)arr_object3[1]), ((TextView)arr_object3[2]), ((TextView)arr_object3[4]), ((TextView)arr_object3[3]));
                                c0.s = -1L;
                                ((TextView)c0.r).setTag(null);
                                ((TextView)c0.t).setTag(null);
                                ((TextView)c0.u).setTag(null);
                                ((TextView)c0.v).setTag(null);
                                ((ConstraintLayout)arr_object3[0]).setTag(null);
                                c0.s(view0);
                                ((ca.c)c0).j();
                                return c0;
                            }
                            case 7: {
                                if(!"layout/announcement_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for announcement is invalid. Received: " + object0);
                                }
                                return new n(view0);
                            }
                            case 8: {
                                if(!"layout/announcement_audio_player_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for announcement_audio_player is invalid. Received: " + object0);
                                }
                                return new l(view0);
                            }
                            case 9: {
                                if(!"layout/announcement_detail_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for announcement_detail is invalid. Received: " + object0);
                                }
                                return new p(view0);
                            }
                            case 10: {
                                if(!"layout/bill_pay_2_confirmation_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for bill_pay_2_confirmation is invalid. Received: " + object0);
                                }
                                return new r(view0);
                            }
                            case 11: {
                                if(!"layout/bottom_sheet_dialog_stub_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for bottom_sheet_dialog_stub is invalid. Received: " + object0);
                                }
                                Object[] arr_object4 = g.l(view0, 1, null, null);
                                s0 = new s(null, view0, 0);  // initializer: LR1/g;-><init>(Ljava/lang/Object;Landroid/view/View;I)V
                                s0.q = -1L;
                                ((View)arr_object4[0]).setTag(null);
                                s0.s(view0);
                                s0.j();
                                return s0;
                            }
                            case 12: {
                                if(!"layout/confirm_p2p_overdraft_transfer_bottom_sheet_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for confirm_p2p_overdraft_transfer_bottom_sheet is invalid. Received: " + object0);
                                }
                                return new t(view0);
                            }
                            case 13: {
                                if(!"layout/confirm_p2p_transfer_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for confirm_p2p_transfer is invalid. Received: " + object0);
                                }
                                Object[] arr_object5 = g.l(view0, 9, null, u.w);
                                CurrencyAmountView currencyAmountView0 = (CurrencyAmountView)arr_object5[4];
                                TextView textView4 = (TextView)arr_object5[8];
                                CurrencyAmountView currencyAmountView1 = (CurrencyAmountView)arr_object5[3];
                                TextView textView5 = (TextView)arr_object5[7];
                                RelativeLayout relativeLayout2 = (RelativeLayout)arr_object5[5];
                                TextView textView6 = (TextView)arr_object5[6];
                                c0 = new u(null, view0, currencyAmountView0, currencyAmountView1, ((TextView)arr_object5[2]), ((TextView)arr_object5[1]));  // initializer: Lca/g;-><init>(LR1/c;Landroid/view/View;Lcom/sendwave/util/CurrencyAmountView;Lcom/sendwave/util/CurrencyAmountView;Landroid/widget/TextView;Landroid/widget/TextView;)V
                                c0.v = -1L;
                                ((CurrencyAmountView)c0.s).setTag(null);
                                ((CurrencyAmountView)c0.t).setTag(null);
                                ((LinearLayout)arr_object5[0]).setTag(null);
                                c0.q.setTag(null);
                                c0.r.setTag(null);
                                c0.s(view0);
                                ((u)c0).j();
                                return c0;
                            }
                            case 14: {
                                if(!"layout/confirm_p2p_transfer_bottom_sheet_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for confirm_p2p_transfer_bottom_sheet is invalid. Received: " + object0);
                                }
                                return new w(view0);
                            }
                            case 15: {
                                if(!"layout/dialog_confirm_pin_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for dialog_confirm_pin is invalid. Received: " + object0);
                                }
                                Object[] arr_object6 = g.l(view0, 2, null, y.t);
                                s0 = new y(null, view0, ((EditText)arr_object6[1]));  // initializer: Li9/x;-><init>(LR1/c;Landroid/view/View;Landroid/widget/EditText;)V
                                s0.s = -1L;
                                ((LinearLayout)arr_object6[0]).setTag(null);
                                s0.s(view0);
                                ((y)s0).j();
                                return s0;
                            }
                            case 16: {
                                if(!"layout/dialog_terms_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for dialog_terms is invalid. Received: " + object0);
                                }
                                return new z(view0);
                            }
                            case 17: {
                                if(!"layout/extra_security_challenge_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for extra_security_challenge is invalid. Received: " + object0);
                                }
                                return new D(view0);
                            }
                            case 18: {
                                if(!"layout/extra_security_challenge_base_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for extra_security_challenge_base is invalid. Received: " + object0);
                                }
                                Object[] arr_object7 = g.l(view0, 3, null, B.u);
                                s0 = new B(null, view0, ((FrameLayout)arr_object7[2]), ((SupportChannelsModalComposeView)arr_object7[1]));  // initializer: Li9/A;-><init>(LR1/c;Landroid/view/View;Landroid/widget/FrameLayout;Lcom/sendwave/util/supportChannels/SupportChannelsModalComposeView;)V
                                s0.t = -1L;
                                ((FrameLayout)arr_object7[0]).setTag(null);
                                s0.r.setTag(null);
                                s0.s(view0);
                                ((B)s0).j();
                                return s0;
                            }
                            case 19: {
                                if(!"layout/item_bound_view_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for item_bound_view is invalid. Received: " + object0);
                                }
                                Object[] arr_object8 = g.l(view0, 1, null, null);
                                s0 = new E(null, view0, 0, 0);
                                s0.s = -1L;
                                ((RelativeLayout)arr_object8[0]).setTag(null);
                                s0.s(view0);
                                ((E)s0).j();
                                return s0;
                            }
                            case 20: {
                                if(!"layout/item_confirm_bill_payment_field_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for item_confirm_bill_payment_field is invalid. Received: " + object0);
                                }
                                return new F(view0, 0);
                            }
                            case 21: {
                                if(!"layout/item_confirm_payment_sheet_field_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for item_confirm_payment_sheet_field is invalid. Received: " + object0);
                                }
                                return new F(view0, 1);
                            }
                            case 22: {
                                if(!"layout/item_empty_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for item_empty is invalid. Received: " + object0);
                                }
                                Object[] arr_object9 = g.l(view0, 1, null, null);
                                s0 = new E(null, view0, 0, 1);
                                s0.s = -1L;
                                ((LinearLayout)arr_object9[0]).setTag(null);
                                s0.s(view0);
                                ((E)s0).j();
                                return s0;
                            }
                            case 23: {
                                if(!"layout/item_loading_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for item_loading is invalid. Received: " + object0);
                                }
                                return new f(view0, 3);
                            }
                            case 24: {
                                if(!"layout/item_loading_only_spinner_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for item_loading_only_spinner is invalid. Received: " + object0);
                                }
                                Object[] arr_object10 = g.l(view0, 2, null, G.r);
                                ProgressBar progressBar0 = (ProgressBar)arr_object10[1];
                                s0 = new G(null, view0, 0);  // initializer: LR1/g;-><init>(Ljava/lang/Object;Landroid/view/View;I)V
                                s0.q = -1L;
                                ((LinearLayout)arr_object10[0]).setTag(null);
                                s0.s(view0);
                                ((G)s0).j();
                                return s0;
                            }
                            case 25: {
                                if(!"layout/lock_screen_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for lock_screen is invalid. Received: " + object0);
                                }
                                return new L(view0);
                            }
                            case 26: {
                                if(!"layout/login_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for login is invalid. Received: " + object0);
                                }
                                return new N(view0);
                            }
                            case 27: {
                                if(!"layout/pay_bill_add_favorite_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pay_bill_add_favorite is invalid. Received: " + object0);
                                }
                                return new P(view0);
                            }
                            case 28: {
                                if(!"layout/pay_bill_balance_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pay_bill_balance is invalid. Received: " + object0);
                                }
                                return new Q(view0, 0);
                            }
                            case 29: {
                                if(!"layout/pay_bill_dialog_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pay_bill_dialog is invalid. Received: " + object0);
                                }
                                Object[] arr_object11 = g.l(view0, 2, V.v, null);
                                s0 = new V(null, view0, ((S)arr_object11[1]), ((ConstraintLayout)arr_object11[0]));  // initializer: Li9/U;-><init>(LR1/c;Landroid/view/View;Li9/S;Landroidx/constraintlayout/widget/ConstraintLayout;)V
                                s0.u = -1L;
                                S s1 = s0.q;
                                if(s1 != null) {
                                    s1.i = s0;
                                }
                                s0.r.setTag(null);
                                view0.setTag(0x7F0A0104, s0);  // id:dataBinding
                                ((V)s0).j();
                                return s0;
                            }
                            case 30: {
                                if(!"layout/pay_bill_dialog_base_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pay_bill_dialog_base is invalid. Received: " + object0);
                                }
                                return new T(new View[]{view0});
                            }
                            case 0x1F: {
                                if(!"layout/pay_bill_dialog_header_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pay_bill_dialog_header is invalid. Received: " + object0);
                                }
                                Object[] arr_object12 = g.l(view0, 3, null, null);
                                f f0 = new f(null, view0, ((ConstraintLayout)arr_object12[0]), ((ImageView)arr_object12[1]), ((TextView)arr_object12[2]), 4);
                                f0.s = -1L;
                                ((ConstraintLayout)f0.t).setTag(null);
                                ((ImageView)f0.u).setTag(null);
                                ((TextView)f0.r).setTag(null);
                                view0.setTag(0x7F0A0104, f0);  // id:dataBinding
                                f0.j();
                                return f0;
                            }
                            case 0x20: {
                                if(!"layout/pay_bill_invoice_dialog_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pay_bill_invoice_dialog is invalid. Received: " + object0);
                                }
                                Object[] arr_object13 = g.l(view0, 2, X.w, null);
                                s0 = new X(null, view0, ((S)arr_object13[1]), ((ConstraintLayout)arr_object13[0]));  // initializer: Li9/W;-><init>(LR1/c;Landroid/view/View;Li9/S;Landroidx/constraintlayout/widget/ConstraintLayout;)V
                                s0.v = -1L;
                                S s2 = s0.q;
                                if(s2 != null) {
                                    s2.i = s0;
                                }
                                s0.r.setTag(null);
                                view0.setTag(0x7F0A0104, s0);  // id:dataBinding
                                ((X)s0).j();
                                return s0;
                            }
                            case 33: {
                                if(!"layout/pay_bill_invoice_item_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pay_bill_invoice_item is invalid. Received: " + object0);
                                }
                                return new ca.N(view0, 1);
                            }
                            case 34: {
                                if(!"layout/pay_bill_promo_info_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pay_bill_promo_info is invalid. Received: " + object0);
                                }
                                return new Q(view0, 1);
                            }
                            case 35: {
                                if(!"layout/pay_bill_select_favorite_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pay_bill_select_favorite is invalid. Received: " + object0);
                                }
                                return new Z(view0);
                            }
                            case 36: {
                                if(!"layout/pay_bill_select_favorite_add_cta_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pay_bill_select_favorite_add_cta is invalid. Received: " + object0);
                                }
                                return new ca.t(view0, 1);
                            }
                            case 37: {
                                if(!"layout/pay_bill_select_favorite_item_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pay_bill_select_favorite_item is invalid. Received: " + object0);
                                }
                                return new b0(view0);
                            }
                            case 38: {
                                if(!"layout/pay_bill_with_invoices_dialog_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pay_bill_with_invoices_dialog is invalid. Received: " + object0);
                                }
                                Object[] arr_object14 = g.l(view0, 2, d0.v, null);
                                s0 = new d0(null, view0, ((S)arr_object14[1]), ((ConstraintLayout)arr_object14[0]));  // initializer: Li9/c0;-><init>(LR1/c;Landroid/view/View;Li9/S;Landroidx/constraintlayout/widget/ConstraintLayout;)V
                                s0.u = -1L;
                                S s3 = s0.q;
                                if(s3 != null) {
                                    s3.i = s0;
                                }
                                s0.r.setTag(null);
                                view0.setTag(0x7F0A0104, s0);  // id:dataBinding
                                ((d0)s0).j();
                                return s0;
                            }
                            case 39: {
                                if(!"layout/personal_bill_addons_field_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for personal_bill_addons_field is invalid. Received: " + object0);
                                }
                                return new f(view0, 5);
                            }
                            case 40: {
                                if(!"layout/personal_bill_addons_field_selector_title_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for personal_bill_addons_field_selector_title is invalid. Received: " + object0);
                                }
                                Object[] arr_object15 = g.l(view0, 3, null, e0.t);
                                TextView textView7 = (TextView)arr_object15[2];
                                s0 = new e0(null, view0, ((TextView)arr_object15[1]));  // initializer: LL9/m;-><init>(LR1/c;Landroid/view/View;Landroid/widget/TextView;)V
                                s0.s = -1L;
                                ((LinearLayout)arr_object15[0]).setTag(null);
                                ((TextView)s0.q).setTag(null);
                                s0.s(view0);
                                ((e0)s0).j();
                                return s0;
                            }
                            case 41: {
                                if(!"layout/personal_bill_addons_field_with_toggle_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for personal_bill_addons_field_with_toggle is invalid. Received: " + object0);
                                }
                                return new h0(view0);
                            }
                            case 42: {
                                if(!"layout/personal_bill_addons_field_with_toggle_item_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for personal_bill_addons_field_with_toggle_item is invalid. Received: " + object0);
                                }
                                Object[] arr_object16 = g.l(view0, 2, null, null);
                                s0 = new f(null, view0, ((CheckBox)arr_object16[1]), 6);
                                s0.s = -1L;
                                ((CheckBox)s0.t).setTag(null);
                                ((LinearLayout)arr_object16[0]).setTag(null);
                                s0.s(view0);
                                ((f)s0).j();
                                return s0;
                            }
                            case 43: {
                                if(!"layout/personal_bill_amount_field_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for personal_bill_amount_field is invalid. Received: " + object0);
                                }
                                return new ca.c(view0, 2);
                            }
                            case 44: {
                                if(!"layout/personal_bill_favorite_text_field_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for personal_bill_favorite_text_field is invalid. Received: " + object0);
                                }
                                return new ca.c(view0, 3);
                            }
                            case 45: {
                                if(!"layout/personal_bill_fixed_amount_field_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for personal_bill_fixed_amount_field is invalid. Received: " + object0);
                                }
                                return new j0(view0);
                            }
                            case 46: {
                                if(!"layout/personal_bill_fixed_value_field_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for personal_bill_fixed_value_field is invalid. Received: " + object0);
                                }
                                return new ca.t(view0, 2);
                            }
                            case 0x2F: {
                                if(!"layout/personal_bill_multi_choice_field_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for personal_bill_multi_choice_field is invalid. Received: " + object0);
                                }
                                return new f(view0, 7);
                            }
                            case 0x30: {
                                if(!"layout/personal_bill_pay_hint_text_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for personal_bill_pay_hint_text is invalid. Received: " + object0);
                                }
                                s0 = new k0(null, view0, ((TextView)g.l(view0, 1, null, null)[0]));
                                s0.s = -1L;
                                s0.q.setTag(null);
                                view0.setTag(0x7F0A0104, s0);  // id:dataBinding
                                ((k0)s0).j();
                                return s0;
                            }
                            case 49: {
                                if(!"layout/personal_bill_text_field_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for personal_bill_text_field is invalid. Received: " + object0);
                                }
                                return new ca.c(view0, 4);
                            }
                            case 50: {
                                if(!"layout/pin_entry_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pin_entry is invalid. Received: " + object0);
                                }
                                return new m0(view0);
                            }
                            default: {
                                return null;
                            }
                        }
                    }
                    case 1: {
                        switch(v1) {
                            case 51: {
                                if(!"layout/pin_lock_screen_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for pin_lock_screen is invalid. Received: " + object0);
                                }
                                return new n0(view0);
                            }
                            case 52: {
                                if(!"layout/rebalance_receipt_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for rebalance_receipt is invalid. Received: " + object0);
                                }
                                Object[] arr_object17 = g.l(view0, 4, null, o0.t);
                                Button button7 = (Button)arr_object17[1];
                                EditText editText0 = (EditText)arr_object17[3];
                                LinearLayout linearLayout2 = (LinearLayout)arr_object17[0];
                                WebView webView0 = (WebView)arr_object17[2];
                                o00 = new o0(null, view0, 0);  // initializer: LR1/g;-><init>(Ljava/lang/Object;Landroid/view/View;I)V
                                o00.q = button7;
                                o00.r = linearLayout2;
                                o00.s = -1L;
                                ((Button)o00.q).setTag(null);
                                ((LinearLayout)o00.r).setTag(null);
                                view0.setTag(0x7F0A0104, o00);  // id:dataBinding
                                o00.j();
                                return o00;
                            }
                            case 53: {
                                if(!"layout/retakable_photo_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for retakable_photo is invalid. Received: " + object0);
                                }
                                return new ca.c(view0, 5);
                            }
                            case 54: {
                                if(!"layout/security_question_failed_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for security_question_failed is invalid. Received: " + object0);
                                }
                                return new q0(view0);
                            }
                            case 55: {
                                if(!"layout/security_question_form_base_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for security_question_form_base is invalid. Received: " + object0);
                                }
                                return new s0(view0);
                            }
                            case 56: {
                                if(!"layout/security_question_form_field_dropdown_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for security_question_form_field_dropdown is invalid. Received: " + object0);
                                }
                                return new ca.s(view0, 1);
                            }
                            case 57: {
                                if(!"layout/security_question_form_header_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for security_question_form_header is invalid. Received: " + object0);
                                }
                                Object[] arr_object18 = g.l(view0, 3, null, null);
                                o00 = new ca.t(null, view0, ((AppCompatImageView)arr_object18[1]), ((TextView)arr_object18[2]));
                                o00.r = -1L;
                                ((AppCompatImageView)o00.t).setTag(null);
                                ((ConstraintLayout)arr_object18[0]).setTag(null);
                                ((TextView)o00.s).setTag(null);
                                o00.s(view0);
                                ((ca.t)o00).j();
                                return o00;
                            }
                            case 58: {
                                if(!"layout/verify_auth_code_0".equals(object0)) {
                                    throw new IllegalArgumentException("The tag for verify_auth_code is invalid. Received: " + object0);
                                }
                                return new u0(view0);
                            }
                            default: {
                                return null;
                            }
                        }
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
        int v1 = DataBinderMapperImpl.a.get(v);
        if(v1 > 0) {
            Object object0 = arr_view[0].getTag();
            if(object0 == null) {
                throw new RuntimeException("view must have a tag");
            }
            if(v1 == 30) {
                if(!"layout/pay_bill_dialog_base_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for pay_bill_dialog_base is invalid. Received: " + object0);
                }
                return new T(arr_view);
            }
        }
        return null;
    }
}

