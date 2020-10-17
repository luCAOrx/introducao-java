package br.senac.rn.helloworld;

public class EstruturaSwitchCase {

    public static void main(String[] args) {

        Character letra = 'B';

        switch (letra) {
            case 'a': case 'e': case 'i': case  'o': case 'u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Não é vogal");
        }

    }

}
