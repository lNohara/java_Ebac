package br.com.lnohara.mod12;

public class Aula01 {

    public static void main(String[] args) {
        declaracaoArray();
        tamanhoArray();
        percorrendoArray1();
        percorrendoArray2();
        arrayBidimensional();
    }

    private static void declaracaoArray(){
        System.out.println("***** declaracaoArray *****");

        //[] - são inseridos em uma variável que referencia um array
        int[] a = new int[4];
        System.out.println("A = " + a);

        //outra maneira
        int[] b;
        b = new int[10];
        System.out.println("B = " + b);

        // Declarando vários arrays
        int[] r = new int[44], k = new int[23];
        System.out.println("R = " + r);
        System.out.println("K = " + k);

        //{} inicializar valores de um array na declaração
        int[] iniciaValores = {12, 32, 54, 6, 8, 89, 64, 64, 6};
        System.out.println("iniciaValores = " + iniciaValores[2]);

        //declara um array de inteiros
        int[] meuArray;

        //ALOCA MEMÓRIA PARA 10 INTEIROS;
        meuArray = new int[10];

        //INICIA O PRIMEIRO ELEMENTO
        meuArray [0] = 100;
        //INICIALIZANDO OUTRAS POSIÇÕES
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;

        System.out.println("meuArray[0] " + meuArray[0]);
        System.out.println("meuArray[4] " + meuArray[4]);
    }

    private static void tamanhoArray(){
        System.out.println("***** tamanhoArray *****");
        int[] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
        int[] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45};

        if (arrayDois.length > 8){
            System.out.println("Tamano do ArrayDois - Maior que 8!");
        } else {
            System.out.println("Tamanho do ArrayDois - Menor que 8!");
        }

        System.out.println("**");
        System.out.println("Tamanho do ArrayUm = " + arrayUm.length);
        System.out.println("**");

        if(arrayDois.length > arrayUm.length){
            System.out.println("ArrauDois é maior");
        } else if (arrayDois.length < arrayUm.length){
            System.out.println("ArrauDois é menor");
        } else {
            System.out.println("Ambos arrays tem o mesmo tamaho");
        }
    }

    private static void percorrendoArray1(){
        System.out.println("***** percorrendoArray1 *****");
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;

        //ADICIONA O VALOR DE CARA ELEMENTO AO TOTAL
        for (int i : arrayNum){
            total += i;
        }

        System.out.println("1- Soma dos elementos arrayNyum: " + total);
    }
    private static void percorrendoArray2(){
        System.out.println("***** percorrendoArray2 *****");
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;
        for (int i = 0; i < arrayNum.length; i++){
            System.out.println(arrayNum[i]);
            total += arrayNum[i];
        }
        System.out.println("2- Soma dos elementos arrayNyum: " + total);
    }

    public static void outputArray(int [][] array){
        //FAZ UM LOOP PELAS LINHAS DO ARRAY
        for(int linha = 0; linha < array.length; linha ++){
            //FAZ UM LOOP PELAS COLUNAS DA LINHA ATUAL
            for(int coluna = 0; coluna < array[linha].length; coluna++){
                System.out.println(array[linha][coluna]);
            }
            System.out.println();
        }
    }

    private static void arrayBidimensional(){
        System.out.println("***** arrayBidimensional ****");
        int [][] array1 = {{1,2,3}, {4,5,6}};
        int [][] array2 = {{1,2}, {3}, {4,5,6}};

        System.out.print("Valores no array1 passado na linha são: ");
        outputArray(array1);

        System.out.print("Valores no array2 passados na linha são: ");
        outputArray(array2);
    }
}
