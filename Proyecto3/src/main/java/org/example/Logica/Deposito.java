package org.example.Logica;

import java.util.ArrayList;
/**
 * Clase genérica de tipo T para representar Deposito de dulces y bebidas.
 * Utiliza una lista interna para almacenar y recuperar elementos.
 *
 * @param <T> el tipo de objetos que este depósito contendrá.
 */
public class Deposito<T>{
    private ArrayList<T> dep;

    public Deposito(){
        dep = new ArrayList<T>();
    }

    /**
     * Agrega un objeto al deposito.
     *
     * @param cosa es el objeto de tipo T que se desea agregar.
     */
    public void addCosa(T cosa){
        dep.add(cosa);
    }

    /**
     * Retorna el primer objeto del depósito.
     *
     * @return el primer objeto almacenado, o {@code null} si deposito es vacío.
     */
    public T getCosa() {
        if (dep.isEmpty()) {
            return null;
        }
        return dep.removeFirst();
    }

    public T verCosa(){
        if (dep.isEmpty()) {
            return null;
        }
        return dep.getFirst();
    }

    public int size(){
        return dep.size();
    }

    public int calcularTotalValor() {
        int total = 0;
        for (T objeto : dep) {
            if (objeto instanceof Moneda) {
                total += ((Moneda) objeto).getValor();
            }
        } return total;
    }

}
