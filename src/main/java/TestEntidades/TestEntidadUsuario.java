package TestEntidades;

import java.util.List;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl2;

public class TestEntidadUsuario {

	public static void main(String[] args){
		//hacemos la respectiva instancia
		TblUsuariocl2 usuario = new TblUsuariocl2();
		ClassUsuarioImp crud = new ClassUsuarioImp();
		
		//asignamos valores
		/*-------------------- U N O ---------- R E G I S T R O S --------------------*/
			
		/*
						
		//--- I N S E R T A R --- D A T O S ---
						
		usuario.setUsuariocl2("Admin07");
		usuario.setPasswordcl2("sdfasd");
						
		//--- I N V O C A M O S --- M E T O D O ---
						
		crud.RegistrarUsuario(usuario);
			
		*/
				
		/*-------------------- F I N ---------- R E G I S T R O S --------------------*/

				
				
				
				
				
				
		/*-------------------- U N O ---------- L I S T A R --------------------*/
				
				
			//--- I N V O C A M O S --- M E T O D O --- L I S T A R ---
		
				
			List<TblUsuariocl2> listadousu=crud.ListadoUsuario();
			//--- A P L I C A M O S --- B U C L E --- F O R ---
			for(TblUsuariocl2 listar:listadousu){
							
			//--- I M P R I M I M O S --- L O S --- D A T O S ---
					
			System.out.print(
				"-----------------------------------------------" + "\n\n" +
				"-------------------- U N O --------------------" + "\n\n" +
				"Codigo" + "\t\t: "+listar.getIdusuario()+ "\n" +
				"Nombre" + "\t\t: "+listar.getUsuariocl2()+ "\n" +
				"Descripcion" + "\t: "+listar.getPasswordcl2()+ "\n\n" +
				"-------------------- F I N --------------------" + "\n\n");
			}
						
			
						
		/*-------------------- F I N ---------- L I S T A R --------------------*/		
				
	}//fin del metodo main

}//fin de la clase
