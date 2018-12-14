package repository;

import javaz.webz.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigurationInterface  extends JpaRepository<Payments, String> {
    Payments findByName(String name);


}
