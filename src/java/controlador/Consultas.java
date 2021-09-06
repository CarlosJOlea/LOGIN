package controlador;

import Modelo.Usuario;
import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import controlador.Conexion;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class Consultas extends Conexion{
    
    
    public boolean autenticacion(String usuario, String Contraseña) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean accion = false;

        try {
            String consulta = "SELECT * FROM paegdldb.usuarios where Usuario =? and clave =?;";

            pst = getConnection().prepareStatement(consulta, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, usuario);
            pst.setString(2, Contraseña);
            rs = pst.executeQuery();

            if (rs.absolute(1)) {
                accion = true;
            }

        } catch (SQLException e) {
            System.err.println("Error" + e);
        } finally {
            try {
                if (getConnection() != null) {
                    getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("Error" + e);
            }

        }

        return accion;
    }

    public static Usuario datosUsuario(String usuario, String Contraseña) {

        Usuario user = new Usuario();
        Conexion con = new Conexion();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {

            String consulta = "SELECT Perfiles_idPerfiles,Nombre, Usuario, Clave,  imagenperfil, puesto FROM paegdldb.usuarios where Usuario =? and clave =?;";

            pst = con.getConnection().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, Contraseña);
            rs = pst.executeQuery();
            if (rs.next()) {
                user.setPerfiles_idPerfiles(rs.getInt(1));
                user.setNombre(rs.getString(2));
                user.setUsuario(rs.getString(3));
                user.setClave(rs.getString(4));
                user.setImagenperfil(rs.getString(5));
                user.setPuesto(rs.getString(6));
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
            System.out.println("error con los datos del user");
        } finally {
            try {
                if (con.getConnection() != null) {
                    con.getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("Error" + e);
            }

        }

        return user;
    }
 
    private static final byte[] key = {
        0x54, 0x68, 0x65, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4B, 0x65, 0x79, 0x49, 0x73, 0x48, 0x65
    };//"TheSecretKeyIsHe";

     public static String encrypt(String strToEncrypt) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            final SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            final String encryptedString = Base64.encodeBase64String(cipher.doFinal(strToEncrypt.getBytes()));
            return encryptedString;
        } catch (NoSuchAlgorithmException e) {
            System.out.println(""+e);
        } catch (NoSuchPaddingException e) {
              System.out.println(""+e);
        } catch (InvalidKeyException e) {
              System.out.println(""+e);
        } catch (IllegalBlockSizeException e) {
             System.out.println(""+e);
        } catch (BadPaddingException e) {
             System.out.println(""+e);
        }
        return null;
    }

}
