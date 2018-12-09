package model.entity;

import javax.persistence.Entity;

@Entity
public class ProductDetail {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int pdid;
	private string pfeatures;
	private Date pdate;
	
	@OneToOne(targetEntity=product.class,cascade = CascadeType.ALL)
	@JoinColumn(name="pd_pId", referancedColumnName="pId")
	private  int pdid;
	
	private string pFeatures;
	private Date 

}
