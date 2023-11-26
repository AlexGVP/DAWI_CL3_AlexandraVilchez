package cibertec.edu.pe.DAWI_CL3_AlexandraVilchez.repository;

import cibertec.edu.pe.DAWI_CL3_AlexandraVilchez.model.bd.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Integer> {
}
