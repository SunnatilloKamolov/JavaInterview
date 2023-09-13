package uz.dev.gowithexample.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.dev.gowithexample.common.model.Address;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
