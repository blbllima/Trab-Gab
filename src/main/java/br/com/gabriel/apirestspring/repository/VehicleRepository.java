package br.com.gabriel.apirestspring.repository;

import br.com.gabriel.apirestspring.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<VehicleModel, Integer> {
}
