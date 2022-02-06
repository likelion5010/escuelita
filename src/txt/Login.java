
package txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author INGESIS
 */
public class Login {
   
   public void comprobarBd(File FicheroProducto){
        try
      {
        
        if(!FicheroProducto.exists()){
            FicheroProducto.createNewFile();
            System.out.println("Base de datos de productos creada se insertara el producto");
        }else{System.out.println("La base de datos de productos existe");}
       }catch (Exception ex) 
       {  
          System.out.println(ex.getMessage());  
       }
     }
   public void InsertarProductos(String usuario,String password,String id,String grado,String nombre, String apellido, File FicheroProducto){
         try
      {  

          BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FicheroProducto,true), "utf-8"));  
          Fescribe.write(usuario+";"+password+";"+id+";"+grado+";"+nombre+";"+apellido+"\r\n");  
           System.out.println("El producto a sido insertado en la base de datos");            
          Fescribe.close();
          
        }
        catch (IOException ex) 
       {    
          System.out.println(ex.getMessage());  
       }
      } 
   public void DetxtAestudiante(File FicheroProducto, ArrayList<usuario> usuarios)
     {
        try
        {
         String linea = null;
         BufferedReader leerFichero = new BufferedReader (new FileReader(FicheroProducto));    
         while( (linea = leerFichero.readLine()) != null)
         {
            StringTokenizer mistokens = new StringTokenizer(linea, ";");
            String  usuario =  mistokens.nextToken().trim();
            String  password =  mistokens.nextToken().trim();
            String  id =  mistokens.nextToken().trim();
            String  grado =  mistokens.nextToken().trim();
            String  nombre =  mistokens.nextToken().trim();
            String  apellido =  mistokens.nextToken().trim();
            
            
            usuario aux= new usuario(nombre, apellido, id, grado, usuario, password);

            usuarios.add(aux);
            
            }
         leerFichero.close();
       
       }catch (Exception ex) 
       {  
          System.out.println(ex.getMessage());  
       }
      }     
   public void ActualizarArraList(File FicheroProducto, ArrayList<usuario> usuarios)
   {
	  usuarios.clear();
      DetxtAestudiante(FicheroProducto,usuarios); 
   }
   public void MostrarObjetos(File FicheroProducto, ArrayList<usuario> usuarios)
   {
  if( usuarios.size()==0){DetxtAestudiante(FicheroProducto,usuarios);}
  System.out.println("=========================== Articulo=========================================================================================================================================================================================");     
  for(usuario n:usuarios)
  {
   System.out.println("Usuario:"+n.getUsuario()+"\t"+"Password:"+n.getPassword()+"\t"+"Id:"+n.getId()+"\t"+ "Grado:"+ n.getGrado()+"\t"+ "Nombre:"+ n.getNombre()+"\t"+ "Apellido:"+ n.getApellido());
  }  
  System.out.println("============================FIN==============================================================================================================================================================================================");
}
}
