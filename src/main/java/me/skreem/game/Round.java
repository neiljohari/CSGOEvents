package me.skreem.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Round {

    @SerializedName("phase")
    @Expose
    private String phase;
    @SerializedName("bomb")
    @Expose
    private String bomb;

    /**
     * 
     * @return
     *     The phase
     */
    public String getPhase() {
        return phase;
    }

    /**
     * 
     * @param phase
     *     The phase
     */
    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Round withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 
     * @return
     *     The bomb
     */
    public String getBomb() {
        return bomb;
    }

    /**
     * 
     * @param bomb
     *     The bomb
     */
    public void setBomb(String bomb) {
        this.bomb = bomb;
    }

    public Round withBomb(String bomb) {
        this.bomb = bomb;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
