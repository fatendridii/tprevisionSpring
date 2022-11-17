package tn.esprit.tprevision.generique;

import java.util.List;

public interface IGeneriqueService<T,ID> {
    public T add(T entity);
    public T update(T entity);
    public T getById(ID idEtud);
    public List<T> getAll();
    public void remove(ID idEtud);

}
