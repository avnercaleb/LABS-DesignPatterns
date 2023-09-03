package org.templateMethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class DocTemplate {

    public void doTemplate(String nome, Map<String, Object> props) throws IOException {

        String conteudo = gerarConteudo(props);
        byte[] bytes = conteudo.getBytes(conteudo);
        bytes = processar(bytes);

        FileOutputStream fileout = new FileOutputStream(nome);
        fileout.write(bytes);
        fileout.close();
    }

    protected byte[] processar(byte[] bytes) throws IOException{
        return bytes;
    }

    protected abstract String gerarConteudo(Map<String, Object> props);
}
