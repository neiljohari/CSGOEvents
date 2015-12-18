
package me.skreem.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TeamT {

    @SerializedName("score")
    @Expose
    private Integer score;

    /**
     * 
     * @return
     *     The score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    public TeamT withScore(Integer score) {
        this.score = score;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
