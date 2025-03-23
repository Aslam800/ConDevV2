import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class Convertisseur{
    public static void main(String[] args) {

        // On commence par récupérer les deux devises que l'utilisateur veut échanger

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est la devise que vous souhaitez échanger ? (Donnez le code ISO en 3 caractères) ");
        String D1  = scanner.nextLine();

        System.out.println("Vers quelle devise souhaitez vous l'échanger ? (Donnez le code ISO en 3 caractères) ");
        String D2  = scanner.nextLine();

        System.out.println("Hello " + D1);




        scanner.close();




    
} }