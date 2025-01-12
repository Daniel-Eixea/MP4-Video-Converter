package yttomp4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class YTtoMP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "0";
        String outputFolder = "Downloads";  //"Downloads" Carpeta por defecto dentro de la aplicacion
        
        while(!url.equals("")) {
            System.out.print("\n------------------------------\nEnlace del Video o Lista de reproduccion -- Convertir video/lista\nDejar vacio -- Salir\nQue quieres hacer?(Enter -- Realizar la accion): ");
            url = sc.nextLine();
            if(!url.equals("")) {
                System.out.println("Descargando con la máxima calidad posible...");
                downloadYouTubeContent(url, outputFolder);
            }
        }
    }

    public static void downloadYouTubeContent(String url, String outputFolder) {
        try {
            //Ruta a yt-dlp en la carpeta lib
            String command = String.format("\"lib/yt-dlp.exe\" -f \"bestvideo[ext=mp4]+bestaudio[ext=m4a]/best[ext=mp4]\" --merge-output-format mp4 --ffmpeg-location \"lib/ffmpeg-7.1-full_build/bin/ffmpeg.exe\" -o \"%s/%%(title)s.%%(ext)s\" %s", outputFolder, url);

            //Ejecutar el comando
            Process process = Runtime.getRuntime().exec(command);

            //Leer la salida del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            //Esperar a que el proceso termine
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Descarga completada.");
            } else {
                System.out.println("Error durante la descarga. Código de salida: " + exitCode);
            }
        } catch (Exception e) {
            System.err.println("Error ejecutando el comando: " + e.getMessage());
        }
    }
}
