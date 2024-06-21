package com.example;

public class listaSimple<T> {
    listaSimpleNodo<T> top;

    public listaSimple() {
        this.top = null;
    }

    public void add(T data) {
        listaSimpleNodo<T> newNodo = new listaSimpleNodo<>(data);
        if (top == null) {
            top = newNodo;
        } else {
            listaSimpleNodo<T> act = top;
            while (act.next != null) {
                act = act.next;
            }
            act.next = newNodo;
        }
    }

    public void edit(T vData, T nData) {
        listaSimpleNodo<T> act = top;
        while (act != null) {
            if (act.data.equals(vData)) {
                act.data = nData;
                return;
            }
            act = act.next;
        }
    }

    public void delete(T data) {
        if (top == null) return;

        if (top.data.equals(data)) {
            top = top.next;
            return;
        }

        listaSimpleNodo<T> act = top;
        while (act.next != null) {
            if (act.next.data.equals(data)) {
                act.next = act.next.next;
                return;
            }
            act = act.next;
        }
    }

    private static class listaSimpleNodo<T> {
        T data;
        listaSimpleNodo<T> next;

        listaSimpleNodo(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
