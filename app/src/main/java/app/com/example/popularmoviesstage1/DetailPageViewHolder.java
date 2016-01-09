package app.com.example.popularmoviesstage1;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TabHost;
import android.widget.TextView;

/**
 * Created by Shimona on 10/29/2015.
 */
public  class DetailPageViewHolder {
    /**
     * Cache of the children views for a forecast list item.
     */

        public final ImageView iconView;

        public final TextView releaseDateView;
        public final TextView overviewView;
        public final TextView voteCountView;
    public final TextView ratingView;

    public final RatingBar favView;
        public DetailPageViewHolder(View view) {
            iconView = (ImageView) view.findViewById(R.id.img_thumbnail);
            favView = (RatingBar) view.findViewById(R.id.favBtn);


            releaseDateView = (TextView) view.findViewById(R.id.release_date);
            overviewView = (TextView) view.findViewById(R.id.overview);
            voteCountView = (TextView) view.findViewById(R.id.vote_count);
            ratingView = (TextView) view.findViewById(R.id.ratingBarId);

        }
    }
