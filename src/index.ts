import { registerPlugin } from '@capacitor/core';
import {VehicleVolumeEvent, VehicleVolumePluginInterface} from "./definitions";
import {VehicleDataProxy} from "@capacitor-community/aaos-data-utils";

const VehicleVolumeService = registerPlugin<VehicleVolumePluginInterface>('CarAudioService')

/**
 * Used for breaking up packed function arguments, automotic and central logging for calls and maybe central error handling
 */
export class VehicleVolumePlugin extends VehicleDataProxy<VehicleVolumeEvent>{
  constructor() {
    super(VehicleVolumeService);
  }
}

export * from './definitions';

