package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:hardware.properties"})
public interface HardwareConfig extends Config {

    @Key("url")
    String url();

    @Key("device")
    String device();

    @Key("ver")
    String ver();
}
