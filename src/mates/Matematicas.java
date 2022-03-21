/*Copyright [2022] [Enrique Collado Muñoz]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
either express or implied. See the License for the specific
language governing permissions and limitations under the
License.*/

package mates;
import java.util.*;
import java.util.stream.*;
public class Matematicas{
/**
* Genera una aproximación al número pi mediante el método de
* Montecarlo.
* El parámetro ` pasos` indica el número de puntos
* generado.
*/
public static double generarNumeroPiIterativo(long pasos){
	/**
         * @author Enrique Collado
         * @param pasos numero de puntos generado
         * @return  devuelve un numero double que se aproxima a PI
         */

	int aciertos = 0;//numero de puntos dentro del circulo
	double pi = 0;
	double x = 0;
	double y = 0;
		for(int i =0; i<=pasos;i++){//recorres todos los puntos para comprobar cuales estan dentro del circulo
			x = Math.random();
			y = Math.random();
			if((x*x) + (y*y) <= 1){
				aciertos++;
			}
		}
	pi = 4*((double)aciertos/pasos);
	return pi;
}
public static double generarNumeroPiRecursivo(int n,int d,double contador){
        /**
         *@param n corresponde al numero de puntos que quedan por generar
         *@param d numero de puntos generado
         *@param contador numero de puntos (aciertos) que estan dentro del circulo
         *@return devuelve la aproximacion de pi
         * */
        if( n==0){
                return  4*contador/(double)d;

        }else{
               double x = Math.random();
               double  y = Math.random();
                if((x*x) + (y*y) <= 1){
                return generarNumeroPiRecursivo(n-1,d+1,contador+1);
        }else{
                return generarNumeroPiRecursivo(n-1,d+1,contador);
        }
}
}
public static double generarNumeroPiLambda(int puntos){
        /**
         *@author Enrique Collado
         *@param puntos es el numero de puntos generado
         *@return devueve la aproximacion del numero pi
         */
        Random x = new Random();

        long puntosDentro = IntStream.range(0,puntos).filter(i -> (Math.pow(x.nextDouble(),2) + Math.pow(x.nextDouble(),2)) <=1).count();

        return (double)4*puntosDentro/puntos;
}


}

