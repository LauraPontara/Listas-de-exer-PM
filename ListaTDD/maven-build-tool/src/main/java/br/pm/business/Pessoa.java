package br.pm.business;

public class Pessoa {
    private String nome;
    private String cpf;
    private Sexo sexo;
    private int idade;

    public Pessoa(){
        nome = "Sem nome";
        cpf = "999.999.999-99";
        sexo = Sexo.FEMININO;
        idade = 1;
    }

    public void setNome(String nome){
        if(nome != null && !nome.trim().isEmpty() && nome.matches("^[\\p{L} ]*$")){
            this.nome = nome;
        }
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(String cpf){
        if(cpf != null && cpf.length() <=14){
            this.cpf = cpf;
        }
    }

    public String getCpf(){
        return cpf;
    }

    public void setSexo(Sexo sexo){
        if(sexo != null){
            this.sexo = sexo;
        }
    }

    public Sexo getSexo(){
        return sexo;
    }

    public void setIdade(int idade){
        if(idade > 0){
            this.idade = idade;
        }
    }

    public int getIdade(){
        return idade;
    }

    public boolean maiorIdade(){
        return idade >= 18;
    }
}
