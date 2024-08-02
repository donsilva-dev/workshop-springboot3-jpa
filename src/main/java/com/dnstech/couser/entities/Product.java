package com.dnstech.couser.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tb_product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private Double price;
	private String img;

	/*
	 * Set representa um conjunto de coleção, isso garante que não vou ter um produto com mais
	 * de uma ocorrencia da mesma categoria O mesmo produto não pode ter a mesma
	 * categoria mais de uma vez..
	 **/

	@ManyToMany // Associação muito para muitos
	/*Nome da tabela que vai fazer associação no banco de dados*/
	/*JoindColumns nome da chave estrangeira referente a tabela de produtos*/
	/*inverseJoinColumns: è para denifir qual é a chave estrangeira da outra entidade */
	@JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"),
	inverseJoinColumns = @JoinColumn(name = "category_id"))
	
	private Set<Category> categories = new HashSet<>();

	// Estou dizendo para o meu jpa que nao vou adimitir repetição do mesmo item.
	@OneToMany(mappedBy = "id.product")
	private Set<OrderItem> items = new HashSet<OrderItem>();
	
	public Product() {

	}

	public Product(Long id, String name, String description, Double price, String img) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.img = img;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Set<Category> getCategories() {
		return categories;
	}
	@JsonIgnore
	public Set<Order> getOrders(){
		Set<Order> set = new HashSet<Order>();
		for (OrderItem x : items) {
			set.add(x.getOrder());
		}
		return set;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}

}
