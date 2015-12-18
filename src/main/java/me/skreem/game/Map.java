
package me.skreem.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Map {

    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("phase")
    @Expose
    private String phase;
    @SerializedName("round")
    @Expose
    private Integer round;
    @SerializedName("team_ct")
    @Expose
    private TeamCt teamCt;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("team_t")
    @Expose
    private TeamT teamT;

    /**
     * 
     * @return
     *     The mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * 
     * @param mode
     *     The mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    public Map withMode(String mode) {
        this.mode = mode;
        return this;
    }

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

    public Map withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 
     * @return
     *     The round
     */
    public Integer getRound() {
        return round;
    }

    /**
     * 
     * @param round
     *     The round
     */
    public void setRound(Integer round) {
        this.round = round;
    }

    public Map withRound(Integer round) {
        this.round = round;
        return this;
    }

    /**
     * 
     * @return
     *     The teamCt
     */
    public TeamCt getTeamCt() {
        return teamCt;
    }

    /**
     * 
     * @param teamCt
     *     The team_ct
     */
    public void setTeamCt(TeamCt teamCt) {
        this.teamCt = teamCt;
    }

    public Map withTeamCt(TeamCt teamCt) {
        this.teamCt = teamCt;
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

    public Map withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The teamT
     */
    public TeamT getTeamT() {
        return teamT;
    }

    /**
     * 
     * @param teamT
     *     The team_t
     */
    public void setTeamT(TeamT teamT) {
        this.teamT = teamT;
    }

    public Map withTeamT(TeamT teamT) {
        this.teamT = teamT;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
