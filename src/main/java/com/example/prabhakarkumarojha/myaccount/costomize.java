package com.example.prabhakarkumarojha.myaccount;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class costomize extends ArrayAdapter {
    private Activity context;
    private String[] tname;
    Integer[] imgid;
    Integer[] imgid2;

    public costomize(Activity context, String[] tname, Integer[] imgid2, Integer[] imgid) {
        super(context, R.layout.costomize, tname);

        this.context = context;
        this.tname = tname;
        this.imgid2 = imgid2;
        this.imgid = imgid;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        Viewholder viewholder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.costomize, null, true);
            viewholder = new Viewholder(r);
            r.setTag(viewholder);
        } else {
            viewholder = (Viewholder) r.getTag();

        }
        viewholder.imageView3.setImageResource(imgid[position]);
        viewholder.tv1.setText(tname[position]);
        viewholder.Iv2.setImageResource(imgid2[position]);

        return r;
    }

    class Viewholder {
        TextView tv1;
        ImageView Iv2;
        ImageView imageView3;

        Viewholder(View v) {
            tv1 = (TextView) v.findViewById(R.id.textView1);
            Iv2 = (ImageView) v.findViewById(R.id.imageView2);
            imageView3 = (ImageView) v.findViewById(R.id.imageView);


        }

    }
}
