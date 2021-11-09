package mx.uv;

import static spark.Spark.*;
import com.google.gson.*;

/**
 * Hello world!
 *
 */
public class App{
    private static Usuario usuario = new Usuario("1", "Luis@gmail.com", "qwerty");
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        /*
            Métodos utilizados para atender las llamadas del frontend
        */
        get("/", (req, res) -> usuario);
        post("/", (req, res) -> "mensaje post");

    }
}
