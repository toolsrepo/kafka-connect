package com.nathd.kafka.connect.sink;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigDef.Importance;
import org.apache.kafka.common.config.ConfigDef.Type;

import java.util.Map;


public class MySinkConnectorConfig extends AbstractConfig {

    public static final String MY_SETTING_CONFIG = "my.setting";
    private static final String MY_SETTING_DOC = "This is a setting important to my connector.";

    public final String mySetting;

    public MySinkConnectorConfig(Map<?, ?> originals) {
        super(config(), originals);
        this.mySetting = this.getString(MY_SETTING_CONFIG);
    }

    public static ConfigDef config() {
        return new ConfigDef()
                .define(MY_SETTING_CONFIG, Type.STRING, Importance.HIGH, MY_SETTING_DOC);
    }
}
