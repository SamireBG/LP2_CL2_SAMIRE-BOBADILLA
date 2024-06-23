package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.ClassProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
	    if (session == null || session.getAttribute("usuario") == null) {
	        response.sendRedirect("login.jsp");
	        return;
	    }
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		
		List<TblProductocl2> listadoproducto=crud.ListadoProducto();
		//invocamos el listado de productos para la vista
		request.setAttribute("listadoproducto", listadoproducto);
		//redirecionamos
		request.getRequestDispatcher("/ListarProductos.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
	    if (session == null || session.getAttribute("usuario") == null) {
	        response.sendRedirect("login.jsp");
	        return;
	    }
		String nombre=request.getParameter("nombre");
		String pventa=request.getParameter("venta");
		String pcompra=request.getParameter("compra");
		String estado=request.getParameter("estado");
		String descripcion=request.getParameter("descripcion");
		
		Double venta = null;
		Double compra = null;
		try{
			venta=Double.parseDouble(pventa);
			compra=Double.parseDouble(pcompra);
		}
		catch(Exception e){
			e.fillInStackTrace();
			
			request.setAttribute("erroMessage", "Los valores de venta y compra deben ser n�meros v�lidos.");
			request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
	        return;
		}
		
		//instanciar las respectivas entidades
		TblProductocl2 productos=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		//asignamos valores
		productos.setNombrecl2(nombre);
		productos.setPrecioventacl2(venta);
		productos.setPreciocompcl2(compra);
		productos.setEstadocl2(estado);
		productos.setDescripcl2(descripcion);
		//invocamos al metodo registrar
		crud.RegistrarProductos(productos);
		
		List<TblProductocl2> listadoproducto=crud.ListadoProducto();
		//invocamos el listado de productos para la vista
		request.setAttribute("listadoproducto", listadoproducto);
		//redirecionamos
		request.getRequestDispatcher("/ListarProductos.jsp").forward(request, response);
		
		
	}

}
