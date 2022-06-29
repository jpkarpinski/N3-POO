public class Aluno extends SQLClass{
    @Key
    int id;
    String nome;
    int idade;
    String cidade;
    String curso;
    String periodo;

    Aluno(){
        this.setTableName("ALUNOS");
    }
}