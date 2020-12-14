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

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Noelia Cremades Gómez - noelia.cremades.alum@iescamp.es
 */
public class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    
    //ENTRADA ENTERO
    public static final int obtenerEntero(String msgUsr, String msgErr) {
        int dato = 0;
        boolean entradaOK = false;

        do {
            try {
                System.out.print(msgUsr);
                dato = SCN.nextInt();
                entradaOK = true;
            } catch (Exception e) {
                System.out.print(msgErr);

            } finally {
                SCN.nextLine();
            }
        } while (!entradaOK);

        return dato;
    }
    
    //ENTRADA REAL 
    public static final double obtenerReal(String msgUsr, String msgErr) {
        double dato = 0;
        boolean entradaOK = false;

        do {
            try {
                System.out.print(msgUsr);
                dato = SCN.nextDouble();
                entradaOK = true;
            } catch (Exception e) {
                System.out.print(msgErr);

            } finally {
                SCN.nextLine();
            }
        } while (!entradaOK);

        return dato;
    }

    //ENTRADA LÓGICO
    public static final boolean obtenerLogico(String msgUsr, String msgErr) {
        boolean dato = false;
        boolean entradaOK = false;

        do {
            try {
                System.out.print(msgUsr);
                dato = SCN.nextBoolean();
                entradaOK = true;
            } catch (Exception e) {
                System.out.print(msgErr);

            } finally {
                SCN.nextLine();
            }
        } while (!entradaOK);

        return dato;

    }

    //ENTRADA CARACTER 
    public static final char obtenerCaracter(String msgUsr, String msgErr) {

        char dato = (char) 0;
        boolean entradaOK = false;

        do {
            try {
                System.out.print(msgUsr);
                dato = SCN.nextLine().charAt(0);
                entradaOK = true;
            } catch (Exception e) {
                System.out.print(msgErr);
            }
        } while (!entradaOK);

        return dato;
    }

    public static final String obtenerTexto(String msgUsr, String msgErr) {

        System.out.print(msgUsr);
        return SCN.nextLine();
    }

}
