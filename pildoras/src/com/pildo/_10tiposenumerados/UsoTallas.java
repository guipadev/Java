package com.pildo._10tiposenumerados;

public class UsoTallas {

     enum Talla {

         MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
    	 
         private String abreviatura;

         private Talla(String abreviatura) {
             this.abreviatura = abreviatura;
         }

         public String dameAbreviatura() {
            return abreviatura;
         }
         
         
     }

}
