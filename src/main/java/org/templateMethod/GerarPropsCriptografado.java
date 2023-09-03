package org.templateMethod;

import java.io.IOException;
import java.util.Map;

public class GerarPropsCriptografado extends DocTemplate{

    private int delay;

    public GerarPropsCriptografado(int delay) {
        this.delay = delay;
    }

    @Override
    protected String gerarConteudo(Map<String, Object> props) {

        StringBuilder propFileBuilder = new StringBuilder();
        for(String prop: props.keySet()){
            propFileBuilder.append(prop+"="+props.get(prop)+"\n");
        }
        return propFileBuilder.toString();
    }

    @Override
    protected byte[] processar(byte[] bytes) throws IOException {

        byte[] newBytes = new byte[bytes.length];

        for(int i =0; i <bytes.length; i++){
            newBytes[i] = (byte) ((bytes[i] + delay) % Byte.MAX_VALUE);
        }
        return newBytes;
    }
}
