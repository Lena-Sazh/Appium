package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${deviceHost}.properties"})
public interface SelenoidConfig extends Config {

    @Key("url")
    String url();

    @Key("user")
    String user();

    @Key("pass")
    String pass();
}
