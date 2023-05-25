import java.util.Scanner;

class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\tRelatório Auxiliar de Controle de Infecções");

    pessoa.coletaNome(sc);
    pessoa.coletaIdade(sc);

    erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pesssoa);

    validacao.validacaoDasProximasPerguntas(pessoas);

    validacao.calcularValidacaoFinal(erroTentativass);

    scanner.close();
  }
}