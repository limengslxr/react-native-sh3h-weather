package com.sh3h.weather.manager;

import android.app.Activity;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

import heweather.com.weathernetsdk.view.SuspendView;

public class SuspendViewManager extends ViewGroupManager<SuspendView> {

    @NonNull
    @Override
    public String getName() {
        return "SuspendView";
    }

    @NonNull
    @Override
    protected SuspendView createViewInstance(@NonNull ThemedReactContext reactContext) {
        Activity activity = reactContext.getCurrentActivity();
        assert activity != null;
        SuspendView suspendView = new SuspendView(activity);
        return suspendView;
    }

//    @ReactProp(name="show")
//    public void show(SuspendView suspendView) {
//        suspendView.show();
//    }

}
