/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.acme;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author Rasmu
 */
public class Tester {

    String folderPath = "C:\\Users\\Rasmu\\Desktop\\";
    Gson gson = new Gson();

    String jsonMsg = "{\n"
            + "    \"databaseID\": \"SADKFJHBSD238SDFKJLB234\",\n"
            + "    \"log\": [\n"
            + "        {\n"
            + "            \"moduleName\": \"ReceiverAPIModule\",\n"
            + "            \"timeStamp\": \"Fri Jan 31 10:45:05 CET 2020\"\n"
            + "        },\n"
            + "        {\n"
            + "            \"moduleName\": \"entry\",\n"
            + "            \"timeStamp\": \"Fri Jan 31 10:45:06 CET 2020\"\n"
            + "        },\n"
            + "        {\n"
            + "            \"moduleName\": \"routing\",\n"
            + "            \"timeStamp\": \"Fri Jan 31 10:45:06 CET 2020\"\n"
            + "        },\n"
            + "        {\n"
            + "            \"moduleName\": \"cvr-enricher\",\n"
            + "            \"timeStamp\": \"Fri Jan 31 10:45:06 CET 2020\"\n"
            + "        },\n"
            + "        {\n"
            + "            \"moduleName\": \"cvr-enricher\",\n"
            + "            \"timeStamp\": \"Fri Jan 31 10:45:08 CET 2020\"\n"
            + "        },\n"
            + "        {\n"
            + "            \"moduleName\": \"address-enrichment\",\n"
            + "            \"timeStamp\": \"Fri Jan 31 10:45:09 CET 2020\"\n"
            + "        }\n"
            + "    ],\n"
            + "    \"producerReference\": \"address\",\n"
            + "    \"conditions\": [\n"
            + "        {\n"
            + "            \"field\": \"number\",\n"
            + "            \"action\": \"greater than\",\n"
            + "            \"value\": \"111\",\n"
            + "            \"topic\": \"exit\",\n"
            + "            \"priority\": 1\n"
            + "        }\n"
            + "    ],\n"
            + "    \"cvrInfo\": {\n"
            + "        \"name\": \"CONVERGENS A/S\",\n"
            + "        \"address\": \"Hvidsværmervej 161\",\n"
            + "        \"zipcode\": \"2610\",\n"
            + "        \"city\": \"Rødovre\",\n"
            + "        \"phone\": \"44522200\"\n"
            + "    },\n"
            + "    \"addressInfo\": {\n"
            + "        \"cord\": \"12.23423, 56.744345\"\n"
            + "    }\n"
            + "}";

    public void tester() throws IOException {

        Writer out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(folderPath + "test.json"), "UTF-8"));
            out.write(jsonMsg);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        Tester test = new Tester();
        test.tester();

    }

}
