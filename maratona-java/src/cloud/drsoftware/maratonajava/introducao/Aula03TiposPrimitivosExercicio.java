package cloud.drsoftware.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Kirito";
        String endereco = "Praça da Matriz";
        double salario = 5431.12;
        String dataRecebimentoSalario = "06/05/2025";
        String relatorio = "Eu "+nome+" morando no endereço "+endereco+" confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
