package repository;

import javaz.webz.entity.Payments;
import javaz.webz.entity.PhoneNumbers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Configuration_Interface_1_phone_numbers   extends JpaRepository<PhoneNumbers, String> {
    PhoneNumbers findByPhoneNumbers(String phoneNumbers);
    PhoneNumbers findByServices(String services);

}
