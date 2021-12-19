package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${deviceHost}.properties"})
public interface HardwareConfig extends Config {

    @Key("url")
    String url();

    @Key("device")
    String device();

    @Key("ver")
    String ver();
}
