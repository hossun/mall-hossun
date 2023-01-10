package mallhossun.domain;

import mallhossun.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel="deliveries", path="deliveries")
public interface DeliveryRepository extends PagingAndSortingRepository<Delivery, Long>{
   Optional<Delivery> findByOrderId(Long orderId);

   Optional<Delivery> findyAddress(String address);
   Optional<Delivery> findByStatus(String status);


}
