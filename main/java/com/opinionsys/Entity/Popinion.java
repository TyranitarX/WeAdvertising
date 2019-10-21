package com.opinionsys.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Popinion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int oid;

    @ManyToOne
    @JoinColumn(name = "uid",referencedColumnName = "uid")
    private User user;

    @Column
    private String oname;

    @Column
    private Date ostartdate;

    @Column
    private Date oenddate;

    @Column
    private int is_deleted;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public Date getOstartdate() {
        return ostartdate;
    }

    public void setOstartdate(Date ostartdate) {
        this.ostartdate = ostartdate;
    }

    public Date getOenddate() {
        return oenddate;
    }

    public void setOenddate(Date oenddate) {
        this.oenddate = oenddate;
    }

    public int getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }
}
