package com.devsuperior.uri2990.repositories;

import com.devsuperior.uri2990.dto.EmpregadoDeptDTO;
import com.devsuperior.uri2990.projections.EmpregadoDeptProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.uri2990.entities.Empregado;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpregadoRepository extends JpaRepository<Empregado, String> {

    @Query(nativeQuery = true, value =
            "SELECT e.enome, e.cpf, dep.dnome " +
                    "FROM empregados e " +
                    "INNER JOIN departamentos dep ON dep.dnumero = e.dnumero " +
                    "WHERE e.cpf NOT IN ( " +
                    "   SELECT e.cpf " +
                    "   FROM empregados e " +
                    "   INNER JOIN trabalha tb ON tb.cpf_emp = e.cpf " +
                    ") " +
                    "ORDER BY e.cpf")
    List<EmpregadoDeptProjection> search1();


    @Query("SELECT new com.devsuperior.uri2990.dto.EmpregadoDeptDTO( " +
            "e.enome, " +
            "e.cpf, " +
            "e.departamento.dnome) " +
            "FROM Empregado e " +
            "WHERE e.cpf NOT IN ( " +
            "   SELECT obj.cpf " +
            "   FROM Empregado obj " +
            "   INNER JOIN obj.projetosOndeTrabalha proj " +
            ") " +
            "ORDER BY e.cpf")
    List<EmpregadoDeptDTO> search2();

}
