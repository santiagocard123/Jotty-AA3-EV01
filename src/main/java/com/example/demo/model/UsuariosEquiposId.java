package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

public class UsuariosEquiposId implements Serializable {
    private int usuario;
    private int equipo;


    public UsuariosEquiposId() {}


    public UsuariosEquiposId(int usuario, int equipo) {
        this.usuario = usuario;
        this.equipo = equipo;
    }


    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuariosEquiposId that = (UsuariosEquiposId) o;
        return usuario == that.usuario && equipo == that.equipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, equipo);
    }
}
