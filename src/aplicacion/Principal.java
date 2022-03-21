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


package aplicacion;

import mates.Matematicas;

public class Principal{
 	public static void main(String[] args){
		System.out.println("El número PI es " + Matematicas.generarNumeroPiIterativo(Integer.parseInt(args[0])));
		System.out.println("numero pi recur" + Matematicas.generarNumeroPiRecursivo(Integer.parseInt(args[0]),0,0.0));
                System.out.println("EL numero PI con lambda " + Matematicas.generarNumeroPiLambda(Integer.parseInt(args[0])));

}
}
