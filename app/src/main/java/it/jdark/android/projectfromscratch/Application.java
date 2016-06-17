package it.jdark.android.projectfromscratch;

import com.frogermcs.androiddevmetrics.AndroidDevMetrics;

/**
 * Created on 17/06/16.
 *
 * @Autor jDark
 */

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidDevMetrics.initWith(this);

    }
}
