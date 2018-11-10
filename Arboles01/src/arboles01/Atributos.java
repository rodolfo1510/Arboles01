/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles01;

/**
 *
 * @author Alexis
 */
public class Atributos {
      
    private   String name;
    private  String familia;
    private  String suelo;
    private String zona;
       
         public  Atributos(){
            
        }
        public  Atributos(String name, String familia, String suelo, String zona){
            this.name=name;
            this.familia=familia;
            this.suelo=suelo;
            this.zona=zona;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getSuelo() {
        return suelo;
    }

    public void setSuelo(String suelo) {
        this.suelo = suelo;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
        
}
