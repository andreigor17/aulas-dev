/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.irontech.generico;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author andre
 */
public class ServicoGenerico<T> {

    private Class<T> entity;

    private static EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("PhbChampPU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void close(EntityManager em) {
        em.close();
    }


//    @PersistenceContext(unitName = "PhbChampPU")
//    EntityManager entityManager;

    public ServicoGenerico(Class<T> entity) {
        this.entity = entity;

    }

    public Class<T> getEntity() {
        return entity;
    }

    public void setEntity(Class<T> entity) {
        this.entity = entity;
    }

//    public EntityManager getEntityManager() {
//        return entityManager;
//    }
//
//    public void setEntityManager(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }

    
    public void save(T entity) {
        getEntityManager().persist(entity);
    }

    public void delete(T entity) {
//        update(entity);

        T entityToBeRemoved = getEntityManager().merge(entity);
        getEntityManager().remove(entityToBeRemoved);
    }

    public void remove(T entity) {
        update(entity);
    }

    public void update(T entity) {
        getEntityManager().merge(entity);
        getEntityManager().flush();
    }

    public T find(Long entityID) {
        T objeto = getEntityManager().find(entity, entityID);
        getEntityManager().refresh(objeto);
        return objeto;
    }

    public List<T> findAll() {
        return getEntityManager().createQuery("select e from " + entity.getSimpleName() + " e where e.ativo = true").getResultList();
    }


}
