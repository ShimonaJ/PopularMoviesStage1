package app.com.example.popularmoviesstage1.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.List;

import app.com.example.popularmoviesstage1.R;

/**
 * Created by Shimona on 10/14/2015.
 */
public class ListAdapter extends ArrayAdapter<Movie> {

    public ListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public ListAdapter(Context context, int resource, List<Movie> items) {
        super(context, resource, items);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.list_item, null);
        }

        Movie p = getItem(position);

        if (p != null) {
          //  TextView tt1 = (TextView) v.findViewById(R.id.list_text_id);
            ImageView tt2 = (ImageView) v.findViewById(R.id.list_image_id);
           // TextView tt3 = (TextView) v.findViewById(R.id.description);

//            if (tt1 != null) {
//                tt1.setText(p.getTitle());
//            }

            if (tt2 != null) {

                Uri uri =Uri.parse("http://image.tmdb.org/t/p/w185/" + p.getPoster_path() + "");
                Picasso.with(getContext()).load(uri).into(tt2);

//                try {
//
//                }catch(Exception e){
//                    String root = Environment.getExternalStorageDirectory().toString();
//                    File f = new File(root + "/saved_images/"+p.getPoster_path());
//
//                    Bitmap bmp = BitmapFactory.decodeFile(f.getAbsolutePath());
//                    tt2.setImageBitmap(bmp);
//                }
               // tt2.setImageURI(Uri.parse("http://image.tmdb.org/t/p/w92//nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg"));

            }


        }

        return v;
    }

}
