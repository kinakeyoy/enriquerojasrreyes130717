package modelo;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author KikeVostro
 */
public class ConexionModelo {    
    private static ConexionModelo conexion;
    private EntityManagerFactory fabricaConexion;
    private ConexionModelo(){
        fabricaConexion=Persistence.createEntityManagerFactory("enriquerojasrreyes130717PU");    
    }
    public static ConexionModelo getConexion ( ){
        if (conexion==null){
            conexion=new ConexionModelo();        
        }
        return conexion;    
    }
    public EntityManagerFactory getFabricaConexion( ){
        return fabricaConexion;    
    }
}
