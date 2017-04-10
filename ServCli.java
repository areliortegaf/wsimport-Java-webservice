/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servcli;


public class ServCli {

   public static void main(String[] args) {
                //se crea objeto del servicio web
		ServWebService servicio = new ServWebService();
                //se busca el metodo del puerto
		Mensaje mensaje = servicio.getServWebPort();

		System.out.println(mensaje.metodoWeb("Hecho!"));
    
}
}
