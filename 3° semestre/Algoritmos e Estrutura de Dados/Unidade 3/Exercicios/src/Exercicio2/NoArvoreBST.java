package Exercicio2;

import Exercicio1.NoArvoreBinaria;

public class NoArvoreBST<T extends Comparable<T>> extends NoArvoreBinaria<T> {

    public NoArvoreBST(T info) {
        super(info);
    }

    public void inserir(T info) {
        if (info.compareTo(this.getInfo()) < 0) {
            if (this.getEsq() == null) {
                this.setEsq(new NoArvoreBST<T>(info));
            } else {
                ((NoArvoreBST<T>)this.getEsq()).inserir(info);
            }
        } else {
            if (this.getDir() == null) {
                this.setDir(new NoArvoreBST<T>(info));
            } else {
                ((NoArvoreBST<T>)this.getDir()).inserir(info);
            }
        }
    }

    public NoArvoreBST<T> buscar(T info) {
        if (info.equals(this.getInfo())) {
            return this;
        } else {
            if (info.compareTo(this.getInfo()) < 0) {
                if (this.getEsq() == null) {
                    return null;
                }
                return ((NoArvoreBST<T>)this.getEsq()).buscar(info);
            } else {
                if (this.getDir() == null) {
                    return null;
                }
                return ((NoArvoreBST<T>)this.getDir()).buscar(info);
            }
        }
    }

    public void retirar(NoArvoreBST<T> raiz, T info) {
        if (info.compareTo(this.getInfo()) == 0) {

        } else if (info.compareTo(this.getInfo()) < 0) {
            this.retiarEsq(info);
        } else {
            this.retirarDir(info);
        }
    }

    public void retiarEsq(T info) {

    }

    public void retirarDir(T info) {

    }

    public String imprime() {
        String str = "<";

        if (this.getInfo() != null) {
            str += this.getInfo().toString();
        }

        if (this.getEsq() != null) {
            str += ((NoArvoreBST<T>)this.getEsq()).imprime();
        } else if (this.getEsq() == null && this.getDir() != null) {
            str += "<>";
        } else {
            str += "";
        }

        if (this.getDir() != null) {
            str += ((NoArvoreBST<T>)this.getDir()).imprime();
        } else if (this.getDir() == null && this.getEsq() != null) {
            str += "<>";
        } else {
            str += "";
        }

        return str += ">";
    }
}
