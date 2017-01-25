package com.example.teo.broadcast;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;

/**
 * Created by Teo on 25/01/2017.
 */

public class Receptor extends BroadcastReceiver {
    private final String CambioBluetooth="android.net.conn.CONNECTIVITY_CHANGE";

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals(CambioBluetooth)){
            NotificationCompat.Builder constructorNotificaciones = new
                    NotificationCompat.Builder(context);

            constructorNotificaciones.setSmallIcon(R.mipmap.ic_launcher);
            constructorNotificaciones.setContentTitle(context.getString(R.string.TituloNotificacion));
            constructorNotificaciones.setContentText(context.getString(R.string.TextoNotificacion));


            NotificationManager GestorNotificaciones = (NotificationManager)
                    context.getSystemService(Context.NOTIFICATION_SERVICE);
            GestorNotificaciones.notify(1,constructorNotificaciones.build());


        }

    }
}
