
package me.skreem.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Provider {

    @SerializedName("steamid")
    @Expose
    private String steamid;
    @SerializedName("appid")
    @Expose
    private Integer appid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;

    /**
     * 
     * @return
     *     The steamid
     */
    public String getSteamid() {
        return steamid;
    }

    /**
     * 
     * @param steamid
     *     The steamid
     */
    public void setSteamid(String steamid) {
        this.steamid = steamid;
    }

    public Provider withSteamid(String steamid) {
        this.steamid = steamid;
        return this;
    }

    /**
     * 
     * @return
     *     The appid
     */
    public Integer getAppid() {
        return appid;
    }

    /**
     * 
     * @param appid
     *     The appid
     */
    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public Provider withAppid(Integer appid) {
        this.appid = appid;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Provider withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    public Provider withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Provider withTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
