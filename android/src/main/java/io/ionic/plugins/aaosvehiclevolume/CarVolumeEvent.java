package io.ionic.plugins.aaosvehiclevolume;



import io.ionic.plugins.aaosdatautils.dataevent.DataValueEvent;

public class CarVolumeEvent extends DataValueEvent {

    enum Name{
        CHANGE_MASTERMUTE,
        CHANGE_GROUPVOLUME,
        CHANGE_GROUPMUTE
    }

    CarVolumeEvent(CarVolumeEvent.Name eventName,int zoneId, int flags) {
        super(eventName.ordinal());
        this.putData("zoneId",zoneId);
        this.putData("flags",flags);
    }
}
