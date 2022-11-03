import { registerPlugin } from '@capacitor/core';

import type { VehicleVolumePluginPlugin } from './definitions';

const VehicleVolumePlugin = registerPlugin<VehicleVolumePluginPlugin>('VehicleVolumePlugin', {
  web: () => import('./web').then(m => new m.VehicleVolumePluginWeb()),
});

export * from './definitions';
export { VehicleVolumePlugin };
