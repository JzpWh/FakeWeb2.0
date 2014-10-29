package com.blackswan.fake.Bean;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Topicpraise entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="topicpraise"
    ,catalog="fake"
)

public class Topicpraise  implements java.io.Serializable {


    // Fields    

     private Integer TPraiseId;
     private Integer topicId;
     private String praiseStatus;
     private Integer praisestatusId;
     private Timestamp praiseTime;


    // Constructors

    /** default constructor */
    public Topicpraise() {
    }

    
    /** full constructor */
    public Topicpraise(Integer topicId, String praiseStatus, Integer praisestatusId, Timestamp praiseTime) {
        this.topicId = topicId;
        this.praiseStatus = praiseStatus;
        this.praisestatusId = praisestatusId;
        this.praiseTime = praiseTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="t_praise_id", unique=true, nullable=false)

    public Integer getTPraiseId() {
        return this.TPraiseId;
    }
    
    public void setTPraiseId(Integer TPraiseId) {
        this.TPraiseId = TPraiseId;
    }
    
    @Column(name="topic_id", nullable=false)

    public Integer getTopicId() {
        return this.topicId;
    }
    
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }
    
    @Column(name="praise_status", nullable=false, length=10)

    public String getPraiseStatus() {
        return this.praiseStatus;
    }
    
    public void setPraiseStatus(String praiseStatus) {
        this.praiseStatus = praiseStatus;
    }
    
    @Column(name="praisestatus_id", nullable=false)

    public Integer getPraisestatusId() {
        return this.praisestatusId;
    }
    
    public void setPraisestatusId(Integer praisestatusId) {
        this.praisestatusId = praisestatusId;
    }
    
    @Column(name="praise_time", nullable=false, length=19)

    public Timestamp getPraiseTime() {
        return this.praiseTime;
    }
    
    public void setPraiseTime(Timestamp praiseTime) {
        this.praiseTime = praiseTime;
    }
   








}