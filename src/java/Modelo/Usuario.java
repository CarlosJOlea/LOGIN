
package Modelo;

/**
 *
 * @author Carlos
 */
public class Usuario {
  int Perfiles_idPerfiles;
  String  Nombre, Usuario, Clave, correo, imagenperfil,puesto;

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

  // Contructor de la clase 
    public Usuario() {}

    public int getPerfiles_idPerfiles() {
        return Perfiles_idPerfiles;
    }

    public void setPerfiles_idPerfiles(int Perfiles_idPerfiles) {
        this.Perfiles_idPerfiles = Perfiles_idPerfiles;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getImagenperfil() {
        return imagenperfil;
    }

    public void setImagenperfil(String imagenperfil) {
        this.imagenperfil = imagenperfil;
    }
    
}
