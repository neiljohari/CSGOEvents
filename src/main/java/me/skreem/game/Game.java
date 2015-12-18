package me.skreem.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
@Generated("org.jsonschema2pojo")
public class Game {

    @SerializedName("round")
    @Expose
    private Round round;
    @SerializedName("provider")
    @Expose
    private Provider provider;
    @SerializedName("map")
    @Expose
    private Map map;

    /**
     * 
     * @return
     *     The round
     */
    public Round getRound() {
        return round;
    }

    /**
     * 
     * @param round
     *     The round
     */
    public void setRound(Round round) {
        this.round = round;
    }

    public Game withRound(Round round) {
        this.round = round;
        return this;
    }

    /**
     * 
     * @return
     *     The provider
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * 
     * @param provider
     *     The provider
     */
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Game withProvider(Provider provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 
     * @return
     *     The map
     */
    public Map getMap() {
        return map;
    }

    /**
     * 
     * @param map
     *     The map
     */
    public void setMap(Map map) {
        this.map = map;
    }

    public Game withMap(Map map) {
        this.map = map;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
