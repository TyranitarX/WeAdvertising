package com.opinionsys.Entity;

import javax.persistence.*;

@Entity
@Table
public class Optionselect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int osid;

    @ManyToOne
    @JoinColumn(name = "oid", referencedColumnName = "uid")
    private Popinion popinion;

    @Column
    private String osname;

    public int getOsid() {
        return osid;
    }

    public void setOsid(int osid) {
        this.osid = osid;
    }

    public Popinion getPopinion() {
        return popinion;
    }

    public void setPopinion(Popinion popinion) {
        this.popinion = popinion;
    }

    public String getOsname() {
        return osname;
    }

    public void setOsname(String osname) {
        this.osname = osname;
    }
}
