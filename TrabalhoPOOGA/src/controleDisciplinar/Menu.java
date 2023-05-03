package controleDisciplinar;

import java.util.Scanner;

public class Menu {
	
    private static Scanner scanner = new Scanner(System.in);
    private static Aluno aluno;
    private static Curso curso;

    public static void main(String[] args) {
    	
        aluno = new Aluno("Milena Rios Felten", 1); // Cria um aluno
        curso = new Curso("Ciências da Computação"); // Cria um curso

        int opcao = -1;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Listar todas as disciplinas do curso");
            System.out.println("2 - Listar disciplinas que o aluno cursou");
            System.out.println("3 - Listar disciplinas que o aluno falta cursar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            switch (opcao) {
                case 1:
                    listarDisciplinas();
                    break;
                case 2:
                    listarDisciplinasCursadas();
                    break;
                case 3:
                    listarDisciplinasFaltantes();
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void listarDisciplinas() {
        System.out.println("\n--- TODAS AS DISCIPLINAS DO CURSO ---\n");
        System.out.println("Curso: " + curso.getNomeCurso() + "\n");
        for (Disciplina disciplina : Curso.getDisciplinas()) {
            System.out.println("Código Disciplina: " + disciplina.getCodigoDisciplina() + " | " + 
            				   "Nome Disciplina: " + disciplina.getNome() + " | " +
            				   "Semestre: " + disciplina.getSemestre() + " | " +
            				   "Carga Horária: " + disciplina.getCargaHoraria());
        }
    }

    private static void listarDisciplinasCursadas() {
        System.out.println("\n--- DISCIPLINAS CURSADAS PELO ALUNO ---\n");
        System.out.println("Nome do Aluno: " + aluno.getNome() + " Semestre Cursando: " + aluno.getNumSemestres() +"\n");
        for (Disciplina disciplinaCursadas : Curso.getDisciplinasCursadas()) {
            System.out.println("Código Disciplina: " + disciplinaCursadas.getCodigoDisciplina() + " | " + 
 				   "Nome Disciplina: " + disciplinaCursadas.getNome() + " | " +
 				   "Semestre: " + disciplinaCursadas.getSemestre() + " | " +
 				   "Carga Horária: " + disciplinaCursadas.getCargaHoraria());
        }
    }

    private static void listarDisciplinasFaltantes() {
        System.out.println("\n--- DISCIPLINAS QUE O ALUNO AINDA NÃO CURSOU ---\n");
        System.out.println("Nome do Aluno: " + aluno.getNome() + " Semestre Cursando: " + aluno.getNumSemestres() +"\n");
        for (Disciplina disciplinaFaltantes : Curso.getDisciplinasFaltantes()) {
        	System.out.println("Código Disciplina: " + disciplinaFaltantes.getCodigoDisciplina() + " | " + 
  				   "Nome Disciplina: " + disciplinaFaltantes.getNome() + " | " +
  				   "Semestre: " + disciplinaFaltantes.getSemestre() + " | " +
  				   "Carga Horária: " + disciplinaFaltantes.getCargaHoraria());
        }
    }
}






