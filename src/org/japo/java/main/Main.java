/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
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
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
//      Constantes
        final char L_MIN = 'A';
        final char L_MAX = 'Z';
        final int N_MIN = 0;
        final int N_MAX = 6;
//      Variables
        int n;

//      Estado inicial (luego añadiremos ++ para aumentar el contador)
        n = N_MIN;
        System.out.print("Password ....: ");

        do {
            char c = (char) (RND.nextInt(L_MAX - L_MIN + 1) + L_MIN);
            n++;
            System.out.print(c);
            
        } while (n < N_MAX);
        System.out.printf("%nEND%n");
    }
}
