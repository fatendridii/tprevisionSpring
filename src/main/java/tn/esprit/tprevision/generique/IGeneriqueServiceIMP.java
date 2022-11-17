package tn.esprit.tprevision.generique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class IGeneriqueServiceIMP<T,ID> implements IGeneriqueService<T,ID>{
    @Autowired
    JpaRepository<T,ID> jpaRepository;


    @Override
    public T add(T entity) {
        return jpaRepository.save(entity);
    }

    @Override
    public T update(T entity) {
        return jpaRepository.save(entity);
    }

    @Override
    public T getById(ID idEtud) {
        return jpaRepository.findById(idEtud).orElse(null);
    }

    @Override
    public List<T> getAll() {
        return jpaRepository.findAll();
    }

    @Override
    public void remove(ID idEtud) {
         jpaRepository.deleteById(idEtud);
    }



}
