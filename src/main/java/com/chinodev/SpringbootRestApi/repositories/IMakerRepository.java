package com.chinodev.SpringbootRestApi.repositories;
import com.chinodev.SpringbootRestApi.entities.Maker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMakerRepository extends CrudRepository<Maker, Long> {
}
