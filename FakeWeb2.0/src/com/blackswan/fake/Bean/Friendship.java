package com.blackswan.fake.Bean;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Friendship entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="friendship"
    ,catalog="fake"
)

public class Friendship  implements java.io.Serializable {


    // Fields    

     private Integer friendshipId;
     private String mainStatus;
     private Integer mainId;
     private String passivityStatus;
     private Integer passivityId;
     private Timestamp friendstime;
     private String mainclass;
     private String passivityclass;
     private String mainmark;
     private String passivitymark;


    // Constructors

    /** default constructor */
    public Friendship() {
    }

	/** minimal constructor */
    public Friendship(String mainStatus, Integer mainId, String passivityStatus, Integer passivityId, Timestamp friendstime) {
        this.mainStatus = mainStatus;
        this.mainId = mainId;
        this.passivityStatus = passivityStatus;
        this.passivityId = passivityId;
        this.friendstime = friendstime;
    }
    
    /** full constructor */
    public Friendship(String mainStatus, Integer mainId, String passivityStatus, Integer passivityId, Timestamp friendstime, String mainclass, String passivityclass, String mainmark, String passivitymark) {
        this.mainStatus = mainStatus;
        this.mainId = mainId;
        this.passivityStatus = passivityStatus;
        this.passivityId = passivityId;
        this.friendstime = friendstime;
        this.mainclass = mainclass;
        this.passivityclass = passivityclass;
        this.mainmark = mainmark;
        this.passivitymark = passivitymark;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="friendship_id", unique=true, nullable=false)

    public Integer getFriendshipId() {
        return this.friendshipId;
    }
    
    public void setFriendshipId(Integer friendshipId) {
        this.friendshipId = friendshipId;
    }
    
    @Column(name="main_status", nullable=false, length=10)

    public String getMainStatus() {
        return this.mainStatus;
    }
    
    public void setMainStatus(String mainStatus) {
        this.mainStatus = mainStatus;
    }
    
    @Column(name="main_id", nullable=false)

    public Integer getMainId() {
        return this.mainId;
    }
    
    public void setMainId(Integer mainId) {
        this.mainId = mainId;
    }
    
    @Column(name="passivity_status", nullable=false, length=10)

    public String getPassivityStatus() {
        return this.passivityStatus;
    }
    
    public void setPassivityStatus(String passivityStatus) {
        this.passivityStatus = passivityStatus;
    }
    
    @Column(name="passivity_id", nullable=false)

    public Integer getPassivityId() {
        return this.passivityId;
    }
    
    public void setPassivityId(Integer passivityId) {
        this.passivityId = passivityId;
    }
    
    @Column(name="friendstime", nullable=false, length=19)

    public Timestamp getFriendstime() {
        return this.friendstime;
    }
    
    public void setFriendstime(Timestamp friendstime) {
        this.friendstime = friendstime;
    }
    
    @Column(name="mainclass", length=20)

    public String getMainclass() {
        return this.mainclass;
    }
    
    public void setMainclass(String mainclass) {
        this.mainclass = mainclass;
    }
    
    @Column(name="passivityclass", length=20)

    public String getPassivityclass() {
        return this.passivityclass;
    }
    
    public void setPassivityclass(String passivityclass) {
        this.passivityclass = passivityclass;
    }
    
    @Column(name="mainmark", length=20)

    public String getMainmark() {
        return this.mainmark;
    }
    
    public void setMainmark(String mainmark) {
        this.mainmark = mainmark;
    }
    
    @Column(name="passivitymark", length=20)

    public String getPassivitymark() {
        return this.passivitymark;
    }
    
    public void setPassivitymark(String passivitymark) {
        this.passivitymark = passivitymark;
    }
   








}