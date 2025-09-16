package Aula06.atividades.src;
public class edr2 {
    public static void main(String[] args) {
        int x = 1;
        String resultado;

        switch (x) {
            case 0:
                resultado = "X é 0";
                break;
            case 1:
                resultado = "X é 1";
                break;
            default:
                resultado = "X tem um valor diferente de 0 e 1";
        }

        System.out.println(resultado);
    }
}