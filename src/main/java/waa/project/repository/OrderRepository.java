package waa.project.repository;

import org.springframework.data.repository.CrudRepository;

import waa.project.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

}
