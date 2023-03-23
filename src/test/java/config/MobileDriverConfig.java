package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${deviceHost}.properties"})
public interface MobileDriverConfig extends Config {
    @Key("deviceName")
    String deviceName();

    @Key("platformVersion")
    String platformVersion();

    @Key("project")
    String project();

    @Key("build")
    String build();

    @Key("name")
    String name();

    @Key("browserstack.user")
    String user();

    @Key("browserstack.key")
    String key();

    @Key("app")
    String app();

    @Key("deviceUrl")
    String deviceUrl();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();
}
