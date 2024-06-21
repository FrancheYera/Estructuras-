package com.example;

public class listaDoble<T> {
    listaDobleNodo<T> head, tail;

    public listaDoble() {
        this.head = this.tail = null;
    }

    public void add(T data) {
        listaDobleNodo<T> newNodo = new listaDobleNodo<>(data);
        if (head == null) {
            head = tail = newNodo;
        } else {
            tail.next = newNodo;
            newNodo.prev = tail;
            tail = newNodo;
        }
    }

    public void edit(T vData, T nData) {
        listaDobleNodo<T> act = head;
        while (act != null) {
            if (act.data.equals(vData)) {
                act.data = nData;
                return;
            }
            act = act.next;
        }
    }

    public void delete(T data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }

        listaDobleNodo<T> act = head;
        while (act.next != null) {
            if (act.next.data.equals(data)) {
                act.next = act.next.next;
                if (act.next != null) {
                    act.next.prev = act;
                } else {
                    tail = act;
                }
                return;
            }
            act = act.next;
        }
    }

    private static class listaDobleNodo<T> {
        T data;
        listaDobleNodo<T> next, prev;

        listaDobleNodo(T data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }
}