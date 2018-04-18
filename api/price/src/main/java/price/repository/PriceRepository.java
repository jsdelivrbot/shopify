package price.repository;

import price.domain.Price;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PriceRepository extends JpaRepository<Price, String>{
    List<Price> findByProductId(String productId);

    Optional<Price> findTopByProductIdOrderByCreatedAtDesc(String productId);
}
