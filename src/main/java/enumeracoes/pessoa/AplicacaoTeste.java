package enumeracoes.pessoa;

public class AplicacaoTeste {

    public static void main(String[] args) {

        String tipoPessoaInformada = "";

        // .name() -> exatamente o "PESSOA_FISICA"
        if(tipoPessoaInformada == TipoPessoa.PESSOA_FISICA.name()){
        }

        TipoPessoa[] tipoPessoas = TipoPessoa.values();
        for (TipoPessoa tipo : tipoPessoas){
            System.out.println("->" + tipo);
        }

        //Converter uma string num valor de enum
        String valorInformado = "PESSOA_FISICA";

        try {
            TipoPessoa tipoPessoaEnum = TipoPessoa.valueOf(valorInformado);
            System.out.println("Pessoa escolhida " + tipoPessoaEnum.name());
        }catch(IllegalArgumentException e){
            System.out.println("O tipo de pessoa informado não é válido!");
        }

    }
}
