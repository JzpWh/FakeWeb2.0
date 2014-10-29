package com.blackswan.fake.Bean;

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
 * Barberpic entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barberpic"
    ,catalog="fake"
)

public class Barberpic  implements java.io.Serializable {


    // Fields    

     private Integer BPicId;
     private Barberphoto barberphoto;
     private Boolean BPicIsview;
     private String BPicPath;


    // Constructors

    /** default constructor */
    public Barberpic() {
    }

	/** minimal constructor */
    public Barberpic(Barberphoto barberphoto) {
        this.barberphoto = barberphoto;
    }
    
    /** full constructor */
    public Barberpic(Barberphoto barberphoto, Boolean BPicIsview, String BPicPath) {
        this.barberphoto = barberphoto;
        this.BPicIsview = BPicIsview;
        this.BPicPath = BPicPath;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="b_pic_id", unique=true, nullable=false)

    public Integer getBPicId() {
        return this.BPicId;
    }
    
    public void setBPicId(Integer BPicId) {
        this.BPicId = BPicId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="b_p_id", nullable=false)

    public Barberphoto getBarberphoto() {
        return this.barberphoto;
    }
    
    public void setBarberphoto(Barberphoto barberphoto) {
        this.barberphoto = barberphoto;
    }
    
    @Column(name="b_pic_isview")

    public Boolean getBPicIsview() {
        return this.BPicIsview;
    }
    
    public void setBPicIsview(Boolean BPicIsview) {
        this.BPicIsview = BPicIsview;
    }
    
    @Column(name="b_pic_path", length=100)

    public String getBPicPath() {
        return this.BPicPath;
    }
    
    public void setBPicPath(String BPicPath) {
        this.BPicPath = BPicPath;
    }
   








}