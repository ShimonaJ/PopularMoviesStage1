package app.com.example.popularmoviesstage1.service;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import app.com.example.popularmoviesstage1.Utility;
import app.com.example.popularmoviesstage1.data.MovieContract;

/**
 * Created by Shimona on 12/29/2015.
 */
public class FetchMovieService extends IntentService {
    private final String LOG_TAG = FetchMovieService.class.getSimpleName();
    public static String MOVIE_QUERY_EXTRA = "MovieQueryExtra";
    public FetchMovieService() {
        super("FetchMovie");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String sortCriteria = intent.getStringExtra(MOVIE_QUERY_EXTRA);




    }

    public static class MovieAlarmReceiver extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            Intent sendintent = new Intent(context,FetchMovieService.class);
            sendintent.putExtra(MOVIE_QUERY_EXTRA,intent.getStringExtra(MOVIE_QUERY_EXTRA));
            context.startService(sendintent);
        }
    }

}
