package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

import com.scottyab.rootbeer.RootBeer;

public class VerifyDeviceRootModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public VerifyDeviceRootModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "VerifyDeviceRoot";
    }

    @ReactMethod
    public void isRooted(Promise promise) {
        RootBeer rootBeer = new RootBeer(reactContext);

        promise.resolve(rootBeer.isRooted());
    }

    @ReactMethod
    public void isRootedWithBusyBoxCheck(Promise promise) {
        RootBeer rootBeer = new RootBeer(reactContext);

        promise.resolve(rootBeer.isRootedWithBusyBoxCheck());
    }
}
