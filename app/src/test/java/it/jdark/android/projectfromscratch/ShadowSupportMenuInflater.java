package it.jdark.android.projectfromscratch;

import android.support.v7.internal.view.SupportMenuInflater;
import android.view.Menu;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.shadows.ShadowMenuInflater;

/**
 * Created by jdark on 13/03/15.
 */
@Implements(SupportMenuInflater.class)
public class ShadowSupportMenuInflater extends ShadowMenuInflater {
    @Implementation
    public void inflate(int menuRes, Menu menu) {
        super.inflate(menuRes, menu);
    }
}
