import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class validacaoDeSenha{

    public static int verificarOpcao(Scanner teclado) {
        int opcao;
        System.out.println("Digite 0 para cadastrar novo usuário, ou 1 para fazer o login");
        opcao = teclado.nextInt();
        teclado.nextLine(); // Consome a nova linha deixada pelo nextInt()
        return opcao;
    }

    public static String cadastrarUsuario(Scanner teclado) {
        System.out.println("Digite o nome do usuário:");
        return teclado.nextLine();
    }

    public static String cadastrarSenha(Scanner teclado) {
        String senha;
        do {
            System.out.println("Digite sua senha (deve ter entre 4 e 8 caracteres):");
            senha = teclado.nextLine();
            if (senha.length() < 4 || senha.length() > 8) {
                System.out.println("Senha inválida. A senha deve ter entre 4 e 8 caracteres.");
            }
        } while (senha.length() < 4 || senha.length() > 8);
        return senha;
    }
    

    public static String verificarSenha(Scanner teclado, String senha) {
        String senhaVerificada;
        do {
            System.out.println("Confirme sua senha:");
            senhaVerificada = teclado.nextLine();
            if (!senhaVerificada.equals(senha)) {
                System.out.println("As senhas não coincidem. Tente novamente.");
            }
        } while (!senhaVerificada.equals(senha));
        return senhaVerificada;
    }

    public static String verificarUsuario(Scanner teclado) {
        System.out.println("Digite o nome do usuário:");
        return teclado.nextLine();
    }

    public static String autenticarSenha(Scanner teclado) {
        System.out.println("Digite sua senha:");
        return teclado.nextLine();
    }

    public static void verificarArquivo(String usuario, String senha) {
        // Aqui você pode adicionar lógica para autenticar o usuário e a senha
        // com algum arquivo ou base de dados. Neste exemplo, estou apenas imprimindo.
        System.out.printf("Usuário %s autenticado com a senha %s.%n", usuario, senha);
    }

    public static void salvarArquivo(String senha, String usuario) {
        try (FileWriter writer = new FileWriter("usuarios.txt", true)) {
            writer.write("Usuário: " + usuario + " - Senha: " + senha + "\n");
            System.out.println("Usuário e senha salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o usuário e senha.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String senha;
        String usuario;

        int opcao = verificarOpcao(teclado);
        switch (opcao) {
            case 0:
                usuario = cadastrarUsuario(teclado);
                senha = cadastrarSenha(teclado);
                String senhaVerificada = verificarSenha(teclado, senha);
                salvarArquivo(senhaVerificada, usuario);
                System.out.printf("Usuário %s cadastrado com sucesso!%n", usuario);
                break;
            case 1:
                usuario = verificarUsuario(teclado);
                senha = autenticarSenha(teclado);
                verificarArquivo(usuario, senha);
                System.out.printf("Usuário %s logado com sucesso!%n", usuario);
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
                break;
        }
        teclado.close();
    }
}



