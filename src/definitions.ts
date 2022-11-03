export interface VehicleVolumePluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
