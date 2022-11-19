import {VehicleDataEvent, VehicleDataService} from "@capacitor-community/aaos-data-utils";

export interface VehicleVolumeEvent extends VehicleDataEvent{
  data : {
    zoneId : number,
    flags : number,
    groupId? : number
  }
}

/**
 * Vehicle Volume plugin interface
 * @extends VehicleDataService
 */
export interface VehicleVolumePluginInterface extends VehicleDataService<VehicleVolumeEvent>{
  /**
   * Was soll das denn
   */
}
