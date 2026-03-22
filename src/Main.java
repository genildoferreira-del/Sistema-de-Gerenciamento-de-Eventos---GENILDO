import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciadorEventos gerenciador = new GerenciadorEventos();

        int opcao;

        do {
            System.out.println("\n1 Cadastrar");
            System.out.println("2 Listar");
            System.out.println("3 Buscar");
            System.out.println("4 Atualizar");
            System.out.println("5 Remover");
            System.out.println("0 Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Data: ");
                    String data = sc.nextLine();

                    System.out.print("Local: ");
                    String local = sc.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();

                    gerenciador.cadastrarEvento(new Evento(id, nome, data, local, descricao));
                    break;

                case 2:
                    gerenciador.listarEventos();
                    break;

                case 3:
                    System.out.print("ID: ");
                    int busca = sc.nextInt();
                    System.out.println(gerenciador.buscarPorId(busca));
                    break;

                case 4:
                    System.out.print("ID: ");
                    int idAt = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Data: ");
                    data = sc.nextLine();

                    System.out.print("Local: ");
                    local = sc.nextLine();

                    System.out.print("Descrição: ");
                    descricao = sc.nextLine();

                    gerenciador.atualizarEvento(idAt, nome, data, local, descricao);
                    break;

                case 5:
                    System.out.print("ID: ");
                    int idRem = sc.nextInt();
                    gerenciador.removerEvento(idRem);
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}