package com.dnstech.couser.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.dnstech.couser.entities.Order;
import com.dnstech.couser.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/* Classe auxiliar de uma chave primariaccomposta*/
@Embeddable // O uso de @Embeddable é especialmente útil em situações onde um conjunto de propriedades é compartilhado entre várias entidades,
public class OrderItemPK implements Serializable {

	private static final long serialVersionUID = 1L;

	/* Referencia para Order */

	@ManyToOne
	@JoinColumn(name = "order_id") // Nome da chave estrangeira no banco de dados.
	private Order order;

	/* Referencia para produto */

	@ManyToOne
	@JoinColumn(name = "product_id") // Nome da chave estrangeira no banco de dados.
	private Product product;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		return Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}

}
