package cibertec.edu.pe.DAWI_CL3_AlexandraVilchez.repository;

import cibertec.edu.pe.DAWI_CL3_AlexandraVilchez.model.bd.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,
        Integer> {
    Rol findByNomrol(String nomrol);
}
