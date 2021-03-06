package com.liuyk.horizontalnavigationbar;

import java.io.Serializable;

/**
 * 频道实体类
 * <p>
 * @author liuyk
 */
public class Channel implements Serializable {
    private static final long serialVersionUID = -7415501530039818852L;
    private String channelName;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
