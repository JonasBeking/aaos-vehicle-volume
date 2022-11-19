package io.ionic.plugins.aaosvehiclevolume;


import com.getcapacitor.annotation.CapacitorPlugin;

import io.ionic.plugins.aaosdatautils.DataPlugin;
import io.ionic.plugins.aaosdatautils.dataerror.DataErrorHandler;

@CapacitorPlugin(name = "VehicleVolumePlugin")
public class CarVolumePlugin extends DataPlugin<CarVolumeCallback> {

    @Override
    public void load() {
        super.load();
        this.dataViewManager = new CarVolumeViewManager(super.getContext());
        this.dataErrorHandler = new DataErrorHandler();
    }

}
