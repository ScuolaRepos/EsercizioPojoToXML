package com.example;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception 
    {
        Studenti studenti = new Studenti();
        Studenti c2;
        Studenti c3;

        System.out.println("------------");
        Studente s1 = new Studente(0, "ragusa", "mirko", "2004-2-23", 70);
        Studente s2 = new Studente(1, "ferretti", "ales", "2004-3-16", 67);
        Studente s3 = new Studente(2, "duka", "kapa", "2004-7-30", 80);
        Studente s4 = new Studente(3, "ottria", "matt", "2004-11-4", 90);

        JacksonXmlModule xmlModule = new JacksonXmlModule();
        xmlModule.setDefaultUseWrapper(false);
        ObjectMapper objectMapper = new XmlMapper(xmlModule);

        studenti.addStudente(s1);
        studenti.addStudente(s2);
        studenti.addStudente(s3);
        studenti.addStudente(s4);
        
        // Serializzazione        
        objectMapper.writeValue(new File("test.xml"), studenti);
        String myXml = objectMapper.writeValueAsString(studenti);
        System.out.println("Oggetto serializzato:" + myXml);

        // Deserializzazione        
        c2 = objectMapper.readValue(myXml, Studenti.class);
        c3 = objectMapper.readValue(new File("test.xml"), Studenti.class);
        for(int i = 0; i < 4; i++) {
            System.out.println("Oggetto deserializzato da stringa:" + c2.getStudente(i).getNome());
            System.out.println("Oggetto deserializzato da file: " + c3.getStudente(i).getNome());
        }
    }
}
