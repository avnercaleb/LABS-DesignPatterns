package org.templateMethod;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        DocTemplate template = new GerarXMLZipado();

        Map<String, Object> map = new HashMap<>();
        String arq = "teste";
        map.put("chave", "valor");

        try {
            template.doTemplate(arq, map);
        }catch (IOException e){
            e.getMessage();
        }
    }
}
