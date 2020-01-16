
package com.sh3h.weather;

import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.HashMap;
import java.util.Map;

import heweather.com.weathernetsdk.view.HeContent;
import heweather.com.weathernetsdk.view.HeWeatherConfig;

public class RNSh3hWeatherModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private static final String TYPE_HORIZONTAL = "horizontal";
  private static final String TYPE_VERTICAL = "vertical";
  private static final String TYPE_SQUARE = "square";
  private static final String GRAVITY_CENTER = "center";
  private static final String GRAVITY_LEFT = "left";
  private static final String GRAVITY_RIGHT = "right";

  public RNSh3hWeatherModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    HeWeatherConfig.init("rSv9eAovIJ", "");
  }

  @Override
  public String getName() {
    return "RNSh3hWeather";
  }


  @Nullable
  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put(TYPE_HORIZONTAL, TYPE_HORIZONTAL);
    constants.put(TYPE_VERTICAL, TYPE_VERTICAL);
    constants.put(TYPE_SQUARE, TYPE_SQUARE);
    constants.put(GRAVITY_CENTER, GRAVITY_CENTER);
    constants.put(GRAVITY_LEFT, GRAVITY_LEFT);
    constants.put(GRAVITY_RIGHT, GRAVITY_RIGHT);
    return constants;
  }

}