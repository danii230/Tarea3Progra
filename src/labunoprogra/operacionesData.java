/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labunoprogra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniela
 */
public class operacionesData {
    
  private List listaUno;
  private List listaDos;
  private List listaTres;
  private List listaCuatro;
  private List listaCinco;

  

    public operacionesData() {
     
        this.listaUno = new ArrayList();
        this.listaDos = new ArrayList();
        this.listaTres = new ArrayList();
        this.listaCuatro = new ArrayList();
        this.listaCinco = new ArrayList();
        
    }
    
   
    public void llenaListas(){
    
    listaUno.add(1,"pera");
    listaUno.add(2, "manzana");
    listaUno.add(3,"limon");
    listaUno.add(4, "melon");
    listaUno.add(5, "naranja");
    
    listaDos.add(1,"pera");
    listaDos.add(2, "melon");
    listaDos.add(3,"naranja");
    listaDos.add(4, "limon");
    listaDos.add(5, "manzana");
    
    listaTres.add(1,"melon");
    listaTres.add(2, "manzana");
    listaTres.add(3,"naranja");
    listaTres.add(4, "limon");
    listaTres.add(5, "pera");
    
    listaCuatro.add(1,"melon");
    listaCuatro.add(2, "manzana");
    listaCuatro.add(3,"naranja");
    listaCuatro.add(4, "limon");
    listaCuatro.add(5, "pera");
    
    listaCinco.add(1,"melon");
    listaCinco.add(2, "manzana");
    listaCinco.add(3,"naranja");
    listaCinco.add(4, "limon");
    listaCinco.add(5, "pera");
    
    listaUno.add(listaDos);
    listaDos.add(listaTres);
    listaTres.add(listaCuatro);
    listaCuatro.add(listaCinco);
    
    
    
    }
    
    public String sumar (String frutaUno, String frutaDos){
        
       String resultado;
       List temp = new ArrayList();
       
       
       return resultado; 
    }
    
    
  
        
    }
    
    

