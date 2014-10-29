package com.blackswan.fake.Bean;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Topicreply entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="topicreply"
    ,catalog="fake"
)

public class Topicreply  implements java.io.Serializable {


    // Fields    

     private Integer TReplyid;
     private Topic topic;
     private String TReplycontent;
     private String CPassivityStatus;
     private String CMainStatus;
     private Integer CPassivityId;
     private Integer CMainId;
     private Timestamp replytime;


    // Constructors

    /** default constructor */
    public Topicreply() {
    }

	/** minimal constructor */
    public Topicreply(Topic topic, String TReplycontent, String CPassivityStatus, String CMainStatus, Integer CPassivityId, Timestamp replytime) {
        this.topic = topic;
        this.TReplycontent = TReplycontent;
        this.CPassivityStatus = CPassivityStatus;
        this.CMainStatus = CMainStatus;
        this.CPassivityId = CPassivityId;
        this.replytime = replytime;
    }
    
    /** full constructor */
    public Topicreply(Topic topic, String TReplycontent, String CPassivityStatus, String CMainStatus, Integer CPassivityId, Integer CMainId, Timestamp replytime) {
        this.topic = topic;
        this.TReplycontent = TReplycontent;
        this.CPassivityStatus = CPassivityStatus;
        this.CMainStatus = CMainStatus;
        this.CPassivityId = CPassivityId;
        this.CMainId = CMainId;
        this.replytime = replytime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="t_replyid", unique=true, nullable=false)

    public Integer getTReplyid() {
        return this.TReplyid;
    }
    
    public void setTReplyid(Integer TReplyid) {
        this.TReplyid = TReplyid;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="topic_id", nullable=false)

    public Topic getTopic() {
        return this.topic;
    }
    
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    
    @Column(name="t_replycontent", nullable=false)

    public String getTReplycontent() {
        return this.TReplycontent;
    }
    
    public void setTReplycontent(String TReplycontent) {
        this.TReplycontent = TReplycontent;
    }
    
    @Column(name="c_passivity_status", nullable=false, length=10)

    public String getCPassivityStatus() {
        return this.CPassivityStatus;
    }
    
    public void setCPassivityStatus(String CPassivityStatus) {
        this.CPassivityStatus = CPassivityStatus;
    }
    
    @Column(name="c_main_status", nullable=false, length=10)

    public String getCMainStatus() {
        return this.CMainStatus;
    }
    
    public void setCMainStatus(String CMainStatus) {
        this.CMainStatus = CMainStatus;
    }
    
    @Column(name="c_passivity_id", nullable=false)

    public Integer getCPassivityId() {
        return this.CPassivityId;
    }
    
    public void setCPassivityId(Integer CPassivityId) {
        this.CPassivityId = CPassivityId;
    }
    
    @Column(name="c_main_id")

    public Integer getCMainId() {
        return this.CMainId;
    }
    
    public void setCMainId(Integer CMainId) {
        this.CMainId = CMainId;
    }
    
    @Column(name="replytime", nullable=false, length=19)

    public Timestamp getReplytime() {
        return this.replytime;
    }
    
    public void setReplytime(Timestamp replytime) {
        this.replytime = replytime;
    }
   








}