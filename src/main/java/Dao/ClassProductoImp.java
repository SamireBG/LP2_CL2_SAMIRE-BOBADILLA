package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interface.InterfaceProductocl2;
import model.TblProductocl2;

public class ClassProductoImp implements InterfaceProductocl2{

	@Override
	public void RegistrarProductos(TblProductocl2 producto) {
		
		//establecer la cadena de conexion con la unidad de persistencia
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LP2_CL2_SAMIRE-BOBADILLA");
		//gestionar las entidades
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(producto);
		//emitimos mensaje por consola
		System.out.print("Producto registrado en la BD");
		//configuramos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
		
		
		
	}//fin del metodo registrar

	@Override
	public List<TblProductocl2> ListadoProducto() {
		
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LP2_CL2_SAMIRE-BOBADILLA");
		//gestionar las entidades
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos el listado de cliente de la BD
		//aplicamos consultas JPQL, el metodo createquery(), sirve para hacer consultas dinamicas
		List<TblProductocl2> listado=em.createQuery("select c from TblProductocl2 c",TblProductocl2.class).getResultList();
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		//recuperamos el cliente buscado de la BD
		return listado;
		
		
	}//fin del metodo listar

}// fin de la clase
