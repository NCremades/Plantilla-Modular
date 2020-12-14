/*
 * Copyright 2020 Noelia Cremades Gómez - noelia.cremades.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.library;

/**
 *
 * @author Noelia Cremades Gómez - noelia.cremades.alum@iescamp.es
 */
public class UtilesAritmeticos {

    //SUMA
    public static final int suma(int n1, int n2) {
        return n1 + n2;
    }

    //RESTA
    public static final int resta(int n1, int n2) {
        return n1 - n2;
    }

    //MULTIPLICACION
    public static final int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }

    //DIVISIÓN 
    public static final int division(int n1, int n2) {
        return n1 / n2;
    }

    //CALCULAR MAYOR
    public static final double calcularMayor(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

}
