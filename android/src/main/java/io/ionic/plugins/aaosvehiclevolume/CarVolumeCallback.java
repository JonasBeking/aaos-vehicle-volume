package io.ionic.plugins.aaosvehiclevolume;

import android.car.media.CarAudioManager;

import io.ionic.plugins.aaosdatautils.datacallback.DataCallback;
import io.ionic.plugins.aaosdatautils.datacallback.DataCallbackBuilder;
import io.ionic.plugins.aaosdatautils.dataview.DataView;


public class CarVolumeCallback extends CarAudioManager.CarVolumeCallback implements DataCallback<CarVolumeCallback> {
    DataView<CarVolumeCallback> dataView;
    private final String TAG = "CarVolumeEventCallback";

    CarVolumeCallback(DataView<CarVolumeCallback> dataView) {
        this.dataView = dataView;
    }

    @Override
    public DataView<CarVolumeCallback> getDataView() {
        return this.dataView;
    }

    @Override
    public void onMasterMuteChanged(int zoneId, int flags) {
        CarVolumeEvent carVolumeEvent = new CarVolumeEvent(CarVolumeEvent.Name.CHANGE_MASTERMUTE,zoneId,flags);
        passDataToView(carVolumeEvent);
    }

    @Override
    public void onGroupVolumeChanged(int zoneId, int groupId, int flags) {
        CarVolumeEvent carVolumeEvent = new CarVolumeEvent(CarVolumeEvent.Name.CHANGE_GROUPVOLUME,zoneId,flags);
        carVolumeEvent.putData("groupId",groupId);
        passDataToView(carVolumeEvent);
    }

    @Override
    public void onGroupMuteChanged(int zoneId, int groupId, int flags) {
        CarVolumeEvent carVolumeEvent = new CarVolumeEvent(CarVolumeEvent.Name.CHANGE_GROUPMUTE,zoneId,flags);
        carVolumeEvent.putData("groupId",groupId);
        passDataToView(carVolumeEvent);
    }

    public static class Builder implements DataCallbackBuilder<CarVolumeCallback> {
        @Override
        public CarVolumeCallback build(DataView<CarVolumeCallback> dataView) {
            return new CarVolumeCallback(dataView);
        }
    }
}
