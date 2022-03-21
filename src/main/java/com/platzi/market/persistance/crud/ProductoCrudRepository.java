package com.platzi.market.persistance.crud;

import com.platzi.market.persistance.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    @Query(value = "SELECT * FROM Productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> getByIdCategoriaQuery(int idCategoria);
}
