package org.nullObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        List<Livro> lista = new LinkedList<>(){
            {
                add(new Livro("Java Definitivo", "Avner Caleb", 2023));
                add(new Livro("Angular Definitivo", "Isadora Lima", 2025));
                add(new Livro("C# Definitivo", "Camila Santos", 2028));
            }

        };

        lista.set(1, new Livro("API's Java", "Avner Caleb", 2021));
        Collections.sort(lista, new LivrosPorAno());
        lista.forEach(System.out::println);
    }
}
