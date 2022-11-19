package io.ionic.plugins.aaosvehiclevolume;

import android.car.Car;
import android.car.media.CarAudioManager;
import android.content.Context;

import com.getcapacitor.Bridge;
import com.getcapacitor.PluginCall;

import io.ionic.plugins.aaosdatautils.dataview.DataView;
import io.ionic.plugins.aaosdatautils.dataview.DataViewManager;

public class CarVolumeViewManager extends DataViewManager<CarVolumeCallback> {

    private final CarAudioManager carAudioManager;

    public CarVolumeViewManager(Context context) {
        Car car = Car.createCar(context);
        this.dataCallbackBuilder = new CarVolumeCallback.Builder();
        this.carAudioManager = (CarAudioManager) car.getCarManager(Car.AUDIO_SERVICE);
    }

    @Override
    public DataView<CarVolumeCallback> generate(PluginCall pluginCall, Integer dataId, String addressableName, Boolean isActive) {
        DataView<CarVolumeCallback> carAudioDataView = super.generate(pluginCall,dataId,addressableName,isActive);
        carAudioManager.registerCarVolumeCallback(carAudioDataView.getCallback());
        return carAudioDataView;
    }

    @Override
    public DataView<CarVolumeCallback> remove(String addressableName, Bridge bridge) {
        DataView<CarVolumeCallback> dataView = super.remove(addressableName, bridge);
        carAudioManager.unregisterCarVolumeCallback(dataView.getCallback());
        return dataView;
    }
}
