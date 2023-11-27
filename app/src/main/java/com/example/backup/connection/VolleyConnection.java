package com.example.backup.connection;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;

public class VolleyConnection {
    private static VolleyConnection connection;
    private RequestQueue requestQueue;
    private static Context ctx;

    private VolleyConnection (Context context) {
        ctx = context;

    }

    private RequestQueue getRequestQueue () {
        if (requestQueue == null){
            requestQueue = com.android.volley.toolbox.Volley.newRequestQueue(ctx.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized VolleyConnection getInstance(Context context){
        if (connection == null){
            connection = new VolleyConnection(context);
        }
        return connection;
    }

    public<T> void addToRequestQue(Request<T> request){
        getRequestQueue().add(request);
    }
}
