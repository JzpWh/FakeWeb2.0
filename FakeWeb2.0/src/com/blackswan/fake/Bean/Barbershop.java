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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * Barbershop entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barbershop"
    ,catalog="fake"
, uniqueConstraints = @UniqueConstraint(columnNames="s_name")
)

public class Barbershop  implements java.io.Serializable {


    // Fields    

     private Integer SId;
     private Barbershop barbershop;
     private String SHPath;
     private String SName;
     private String SPwd;
     private String STelephone;
     private String SShopmanager;
     private String SPhone;
     private String SDis;
     private Double SLng;
     private Double SLat;
     private String SAddress;
     private String SCard;
     private String SCardbank;
     private String SZhifubao;
     private Timestamp SInfotime;
     private Timestamp SCreatetime;
     private Boolean SAudited;
     private Set<Voucher> vouchers = new HashSet<Voucher>(0);
     private Set<Ordertable> ordertables = new HashSet<Ordertable>(0);
     private Set<Productclass> productclasses = new HashSet<Productclass>(0);
     private Set<Shopappraisereply> shopappraisereplies = new HashSet<Shopappraisereply>(0);
     private Set<Barbershoppic> barbershoppics = new HashSet<Barbershoppic>(0);
     private Set<Vipclass> vipclasses = new HashSet<Vipclass>(0);
     private Set<Cancelordertable> cancelordertables = new HashSet<Cancelordertable>(0);
     private Set<Noapordertable> noapordertables = new HashSet<Noapordertable>(0);
     private Set<Barbershopemployee> barbershopemployees = new HashSet<Barbershopemployee>(0);
     private Set<Barber> barbers = new HashSet<Barber>(0);
     private Set<Cancelpreordertable> cancelpreordertables = new HashSet<Cancelpreordertable>(0);
     private Set<Soperation> soperations = new HashSet<Soperation>(0);
     private Set<Barbershop> barbershops = new HashSet<Barbershop>(0);
     private Set<Vip> vips = new HashSet<Vip>(0);
     private Set<Meteringcard> meteringcards = new HashSet<Meteringcard>(0);
     private Set<Shopappraise> shopappraises = new HashSet<Shopappraise>(0);
     private Set<Preordertable> preordertables = new HashSet<Preordertable>(0);
     private Set<Barbershopfire> barbershopfires = new HashSet<Barbershopfire>(0);
     private Set<Serviceclass> serviceclasses = new HashSet<Serviceclass>(0);


    // Constructors

    /** default constructor */
    public Barbershop() {
    }

	/** minimal constructor */
    public Barbershop(String SName, String SPwd, String STelephone, String SShopmanager, String SPhone, String SAddress, String SCard, String SCardbank, Timestamp SInfotime, Boolean SAudited) {
        this.SName = SName;
        this.SPwd = SPwd;
        this.STelephone = STelephone;
        this.SShopmanager = SShopmanager;
        this.SPhone = SPhone;
        this.SAddress = SAddress;
        this.SCard = SCard;
        this.SCardbank = SCardbank;
        this.SInfotime = SInfotime;
        this.SAudited = SAudited;
    }
    
    /** full constructor */
    public Barbershop(Barbershop barbershop, String SHPath, String SName, String SPwd, String STelephone, String SShopmanager, String SPhone, String SDis, Double SLng, Double SLat, String SAddress, String SCard, String SCardbank, String SZhifubao, Timestamp SInfotime, Timestamp SCreatetime, Boolean SAudited, Set<Voucher> vouchers, Set<Ordertable> ordertables, Set<Productclass> productclasses, Set<Shopappraisereply> shopappraisereplies, Set<Barbershoppic> barbershoppics, Set<Vipclass> vipclasses, Set<Cancelordertable> cancelordertables, Set<Noapordertable> noapordertables, Set<Barbershopemployee> barbershopemployees, Set<Barber> barbers, Set<Cancelpreordertable> cancelpreordertables, Set<Soperation> soperations, Set<Barbershop> barbershops, Set<Vip> vips, Set<Meteringcard> meteringcards, Set<Shopappraise> shopappraises, Set<Preordertable> preordertables, Set<Barbershopfire> barbershopfires, Set<Serviceclass> serviceclasses) {
        this.barbershop = barbershop;
        this.SHPath = SHPath;
        this.SName = SName;
        this.SPwd = SPwd;
        this.STelephone = STelephone;
        this.SShopmanager = SShopmanager;
        this.SPhone = SPhone;
        this.SDis = SDis;
        this.SLng = SLng;
        this.SLat = SLat;
        this.SAddress = SAddress;
        this.SCard = SCard;
        this.SCardbank = SCardbank;
        this.SZhifubao = SZhifubao;
        this.SInfotime = SInfotime;
        this.SCreatetime = SCreatetime;
        this.SAudited = SAudited;
        this.vouchers = vouchers;
        this.ordertables = ordertables;
        this.productclasses = productclasses;
        this.shopappraisereplies = shopappraisereplies;
        this.barbershoppics = barbershoppics;
        this.vipclasses = vipclasses;
        this.cancelordertables = cancelordertables;
        this.noapordertables = noapordertables;
        this.barbershopemployees = barbershopemployees;
        this.barbers = barbers;
        this.cancelpreordertables = cancelpreordertables;
        this.soperations = soperations;
        this.barbershops = barbershops;
        this.vips = vips;
        this.meteringcards = meteringcards;
        this.shopappraises = shopappraises;
        this.preordertables = preordertables;
        this.barbershopfires = barbershopfires;
        this.serviceclasses = serviceclasses;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="s_id", unique=true, nullable=false)

    public Integer getSId() {
        return this.SId;
    }
    
    public void setSId(Integer SId) {
        this.SId = SId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="s_f_id")

    public Barbershop getBarbershop() {
        return this.barbershop;
    }
    
    public void setBarbershop(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
    
    @Column(name="s_h_path", length=100)

    public String getSHPath() {
        return this.SHPath;
    }
    
    public void setSHPath(String SHPath) {
        this.SHPath = SHPath;
    }
    
    @Column(name="s_name", unique=true, nullable=false, length=10)

    public String getSName() {
        return this.SName;
    }
    
    public void setSName(String SName) {
        this.SName = SName;
    }
    
    @Column(name="s_pwd", nullable=false, length=20)

    public String getSPwd() {
        return this.SPwd;
    }
    
    public void setSPwd(String SPwd) {
        this.SPwd = SPwd;
    }
    
    @Column(name="s_telephone", nullable=false, length=20)

    public String getSTelephone() {
        return this.STelephone;
    }
    
    public void setSTelephone(String STelephone) {
        this.STelephone = STelephone;
    }
    
    @Column(name="s_shopmanager", nullable=false, length=20)

    public String getSShopmanager() {
        return this.SShopmanager;
    }
    
    public void setSShopmanager(String SShopmanager) {
        this.SShopmanager = SShopmanager;
    }
    
    @Column(name="s_phone", nullable=false, length=20)

    public String getSPhone() {
        return this.SPhone;
    }
    
    public void setSPhone(String SPhone) {
        this.SPhone = SPhone;
    }
    
    @Column(name="s_dis")

    public String getSDis() {
        return this.SDis;
    }
    
    public void setSDis(String SDis) {
        this.SDis = SDis;
    }
    
    @Column(name="s_lng", precision=22, scale=0)

    public Double getSLng() {
        return this.SLng;
    }
    
    public void setSLng(Double SLng) {
        this.SLng = SLng;
    }
    
    @Column(name="s_lat", precision=22, scale=0)

    public Double getSLat() {
        return this.SLat;
    }
    
    public void setSLat(Double SLat) {
        this.SLat = SLat;
    }
    
    @Column(name="s_address", nullable=false, length=50)

    public String getSAddress() {
        return this.SAddress;
    }
    
    public void setSAddress(String SAddress) {
        this.SAddress = SAddress;
    }
    
    @Column(name="s_card", nullable=false, length=30)

    public String getSCard() {
        return this.SCard;
    }
    
    public void setSCard(String SCard) {
        this.SCard = SCard;
    }
    
    @Column(name="s_cardbank", nullable=false, length=20)

    public String getSCardbank() {
        return this.SCardbank;
    }
    
    public void setSCardbank(String SCardbank) {
        this.SCardbank = SCardbank;
    }
    
    @Column(name="s_zhifubao", length=30)

    public String getSZhifubao() {
        return this.SZhifubao;
    }
    
    public void setSZhifubao(String SZhifubao) {
        this.SZhifubao = SZhifubao;
    }
    
    @Column(name="s_infotime", nullable=false, length=19)

    public Timestamp getSInfotime() {
        return this.SInfotime;
    }
    
    public void setSInfotime(Timestamp SInfotime) {
        this.SInfotime = SInfotime;
    }
    
    @Column(name="s_createtime", length=8)

    public Timestamp getSCreatetime() {
        return this.SCreatetime;
    }
    
    public void setSCreatetime(Timestamp SCreatetime) {
        this.SCreatetime = SCreatetime;
    }
    
    @Column(name="s_audited", nullable=false)

    public Boolean getSAudited() {
        return this.SAudited;
    }
    
    public void setSAudited(Boolean SAudited) {
        this.SAudited = SAudited;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Voucher> getVouchers() {
        return this.vouchers;
    }
    
    public void setVouchers(Set<Voucher> vouchers) {
        this.vouchers = vouchers;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Ordertable> getOrdertables() {
        return this.ordertables;
    }
    
    public void setOrdertables(Set<Ordertable> ordertables) {
        this.ordertables = ordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Productclass> getProductclasses() {
        return this.productclasses;
    }
    
    public void setProductclasses(Set<Productclass> productclasses) {
        this.productclasses = productclasses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Shopappraisereply> getShopappraisereplies() {
        return this.shopappraisereplies;
    }
    
    public void setShopappraisereplies(Set<Shopappraisereply> shopappraisereplies) {
        this.shopappraisereplies = shopappraisereplies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Barbershoppic> getBarbershoppics() {
        return this.barbershoppics;
    }
    
    public void setBarbershoppics(Set<Barbershoppic> barbershoppics) {
        this.barbershoppics = barbershoppics;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Vipclass> getVipclasses() {
        return this.vipclasses;
    }
    
    public void setVipclasses(Set<Vipclass> vipclasses) {
        this.vipclasses = vipclasses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Cancelordertable> getCancelordertables() {
        return this.cancelordertables;
    }
    
    public void setCancelordertables(Set<Cancelordertable> cancelordertables) {
        this.cancelordertables = cancelordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Noapordertable> getNoapordertables() {
        return this.noapordertables;
    }
    
    public void setNoapordertables(Set<Noapordertable> noapordertables) {
        this.noapordertables = noapordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Barbershopemployee> getBarbershopemployees() {
        return this.barbershopemployees;
    }
    
    public void setBarbershopemployees(Set<Barbershopemployee> barbershopemployees) {
        this.barbershopemployees = barbershopemployees;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Barber> getBarbers() {
        return this.barbers;
    }
    
    public void setBarbers(Set<Barber> barbers) {
        this.barbers = barbers;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Cancelpreordertable> getCancelpreordertables() {
        return this.cancelpreordertables;
    }
    
    public void setCancelpreordertables(Set<Cancelpreordertable> cancelpreordertables) {
        this.cancelpreordertables = cancelpreordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Soperation> getSoperations() {
        return this.soperations;
    }
    
    public void setSoperations(Set<Soperation> soperations) {
        this.soperations = soperations;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Barbershop> getBarbershops() {
        return this.barbershops;
    }
    
    public void setBarbershops(Set<Barbershop> barbershops) {
        this.barbershops = barbershops;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Vip> getVips() {
        return this.vips;
    }
    
    public void setVips(Set<Vip> vips) {
        this.vips = vips;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Meteringcard> getMeteringcards() {
        return this.meteringcards;
    }
    
    public void setMeteringcards(Set<Meteringcard> meteringcards) {
        this.meteringcards = meteringcards;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Shopappraise> getShopappraises() {
        return this.shopappraises;
    }
    
    public void setShopappraises(Set<Shopappraise> shopappraises) {
        this.shopappraises = shopappraises;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Preordertable> getPreordertables() {
        return this.preordertables;
    }
    
    public void setPreordertables(Set<Preordertable> preordertables) {
        this.preordertables = preordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Barbershopfire> getBarbershopfires() {
        return this.barbershopfires;
    }
    
    public void setBarbershopfires(Set<Barbershopfire> barbershopfires) {
        this.barbershopfires = barbershopfires;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barbershop")

    public Set<Serviceclass> getServiceclasses() {
        return this.serviceclasses;
    }
    
    public void setServiceclasses(Set<Serviceclass> serviceclasses) {
        this.serviceclasses = serviceclasses;
    }
   








}