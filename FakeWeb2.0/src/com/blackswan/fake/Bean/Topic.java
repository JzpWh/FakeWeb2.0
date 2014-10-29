package com.blackswan.fake.Bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * Topic entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="topic"
    ,catalog="fake"
)

public class Topic  implements java.io.Serializable {


    // Fields    

     private Integer topicId;
     private String topicContent;
     private String authorStatus;
     private Integer authorId;
     private Timestamp topicTime;
     private Boolean isfriendssee;
     private Set<Topicreply> topicreplies = new HashSet<Topicreply>(0);
     private Set<Transmit> transmits = new HashSet<Transmit>(0);
     private Set<Topicpic> topicpics = new HashSet<Topicpic>(0);


    // Constructors

    /** default constructor */
    public Topic() {
    }

	/** minimal constructor */
    public Topic(String topicContent, String authorStatus, Integer authorId, Timestamp topicTime, Boolean isfriendssee) {
        this.topicContent = topicContent;
        this.authorStatus = authorStatus;
        this.authorId = authorId;
        this.topicTime = topicTime;
        this.isfriendssee = isfriendssee;
    }
    
    /** full constructor */
    public Topic(String topicContent, String authorStatus, Integer authorId, Timestamp topicTime, Boolean isfriendssee, Set<Topicreply> topicreplies, Set<Transmit> transmits, Set<Topicpic> topicpics) {
        this.topicContent = topicContent;
        this.authorStatus = authorStatus;
        this.authorId = authorId;
        this.topicTime = topicTime;
        this.isfriendssee = isfriendssee;
        this.topicreplies = topicreplies;
        this.transmits = transmits;
        this.topicpics = topicpics;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="topic_id", unique=true, nullable=false)

    public Integer getTopicId() {
        return this.topicId;
    }
    
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }
    
    @Column(name="topic_content", nullable=false)

    public String getTopicContent() {
        return this.topicContent;
    }
    
    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }
    
    @Column(name="author_status", nullable=false, length=10)

    public String getAuthorStatus() {
        return this.authorStatus;
    }
    
    public void setAuthorStatus(String authorStatus) {
        this.authorStatus = authorStatus;
    }
    
    @Column(name="author_id", nullable=false)

    public Integer getAuthorId() {
        return this.authorId;
    }
    
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
    
    @Column(name="topic_time", nullable=false, length=19)

    public Timestamp getTopicTime() {
        return this.topicTime;
    }
    
    public void setTopicTime(Timestamp topicTime) {
        this.topicTime = topicTime;
    }
    
    @Column(name="isfriendssee", nullable=false)

    public Boolean getIsfriendssee() {
        return this.isfriendssee;
    }
    
    public void setIsfriendssee(Boolean isfriendssee) {
        this.isfriendssee = isfriendssee;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="topic")

    public Set<Topicreply> getTopicreplies() {
        return this.topicreplies;
    }
    
    public void setTopicreplies(Set<Topicreply> topicreplies) {
        this.topicreplies = topicreplies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="topic")

    public Set<Transmit> getTransmits() {
        return this.transmits;
    }
    
    public void setTransmits(Set<Transmit> transmits) {
        this.transmits = transmits;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="topic")

    public Set<Topicpic> getTopicpics() {
        return this.topicpics;
    }
    
    public void setTopicpics(Set<Topicpic> topicpics) {
        this.topicpics = topicpics;
    }
   








}