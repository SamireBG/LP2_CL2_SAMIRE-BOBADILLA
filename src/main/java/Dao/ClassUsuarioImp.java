package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interface.InterfaceUsuariocl2;
import model.TblUsuariocl2;

public class ClassUsuarioImp implements InterfaceUsuariocl2{

	@Override
	public void RegistrarUsuario(TblUsuariocl2 usuario) {
		
		//establecer la cadena de conexion con la unidad de persistencia
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LP2_CL2_SAMIRE-BOBADILLA");
		//gestionar las entidades
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(usuario);
		//emitimos mensaje por consola
		System.out.print("Usuario registrado en la BD");
		//configuramos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
		
		
		
	}//fin del metodo registar

	@Override
	public List<TblUsuariocl2> ListadoUsuario() {
		
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LP2_CL2_SAMIRE-BOBADILLA");
		//gestionar las entidades
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos el listado de cliente de la BD
		//aplicamos consultas JPQL, el metodo createquery(), sirve para hacer consultas dinamicas
		List<TblUsuariocl2> listado=em.createQuery("select c from TblUsuariocl2 c",TblUsuariocl2.class).getResultList();
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		//recuperamos el cliente buscado de la BD
		return listado;
		
		
		
	}//fin del metodo listar

}// fin de la clase
