public class Main {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<>();

        NoArvore<Integer> no3 = new NoArvore<>(3);
        NoArvore<Integer> no4 = new NoArvore<>(4);
        no3.inserirFilho(no4);
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no2 = new NoArvore<>(2);
        no2.inserirFilho(no5);
        no2.inserirFilho(no3);

        NoArvore<Integer> no6 = new NoArvore<>(6);

        NoArvore<Integer> no10 = new NoArvore<>(10);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        no9.inserirFilho(no10);
        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        no7.inserirFilho(no9);
        no7.inserirFilho(no8);

        NoArvore<Integer> no1 = new NoArvore<>(1);
        no1.inserirFilho(no7);
        no1.inserirFilho(no6);
        no1.inserirFilho(no2);
        arvore.setRaiz(no1);

        arvore.getNivel(6);

        System.out.println("�rvore completa = " + arvore);
        System.out.println("Altura da �rvore = " + arvore.getAltura());
        System.out.println("1 = n�vel esperado: 0 | n�vel retornado: " + arvore.getNivel(1));
        System.out.println("2 = n�vel esperado: 1 | n�vel retornado: " + arvore.getNivel(2));
        System.out.println("3 = n�vel esperado: 2 | n�vel retornado: " + arvore.getNivel(3));
        System.out.println("4 = n�vel esperado: 3 | n�vel retornado: " + arvore.getNivel(4));
        System.out.println("5 = n�vel esperado: 2 | n�vel retornado: " + arvore.getNivel(5));
        System.out.println("6 = n�vel esperado: 1 | n�vel retornado: " + arvore.getNivel(6));
        System.out.println("7 = n�vel esperado: 1 | n�vel retornado: " + arvore.getNivel(7));
        System.out.println("8 = n�vel esperado: 2 | n�vel retornado: " + arvore.getNivel(8));
        System.out.println("9 = n�vel esperado: 2 | n�vel retornado: " + arvore.getNivel(9));
        System.out.println("10 = n�vel esperado: 3 | n�vel retornado: " + arvore.getNivel(10));

        System.out.println("�rvore balanceada = esperado: false | retornado: " + arvore.isBalanceada());
        System.out.println("Grau da �rvore = esperado: 3 | retornado: " + arvore.getGrau());
        arvore.excluir(9);
        System.out.println("Ap�s excluir 7 = " + arvore);
        arvore.mover(6, 5);
        System.out.println("Ap�s mover " + arvore);

        arvore.excluir(1);
        System.out.println(arvore);

        NoArvore<Integer> n9 = new NoArvore<Integer>(9);
        NoArvore<Integer> n10 = new NoArvore<Integer>(10);
        NoArvore<Integer> n4 = new NoArvore<Integer>(4);
        n4.inserirFilho(n10);
        n4.inserirFilho(n9);
        NoArvore<Integer> n8 = new NoArvore<Integer>(8);
        NoArvore<Integer> n3 = new NoArvore<Integer>(3);
        n3.inserirFilho(n8);
        NoArvore<Integer> n5 = new NoArvore<Integer>(5);
        NoArvore<Integer> n6 = new NoArvore<Integer>(6);
        NoArvore<Integer> n7 = new NoArvore<Integer>(7);
        NoArvore<Integer> n2 = new NoArvore<Integer>(2);
        n2.inserirFilho(n7);
        n2.inserirFilho(n6);
        n2.inserirFilho(n5);
        NoArvore<Integer> n1 = new NoArvore<Integer>(1);
        n1.inserirFilho(n4);
        n1.inserirFilho(n3);
        n1.inserirFilho(n2);
        Arvore<Integer> arvore2 = new Arvore<>();
        arvore2.setRaiz(n1);

        System.out.println();
        System.out.println("�rvore completa = " + arvore2);
        System.out.println("Altura da �rvore = " + arvore2.getAltura());
        System.out.println("1 = n�vel esperado: 0 | n�vel retornado: " + arvore2.getNivel(1));
        System.out.println("2 = n�vel esperado: 1 | n�vel retornado: " + arvore2.getNivel(2));
        System.out.println("3 = n�vel esperado: 1 | n�vel retornado: " + arvore2.getNivel(3));
        System.out.println("4 = n�vel esperado: 1 | n�vel retornado: " + arvore2.getNivel(4));
        System.out.println("5 = n�vel esperado: 2 | n�vel retornado: " + arvore2.getNivel(5));
        System.out.println("6 = n�vel esperado: 2 | n�vel retornado: " + arvore2.getNivel(6));
        System.out.println("7 = n�vel esperado: 2 | n�vel retornado: " + arvore2.getNivel(7));
        System.out.println("8 = n�vel esperado: 2 | n�vel retornado: " + arvore2.getNivel(8));
        System.out.println("9 = n�vel esperado: 2 | n�vel retornado: " + arvore2.getNivel(9));
        System.out.println("10 = n�vel esperado: 2 | n�vel retornado: " + arvore2.getNivel(10));

        System.out.println("�rvore balanceada = esperado: true | retornado: " + arvore2.isBalanceada());
        System.out.println("Grau da �rvore = esperado: 3 | retornado: " + arvore2.getGrau());

        Arvore<Integer> arvore3 = new Arvore<>();

        NoArvore<Integer> noRaiz = new NoArvore<>(1);
        arvore3.setRaiz(noRaiz);

        System.out.println();
        System.out.println("�rvore completa: " + arvore3);
        System.out.println("Altura da �rvore = esperado: 0 | retornado: " + arvore3.getAltura());
        System.out.println("1 = n�vel esperado: 0 | n�vel retornado: " + arvore3.getNivel(1));
        System.out.println("�rvore balanceada = esperado: true | retornado: " + arvore3.isBalanceada());

        Arvore<Integer> arvore4 = new Arvore<>();

        NoArvore<Integer> noRaiz1 = new NoArvore<>(1);
        arvore4.setRaiz(noRaiz1);
        NoArvore<Integer> nor1 = new NoArvore<>(2);
        noRaiz1.inserirFilho(nor1);
        NoArvore<Integer> nor2 = new NoArvore<>(3);
        nor1.inserirFilho(nor2);

        System.out.println();
        System.out.println("�rvore completa: " + arvore4);
        System.out.println("Altura da �rvore = esperado: 2 | retornado: " + arvore4.getAltura());
        System.out.println("1 = n�vel esperado: 0 | n�vel retornado: " + arvore4.getNivel(1));
        System.out.println("�rvore balanceada = esperado: true | retornado: " + arvore4.isBalanceada());
    }
}