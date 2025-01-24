package intraer.ccabr.inventario.bancodedados.repositories;

import intraer.ccabr.inventario.bancodedados.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
