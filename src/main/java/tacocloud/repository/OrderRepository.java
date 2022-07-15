package tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import tacocloud.domain.TacoOrder;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
