package br.edu.exemplo;

public class BubbleSort {

    private int[] numeros;

    public BubbleSort(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("O vetor não pode ser nulo.");
        }
        this.numeros = numeros;
    }

    public void ordenar() {
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean trocou = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temporario = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporario;
                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }
    }

    public int[] getNumeros() {
        return numeros;
    }
}
