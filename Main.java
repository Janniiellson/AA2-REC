public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("PSUL", "Ceilandia", "DF");

        Telefone telefone1 = new Telefone("82594084", "fixo", "61");
        Telefone telefone2 = new Telefone("982594084", "Celular", "61");

        Aluno aluno1 = new Aluno("JANIELSON", "08055566632", "janielson@a.ucb.com", 8.5);
        aluno1.setEndereco(endereco1);
        aluno1.addTelefone(telefone1);

        Aluno aluno2 = new Aluno("JOANA", "03074677979", "joana@a.ucb.com", 7.0);
        aluno2.setEndereco(endereco1);
        aluno2.addTelefone(telefone2);

        Curso curso1 = new Curso("CC");
        Curso curso2 = new Curso("ADS");

        Professor professor1 = new Professor("Hially", "85963482681", "Hially@a.ucb.com", "Doutorado", 90000.0);
        professor1.setEndereco(endereco1);
        professor1.addTelefone(telefone1);

        Disciplina disciplina1 = new Disciplina("POO");

        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarAluno(aluno2);
        disciplina1.adicionarCurso(curso1);
        disciplina1.adicionarCurso(curso2);
        disciplina1.setProfessor(professor1);

        professor1.addCurso(curso1);

        disciplina1.mostrarDisciplina();

        System.out.println("\nInformações do Aluno 1:");
        aluno1.mostrarAluno();

        System.out.println("\nInformações do Aluno 2:");
        aluno2.mostrarAluno();

        System.out.println("\nInformações do Professor:");
        professor1.mostrarProfessor();
    }
}
