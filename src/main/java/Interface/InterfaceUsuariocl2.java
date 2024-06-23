package Interface;

import java.util.List;

import model.TblUsuariocl2;

public interface InterfaceUsuariocl2 {

public void RegistrarUsuario(TblUsuariocl2 usuario);
public List<TblUsuariocl2> ListadoUsuario();
public TblUsuariocl2 ValidarUsuario(String usuario, String contraseña);
	
}//fin de la interface
