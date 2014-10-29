package com.blackswan.fake.Bean;

import java.sql.Time;
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
import javax.persistence.UniqueConstraint;


/**
 * Customer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="customer"
    ,catalog="fake"
, uniqueConstraints = @UniqueConstraint(columnNames="c_name")
)

public class Customer  implements java.io.Serializable {


    // Fields    

     private Integer CId;
     private String CHPath;
     private String CName;
     private String CPwd;
     private String CPhone;
     private Boolean CSex;
     private Time CBirthday;
     private String CDis;
     private Boolean CHair;
     private Boolean CHairp;
     private Timestamp CInfoTime;
     private Time BCreatetime;
     private String CAddress;
     private String CRenren;
     private String CSina;
     private String CQq;
     private String CWeixin;
     private String CMail;
     private Set<Cancelpreordertable> cancelpreordertables = new HashSet<Cancelpreordertable>(0);
     private Set<Ordertable> ordertables = new HashSet<Ordertable>(0);
     private Set<Noapordertable> noapordertables = new HashSet<Noapordertable>(0);
     private Set<Shopappraisepraise> shopappraisepraises = new HashSet<Shopappraisepraise>(0);
     private Set<Shopappraisestamp> shopappraisestamps = new HashSet<Shopappraisestamp>(0);
     private Set<Barberphototread> barberphototreads = new HashSet<Barberphototread>(0);
     private Set<Cancelordertable> cancelordertables = new HashSet<Cancelordertable>(0);
     private Set<Barberappraisetread> barberappraisetreads = new HashSet<Barberappraisetread>(0);
     private Set<Coperation> coperations = new HashSet<Coperation>(0);
     private Set<Shopappraisereply> shopappraisereplies = new HashSet<Shopappraisereply>(0);
     private Set<Mycollect> mycollects = new HashSet<Mycollect>(0);
     private Set<Barberappraisereply> barberappraisereplies = new HashSet<Barberappraisereply>(0);
     private Set<Barberphotopraise> barberphotopraises = new HashSet<Barberphotopraise>(0);
     private Set<Barberappraise> barberappraises = new HashSet<Barberappraise>(0);
     private Set<Vip> vips = new HashSet<Vip>(0);
     private Set<Shopappraise> shopappraises = new HashSet<Shopappraise>(0);
     private Set<Barberappraisepraise> barberappraisepraises = new HashSet<Barberappraisepraise>(0);
     private Set<Myvoucher> myvouchers = new HashSet<Myvoucher>(0);
     private Set<Preordertable> preordertables = new HashSet<Preordertable>(0);


    // Constructors

    /** default constructor */
    public Customer() {
    }

	/** minimal constructor */
    public Customer(String CPwd, String CPhone, Timestamp CInfoTime) {
        this.CPwd = CPwd;
        this.CPhone = CPhone;
        this.CInfoTime = CInfoTime;
    }
    
    /** full constructor */
    public Customer(String CHPath, String CName, String CPwd, String CPhone, Boolean CSex, Time CBirthday, String CDis, Boolean CHair, Boolean CHairp, Timestamp CInfoTime, Time BCreatetime, String CAddress, String CRenren, String CSina, String CQq, String CWeixin, String CMail, Set<Cancelpreordertable> cancelpreordertables, Set<Ordertable> ordertables, Set<Noapordertable> noapordertables, Set<Shopappraisepraise> shopappraisepraises, Set<Shopappraisestamp> shopappraisestamps, Set<Barberphototread> barberphototreads, Set<Cancelordertable> cancelordertables, Set<Barberappraisetread> barberappraisetreads, Set<Coperation> coperations, Set<Shopappraisereply> shopappraisereplies, Set<Mycollect> mycollects, Set<Barberappraisereply> barberappraisereplies, Set<Barberphotopraise> barberphotopraises, Set<Barberappraise> barberappraises, Set<Vip> vips, Set<Shopappraise> shopappraises, Set<Barberappraisepraise> barberappraisepraises, Set<Myvoucher> myvouchers, Set<Preordertable> preordertables) {
        this.CHPath = CHPath;
        this.CName = CName;
        this.CPwd = CPwd;
        this.CPhone = CPhone;
        this.CSex = CSex;
        this.CBirthday = CBirthday;
        this.CDis = CDis;
        this.CHair = CHair;
        this.CHairp = CHairp;
        this.CInfoTime = CInfoTime;
        this.BCreatetime = BCreatetime;
        this.CAddress = CAddress;
        this.CRenren = CRenren;
        this.CSina = CSina;
        this.CQq = CQq;
        this.CWeixin = CWeixin;
        this.CMail = CMail;
        this.cancelpreordertables = cancelpreordertables;
        this.ordertables = ordertables;
        this.noapordertables = noapordertables;
        this.shopappraisepraises = shopappraisepraises;
        this.shopappraisestamps = shopappraisestamps;
        this.barberphototreads = barberphototreads;
        this.cancelordertables = cancelordertables;
        this.barberappraisetreads = barberappraisetreads;
        this.coperations = coperations;
        this.shopappraisereplies = shopappraisereplies;
        this.mycollects = mycollects;
        this.barberappraisereplies = barberappraisereplies;
        this.barberphotopraises = barberphotopraises;
        this.barberappraises = barberappraises;
        this.vips = vips;
        this.shopappraises = shopappraises;
        this.barberappraisepraises = barberappraisepraises;
        this.myvouchers = myvouchers;
        this.preordertables = preordertables;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="c_id", unique=true, nullable=false)

    public Integer getCId() {
        return this.CId;
    }
    
    public void setCId(Integer CId) {
        this.CId = CId;
    }
    
    @Column(name="c_h_path", length=100)

    public String getCHPath() {
        return this.CHPath;
    }
    
    public void setCHPath(String CHPath) {
        this.CHPath = CHPath;
    }
    
    @Column(name="c_name", unique=true, length=20)

    public String getCName() {
        return this.CName;
    }
    
    public void setCName(String CName) {
        this.CName = CName;
    }
    
    @Column(name="c_pwd", nullable=false, length=20)

    public String getCPwd() {
        return this.CPwd;
    }
    
    public void setCPwd(String CPwd) {
        this.CPwd = CPwd;
    }
    
    @Column(name="c_phone", nullable=false, length=20)

    public String getCPhone() {
        return this.CPhone;
    }
    
    public void setCPhone(String CPhone) {
        this.CPhone = CPhone;
    }
    
    @Column(name="c_sex")

    public Boolean getCSex() {
        return this.CSex;
    }
    
    public void setCSex(Boolean CSex) {
        this.CSex = CSex;
    }
    
    @Column(name="c_birthday", length=8)

    public Time getCBirthday() {
        return this.CBirthday;
    }
    
    public void setCBirthday(Time CBirthday) {
        this.CBirthday = CBirthday;
    }
    
    @Column(name="c_dis")

    public String getCDis() {
        return this.CDis;
    }
    
    public void setCDis(String CDis) {
        this.CDis = CDis;
    }
    
    @Column(name="c_hair")

    public Boolean getCHair() {
        return this.CHair;
    }
    
    public void setCHair(Boolean CHair) {
        this.CHair = CHair;
    }
    
    @Column(name="c_hairp")

    public Boolean getCHairp() {
        return this.CHairp;
    }
    
    public void setCHairp(Boolean CHairp) {
        this.CHairp = CHairp;
    }
    
    @Column(name="c_info_time", nullable=false, length=19)

    public Timestamp getCInfoTime() {
        return this.CInfoTime;
    }
    
    public void setCInfoTime(Timestamp CInfoTime) {
        this.CInfoTime = CInfoTime;
    }
    
    @Column(name="b_createtime", length=8)

    public Time getBCreatetime() {
        return this.BCreatetime;
    }
    
    public void setBCreatetime(Time BCreatetime) {
        this.BCreatetime = BCreatetime;
    }
    
    @Column(name="c_address", length=60)

    public String getCAddress() {
        return this.CAddress;
    }
    
    public void setCAddress(String CAddress) {
        this.CAddress = CAddress;
    }
    
    @Column(name="c_renren", length=20)

    public String getCRenren() {
        return this.CRenren;
    }
    
    public void setCRenren(String CRenren) {
        this.CRenren = CRenren;
    }
    
    @Column(name="c_sina", length=20)

    public String getCSina() {
        return this.CSina;
    }
    
    public void setCSina(String CSina) {
        this.CSina = CSina;
    }
    
    @Column(name="c_qq", length=20)

    public String getCQq() {
        return this.CQq;
    }
    
    public void setCQq(String CQq) {
        this.CQq = CQq;
    }
    
    @Column(name="c_weixin", length=20)

    public String getCWeixin() {
        return this.CWeixin;
    }
    
    public void setCWeixin(String CWeixin) {
        this.CWeixin = CWeixin;
    }
    
    @Column(name="c_mail", length=40)

    public String getCMail() {
        return this.CMail;
    }
    
    public void setCMail(String CMail) {
        this.CMail = CMail;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Cancelpreordertable> getCancelpreordertables() {
        return this.cancelpreordertables;
    }
    
    public void setCancelpreordertables(Set<Cancelpreordertable> cancelpreordertables) {
        this.cancelpreordertables = cancelpreordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Ordertable> getOrdertables() {
        return this.ordertables;
    }
    
    public void setOrdertables(Set<Ordertable> ordertables) {
        this.ordertables = ordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Noapordertable> getNoapordertables() {
        return this.noapordertables;
    }
    
    public void setNoapordertables(Set<Noapordertable> noapordertables) {
        this.noapordertables = noapordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Shopappraisepraise> getShopappraisepraises() {
        return this.shopappraisepraises;
    }
    
    public void setShopappraisepraises(Set<Shopappraisepraise> shopappraisepraises) {
        this.shopappraisepraises = shopappraisepraises;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Shopappraisestamp> getShopappraisestamps() {
        return this.shopappraisestamps;
    }
    
    public void setShopappraisestamps(Set<Shopappraisestamp> shopappraisestamps) {
        this.shopappraisestamps = shopappraisestamps;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Barberphototread> getBarberphototreads() {
        return this.barberphototreads;
    }
    
    public void setBarberphototreads(Set<Barberphototread> barberphototreads) {
        this.barberphototreads = barberphototreads;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Cancelordertable> getCancelordertables() {
        return this.cancelordertables;
    }
    
    public void setCancelordertables(Set<Cancelordertable> cancelordertables) {
        this.cancelordertables = cancelordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Barberappraisetread> getBarberappraisetreads() {
        return this.barberappraisetreads;
    }
    
    public void setBarberappraisetreads(Set<Barberappraisetread> barberappraisetreads) {
        this.barberappraisetreads = barberappraisetreads;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Coperation> getCoperations() {
        return this.coperations;
    }
    
    public void setCoperations(Set<Coperation> coperations) {
        this.coperations = coperations;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Shopappraisereply> getShopappraisereplies() {
        return this.shopappraisereplies;
    }
    
    public void setShopappraisereplies(Set<Shopappraisereply> shopappraisereplies) {
        this.shopappraisereplies = shopappraisereplies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Mycollect> getMycollects() {
        return this.mycollects;
    }
    
    public void setMycollects(Set<Mycollect> mycollects) {
        this.mycollects = mycollects;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Barberappraisereply> getBarberappraisereplies() {
        return this.barberappraisereplies;
    }
    
    public void setBarberappraisereplies(Set<Barberappraisereply> barberappraisereplies) {
        this.barberappraisereplies = barberappraisereplies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Barberphotopraise> getBarberphotopraises() {
        return this.barberphotopraises;
    }
    
    public void setBarberphotopraises(Set<Barberphotopraise> barberphotopraises) {
        this.barberphotopraises = barberphotopraises;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Barberappraise> getBarberappraises() {
        return this.barberappraises;
    }
    
    public void setBarberappraises(Set<Barberappraise> barberappraises) {
        this.barberappraises = barberappraises;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Vip> getVips() {
        return this.vips;
    }
    
    public void setVips(Set<Vip> vips) {
        this.vips = vips;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Shopappraise> getShopappraises() {
        return this.shopappraises;
    }
    
    public void setShopappraises(Set<Shopappraise> shopappraises) {
        this.shopappraises = shopappraises;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Barberappraisepraise> getBarberappraisepraises() {
        return this.barberappraisepraises;
    }
    
    public void setBarberappraisepraises(Set<Barberappraisepraise> barberappraisepraises) {
        this.barberappraisepraises = barberappraisepraises;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Myvoucher> getMyvouchers() {
        return this.myvouchers;
    }
    
    public void setMyvouchers(Set<Myvoucher> myvouchers) {
        this.myvouchers = myvouchers;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")

    public Set<Preordertable> getPreordertables() {
        return this.preordertables;
    }
    
    public void setPreordertables(Set<Preordertable> preordertables) {
        this.preordertables = preordertables;
    }
   








}