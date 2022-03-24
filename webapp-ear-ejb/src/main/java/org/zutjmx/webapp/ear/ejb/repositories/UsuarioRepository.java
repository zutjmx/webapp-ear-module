package org.zutjmx.webapp.ear.ejb.repositories;

import org.zutjmx.webapp.ear.ejb.entities.Usuario;

import java.util.List;

public interface UsuarioRepository {
    List<Usuario> listar();
}
