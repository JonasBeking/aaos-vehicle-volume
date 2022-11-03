import { WebPlugin } from '@capacitor/core';

import type { VehicleVolumePluginPlugin } from './definitions';

export class VehicleVolumePluginWeb extends WebPlugin implements VehicleVolumePluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
