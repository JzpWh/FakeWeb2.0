package com.blackswan.fake.Bean;

import java.sql.Time;
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
 * Product entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="product"
    ,catalog="fake"
)

public class Product  implements java.io.Serializable {


    // Fields    

     private Integer productId;
     private Productclass productclass;
     private String productName;
     private Float normalprice;
     private Float saleprice;
     private Integer storkamounts;
     private Integer residualamounts;
     private Integer saleamounts;
     private Integer usedamounts;
     private Time storktime;
     private Time producedate;
     private Time shelflife;
     private Time pastdue;
     private Integer safetyamounts;
     private Time pastduewaring;


    // Constructors

    /** default constructor */
    public Product() {
    }

	/** minimal constructor */
    public Product(String productName, Float normalprice, Float saleprice, Integer storkamounts, Integer residualamounts, Integer saleamounts, Integer usedamounts, Time storktime) {
        this.productName = productName;
        this.normalprice = normalprice;
        this.saleprice = saleprice;
        this.storkamounts = storkamounts;
        this.residualamounts = residualamounts;
        this.saleamounts = saleamounts;
        this.usedamounts = usedamounts;
        this.storktime = storktime;
    }
    
    /** full constructor */
    public Product(Productclass productclass, String productName, Float normalprice, Float saleprice, Integer storkamounts, Integer residualamounts, Integer saleamounts, Integer usedamounts, Time storktime, Time producedate, Time shelflife, Time pastdue, Integer safetyamounts, Time pastduewaring) {
        this.productclass = productclass;
        this.productName = productName;
        this.normalprice = normalprice;
        this.saleprice = saleprice;
        this.storkamounts = storkamounts;
        this.residualamounts = residualamounts;
        this.saleamounts = saleamounts;
        this.usedamounts = usedamounts;
        this.storktime = storktime;
        this.producedate = producedate;
        this.shelflife = shelflife;
        this.pastdue = pastdue;
        this.safetyamounts = safetyamounts;
        this.pastduewaring = pastduewaring;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="product_id", unique=true, nullable=false)

    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="productclass_id")

    public Productclass getProductclass() {
        return this.productclass;
    }
    
    public void setProductclass(Productclass productclass) {
        this.productclass = productclass;
    }
    
    @Column(name="product_name", nullable=false, length=10)

    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    @Column(name="normalprice", nullable=false, precision=12, scale=0)

    public Float getNormalprice() {
        return this.normalprice;
    }
    
    public void setNormalprice(Float normalprice) {
        this.normalprice = normalprice;
    }
    
    @Column(name="saleprice", nullable=false, precision=12, scale=0)

    public Float getSaleprice() {
        return this.saleprice;
    }
    
    public void setSaleprice(Float saleprice) {
        this.saleprice = saleprice;
    }
    
    @Column(name="storkamounts", nullable=false)

    public Integer getStorkamounts() {
        return this.storkamounts;
    }
    
    public void setStorkamounts(Integer storkamounts) {
        this.storkamounts = storkamounts;
    }
    
    @Column(name="residualamounts", nullable=false)

    public Integer getResidualamounts() {
        return this.residualamounts;
    }
    
    public void setResidualamounts(Integer residualamounts) {
        this.residualamounts = residualamounts;
    }
    
    @Column(name="saleamounts", nullable=false)

    public Integer getSaleamounts() {
        return this.saleamounts;
    }
    
    public void setSaleamounts(Integer saleamounts) {
        this.saleamounts = saleamounts;
    }
    
    @Column(name="usedamounts", nullable=false)

    public Integer getUsedamounts() {
        return this.usedamounts;
    }
    
    public void setUsedamounts(Integer usedamounts) {
        this.usedamounts = usedamounts;
    }
    
    @Column(name="storktime", nullable=false, length=8)

    public Time getStorktime() {
        return this.storktime;
    }
    
    public void setStorktime(Time storktime) {
        this.storktime = storktime;
    }
    
    @Column(name="producedate", length=8)

    public Time getProducedate() {
        return this.producedate;
    }
    
    public void setProducedate(Time producedate) {
        this.producedate = producedate;
    }
    
    @Column(name="shelflife", length=8)

    public Time getShelflife() {
        return this.shelflife;
    }
    
    public void setShelflife(Time shelflife) {
        this.shelflife = shelflife;
    }
    
    @Column(name="pastdue", length=8)

    public Time getPastdue() {
        return this.pastdue;
    }
    
    public void setPastdue(Time pastdue) {
        this.pastdue = pastdue;
    }
    
    @Column(name="safetyamounts")

    public Integer getSafetyamounts() {
        return this.safetyamounts;
    }
    
    public void setSafetyamounts(Integer safetyamounts) {
        this.safetyamounts = safetyamounts;
    }
    
    @Column(name="pastduewaring", length=8)

    public Time getPastduewaring() {
        return this.pastduewaring;
    }
    
    public void setPastduewaring(Time pastduewaring) {
        this.pastduewaring = pastduewaring;
    }
   








}