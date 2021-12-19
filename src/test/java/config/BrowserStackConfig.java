package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${deviceHost}.properties"})
public interface BrowserStackConfig extends Config {

    @Key("url")
    String url();

    @Key("session")
    String session();

    @Key("user")
    String name();

    @Key("key")
    String key();

    @Key("app")
    String app();

    @Key("device")
    String device();

    @Key("ver")
    String ver();
}