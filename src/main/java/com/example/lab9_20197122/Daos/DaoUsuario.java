package com.example.lab9_20197122.Daos;

import com.example.lab9_20197122.Beans.Licencia;
import com.example.lab9_20197122.Beans.Pais;
import com.example.lab9_20197122.Beans.Rol;
import com.example.lab9_20197122.Beans.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoUsuario extends DaoBase {
    public ArrayList<Usuario> listarUsuarios(){
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        String sql = "select * from usuario u join rol r on u.rol_idrol = r.idrol join licencia l on licencia_idlicencia = idlicencia join pais p on pais_idpais = idpais";

        try(Connection conn = getConection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){
                Usuario usuario = new Usuario();
                Rol rol = new Rol();
                Licencia licencia = new Licencia();
                Pais pais = new Pais();
                usuario.setIdUsuario(rs.getString(1));
                usuario.setNombres(rs.getString(2));
                usuario.setApellidos(rs.getString(3));
                usuario.setTelefono(rs.getString(4));
                //Rol
                rol.setIdRol(rs.getString(7));
                rol.setNombre_rol(rs.getString(8));
                //Licencia
                licencia.setIdLicencia(rs.getString(9));
                licencia.setCategoria(rs.getString(10));
                licencia.setFrecha_emision(rs.getString(11));
                licencia.setFecha_caducidad(rs.getString(12));
                //Pais
                pais.setIdPais(rs.getString(14));
                pais.setNombre_pais(rs.getString(15));
                //
                usuario.setRol(rol);
                usuario.setLicencia(licencia);
                usuario.setPais(pais);


                listaUsuarios.add(usuario);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaUsuarios;
    }
}
