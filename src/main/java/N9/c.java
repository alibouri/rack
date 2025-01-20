package n9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.sendwave.util.Country;
import java.util.List;
import q9.M0;

public final class c extends BaseAdapter {
    public List X;
    public Context Y;
    public LayoutInflater Z;
    public String b0;
    public boolean c0;

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.X.size();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.X.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = this.Z.inflate(0x7F0D005F, viewGroup0, false);  // layout:item_country
        }
        TextView textView0 = (TextView)view0.findViewById(0x7F0A01FE);  // id:name
        TextView textView1 = (TextView)view0.findViewById(0x7F0A00FE);  // id:countrycode
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0A0156);  // id:flag
        RadioButton radioButton0 = (RadioButton)view0.findViewById(0x7F0A025B);  // id:radiobutton
        Country country0 = (Country)this.X.get(v);
        textView0.setText(country0.X);
        if(this.c0) {
            textView1.setText(country0.c0);
            textView1.setVisibility(0);
        }
        else {
            textView1.setVisibility(8);
        }
        imageView0.setImageDrawable(M0.e(country0, this.Y));
        radioButton0.setChecked(country0.Y.equals(this.b0.toLowerCase()));
        return view0;
    }
}

