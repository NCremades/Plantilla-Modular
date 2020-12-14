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

import java.util.Random;

/**
 *
 * @author Noelia Cremades Gómez - noelia.cremades.alum@iescamp.es
 */
public class UtilesAleatorio {

    public static final Random RND = new Random();

    //RND ENTERO
    public static final int obtenerAleatorioEntero(String msgUsr) {
        int valor = RND.nextInt();
        return valor;
    }

    //RND ENTERO CON MAX Y MIN
    public static final int obtenerAleatorioEnteroMaxMin(String msgUsrMaxMin) {
        int valorMax = 100;
        int valorMin = 0;
        int valor = RND.nextInt(valorMax - valorMin + 1) + valorMin;

        return valor;
    }

    //RND REAL 
    public static final double obtenerAletatorioReal(String msgUsrDouble) {
        double valor = RND.nextDouble();
        return valor;
    }

    //RND REAL CON MAX Y MIN
    public static final double obtenerAleatorioRealMaxMin(String msgUsrDoubleMaxMin) {
        double valorMax = 100;
        double valorMin = 0;
        double valor = RND.nextDouble() * (valorMax - valorMin) + valorMin;
        return valor;
    }

    //RND LOGICO
    public static final boolean obtenerAleatorioLogico(String msgUsrBoolean) {
        boolean valor = RND.nextBoolean();
        return valor;
    }

    //RND CARACTER
    public static final char obtenerAleatorioCaracter(String msgUsrChar) {
        char valorMax = (char) 1000;
        char valorMin = (char) 0;
        char valor = (char) (RND.nextInt(valorMax - valorMin + 1) + valorMin);
        return valor;
    }

}
