package com.opinionsys.Entity;

import javax.persistence.*;

@Entity
@Table
public class Opintionselects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int ossid;

    @ManyToOne
    @JoinColumn(name = "osid",referencedColumnName = "osid")
    private Optionselect optionselect;

    @ManyToOne
    @JoinColumn(name = "oid",referencedColumnName = "oid")
    private Popinion popinion;

    @Column
    private String oscontent;

    public int getOssid() {
        return ossid;
    }

    public void setOssid(int ossid) {
        this.ossid = ossid;
    }

    public Optionselect getOptionselect() {
        return optionselect;
    }

    public void setOptionselect(Optionselect optionselect) {
        this.optionselect = optionselect;
    }

    public Popinion getPopinion() {
        return popinion;
    }

    public void setPopinion(Popinion popinion) {
        this.popinion = popinion;
    }

    public String getOscontent() {
        return oscontent;
    }

    public void setOscontent(String oscontent) {
        this.oscontent = oscontent;
    }
}
