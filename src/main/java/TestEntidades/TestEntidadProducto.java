package TestEntidades;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {
	
	public static void main(String[] args){
		//hacemos la respectiva instancia
		TblProductocl2 producto = new TblProductocl2();
		ClassProductoImp crud = new ClassProductoImp();
		
		//asignamos valores
		/*-------------------- U N O ---------- R E G I S T R O S --------------------*/
			
		/*
						
		//--- I N S E R T A R --- D A T O S ---
						
		producto.setNombrecl2("Laptop-ASUS");
		producto.setPrecioventacl2(2500);
		producto.setPreciocompcl2(2500);
		producto.setEstadocl2("Operativa");
		producto.setDescripcl2("Una buena laptop");
						
		//--- I N V O C A M O S --- M E T O D O ---
						
		crud.RegistrarProductos(producto);
			
		*/
				
		/*-------------------- F I N ---------- R E G I S T R O S --------------------*/

				
				
				
				
				
				
		/*-------------------- U N O ---------- L I S T A R --------------------*/
				
				
					//--- I N V O C A M O S --- M E T O D O --- L I S T A R ---
						
					List<TblProductocl2> listadoprod=crud.ListadoProducto();
						//--- A P L I C A M O S --- B U C L E --- F O R ---
					for(TblProductocl2 listar:listadoprod){
							
					//--- I M P R I M I M O S --- L O S --- D A T O S ---
							
					System.out.print(
						"-----------------------------------------------" + "\n\n" +
						"-------------------- U N O --------------------" + "\n\n" +
						"Codigo" + "\t\t: "+listar.getIdproductocl2()+ "\n" +
						"Nombre" + "\t\t: "+listar.getNombrecl2()+ "\n" +
						"P. de venta" + "\t: "+listar.getPrecioventacl2()+ "\n" +
						"P. de compra" + "\t: "+listar.getPreciocompcl2()+ "\n" +
						"Estado" + "\t\t: "+listar.getEstadocl2()+ "\n" +
						"Descripcion" + "\t: "+listar.getDescripcl2()+ "\n\n" +
						"-------------------- F I N --------------------" + "\n\n");
					}
						
				
						
		/*-------------------- F I N ---------- L I S T A R --------------------*/		
				
	}//fin del metodo main

}//fin de la clase
