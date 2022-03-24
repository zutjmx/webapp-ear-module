package org.zutjmx.webapp.ear.ejb.repositories;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.zutjmx.webapp.ear.ejb.entities.Usuario;

import java.util.List;

@RequestScoped
public class UsuarioRepositoryImpl implements UsuarioRepository{

    @Inject
    private EntityManager entityManager;

    @Override
    public List<Usuario> listar() {
        return entityManager
                .createQuery("from Usuario",Usuario.class)
                .getResultList();
    }
}
