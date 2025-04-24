/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GERENCIADOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author User
 */
public class FuncaoAjuda {
    
//    Eu não consigo usar essa função, não sei o motivo, quando vou instalar a biblioteca do JSon, o netbeans não consegue achar ela
    
    
//    public static endereco ConsultarCEP(String cep) throws MalformedURLException, IOException{
//        endereco ender = null;
//        
//        URL link = new URL ("https://viacep.com.br/ws/" + cep + "/json/");
//        
//        HttpURLConnection connection = (HttpURLConnection) link.openConnection();
//        connection.setRequestMethod("GET");
//        
//        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//        StringBuilder response =  new StringBuilder();
//        
//        String line;
//        while((line = reader.readLine()) != null){
//            response.append(line);
//        }
//        
//        JSONObject jsonObject = new JSONObject(response.toString());
//        
//        if(!jsonObject.has("erro")){
//            
//            ender = new endereco();
//            ender.setLogradouro(jsonObject.getString("logradouro"));
//            ender.setbairro(jsonObject.getString("bairro"));
//            ender.setcidade(jsonObject.getString("localidade"));
//            ender.setuf(jsonObject.getString("uf"));
//            
//        }else{
//            System.out.println("CEP não encontrado");
//        }
//        
//        connection.disconnect();
//        return ender;
//    }
    
    public static boolean isCPF(String parcpf) {
        if (parcpf == null) {
            return false;
        }

        // Removendo pontos e traço
        String cpf = parcpf.replace(".", "").replace("-", "");

        // Verificando se o CPF tem 11 dígitos e se não é uma sequência repetida
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        try {
            int sm = 0, num, peso = 10;

            // Cálculo do primeiro dígito verificador
            for (int i = 0; i < 9; i++) {
                num = cpf.charAt(i) - '0'; // Convertendo char para int
                sm += num * peso;
                peso--;
            }

            int r = 11 - (sm % 11);
            char dig10 = (r == 10 || r == 11) ? '0' : (char) (r + '0');

            // Cálculo do segundo dígito verificador
            sm = 0;
            peso = 11;
            for (int i = 0; i < 10; i++) {
                num = cpf.charAt(i) - '0';
                sm += num * peso;
                peso--;
            }

            r = 11 - (sm % 11);
            char dig11 = (r == 10 || r == 11) ? '0' : (char) (r + '0');

            // Comparação com os dígitos informados no CPF
            return (dig10 == cpf.charAt(9) && dig11 == cpf.charAt(10));

        } catch (Exception e) {
            return false;
        }
    }

}
