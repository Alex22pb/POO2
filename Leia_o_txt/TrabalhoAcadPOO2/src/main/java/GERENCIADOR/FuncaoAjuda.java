/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GERENCIADOR;

import DOMAIN.Endereco;
import DOMAIN.Exercicios;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JComboBox;
import org.json.JSONObject;

/**
 *
 * @author User
 */
public class FuncaoAjuda {
       
//    public static Endereco ConsultarCEP(String cep) throws MalformedURLException, IOException{
//        Endereco ender = null;
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
//            ender = new Endereco();
//            ender.setEndereco(jsonObject.getString("logradouro"));
//            ender.setBairro(jsonObject.getString("bairro"));
//            ender.setCidade(jsonObject.getString("localidade"));
//            
//        }else{
//            System.out.println("CEP não encontrado");
//        }
//        
//        connection.disconnect();
//        return ender;
//    }
//    
    
    public static void carregarCombo(JComboBox combo, List lista){
        combo.setModel(new DefaultComboBoxModel(lista.toArray()));
    }
    
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

    public static byte[] IconToBytes(Icon icon) {
        if (icon == null) {
            return null;
        }
        BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();

        byte[] bFile = null;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
            try {
                ImageIO.write(img, "png", ios);
                // Set a flag to indicate that the write was successful
            } finally {
                ios.close();
            }
            bFile = baos.toByteArray();
        } catch (IOException ex) {
            bFile = null;
            System.out.println(ex);
        } finally {
            return bFile;
        }

    }
    
    public static Exercicios buscarExercicio(String nome, List<Exercicios> lista){
        for(Exercicios exerc : lista){
            if(exerc.getNomeExercicio().equals(nome)){
                return exerc;
            }
        }
        return null;
    }
}
