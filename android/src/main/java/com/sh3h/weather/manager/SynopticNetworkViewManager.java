package com.sh3h.weather.manager;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

import java.util.Map;

import heweather.com.weathernetsdk.view.SynopticNetworkCustomView;

public class SynopticNetworkViewManager extends ViewGroupManager<SynopticNetworkCustomView> {
    public static final int SHOW = 1;

    @NonNull
    @Override
    public String getName() {
        return "SynopticNetworkView";
    }

    @NonNull
    @Override
    protected SynopticNetworkCustomView createViewInstance(@NonNull ThemedReactContext reactContext) {
        Activity activity = reactContext.getCurrentActivity();
        return new SynopticNetworkCustomView(activity);
    }

    @ReactProp(name = "gravity")
    public void setGravity(SynopticNetworkCustomView synopticNetworkCustomView, String gravity) {
        synopticNetworkCustomView.setViewGravity(gravity);
    }

    @ReactProp(name = "type")
    public void setType(SynopticNetworkCustomView synopticNetworkCustomView, String type) {
        synopticNetworkCustomView.setViewType(type);
    }

//    @ReactProp(name = "padding")
//    public void setPadding(SynopticNetworkCustomView synopticNetworkCustomView, int left, int top, int right, int bottom) {
//        synopticNetworkCustomView.setViewPadding(left, top, right, bottom);
//    }

    @ReactProp(name = "textColor")
    public void setTextColor(SynopticNetworkCustomView synopticNetworkCustomView, int color) {
        synopticNetworkCustomView.setViewTextColor(color);
    }

    @Nullable
    @Override
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.of("show", SHOW);
    }

    @Override
    public void receiveCommand(@NonNull SynopticNetworkCustomView root, int commandId, @Nullable ReadableArray args) {
        super.receiveCommand(root, commandId, args);
        System.out.println("receiveCommand");
        if (SHOW == commandId) {
            root.show();
        }
    }

}
