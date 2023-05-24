import java.util.Scanner;

class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\tRelatório Auxiliar de Controle de Infecções");

    Pessoa pessoa = coletarDadosPessoa(scanner);

    erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pesssoa);

    validacao.validacaoDasProximasPerguntas(pessoas);

    validacao.calcularValidacaoFinal(erroTentativass);

    scanner.close();
  }
}