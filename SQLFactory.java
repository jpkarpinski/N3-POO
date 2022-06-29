public class SQLFactory{
    public static void main(String[] args){
        Aluno aluno = new Aluno();
        
        if (Database.abrirID(aluno, 1)) {
            System.out.println("Nome: " + aluno.nome + ", Idade: " + aluno.idade + ", Município: " + aluno.cidade + ", Curso: "+ aluno.curso +", Periodo: " + aluno.periodo);
        }
    }
}