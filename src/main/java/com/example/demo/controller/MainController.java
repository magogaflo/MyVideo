package com.example.demo.controller;

import com.example.demo.model.Pelicula;
import com.example.demo.service.InterfaceService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author paty
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String mostrarDetalle(Model model) {
        String tituloPelicula = "Logan";
        String descripcionPelicula = "Some quick example text to build on the card title and make up the bulk of the card's content Some quick example text to build on the card title and make up the bulk of the card's content se cambio";
        String tituloOriginal = " La pelicula de logan";
        int duracionPelicula = 104;

        //String imagenPelicula = "";
        model.addAttribute("nombre", tituloPelicula);
        model.addAttribute("descripcion", descripcionPelicula);
        model.addAttribute("titulo", tituloOriginal);
        model.addAttribute("duracion", duracionPelicula);

        return "index";
    }

    /*@RequestMapping("/lista")
    public String mostrarLista(Model model) {
        List<String> peliculas = new ArrayList<>();
        peliculas.add("Los Vengadores");
        peliculas.add("A dos metros del cielo");
        peliculas.add("Los Increibles 2");
        model.addAttribute("peliculas", peliculas);
        return "index";
    }*/
    @GetMapping("/tabla")
    public String mostrarPrincipal(Model model) {
        List<Pelicula> peliculas = getLista();
        model.addAttribute("peliculas", peliculas);
        return "tabla";
    }
    // Metodo para generar una lista de Objetos de Modelo

    private List<Pelicula> getLista() {
        List<Pelicula> lista = null;

        try {
            lista = new ArrayList<>();
            Pelicula pelicula1 = new Pelicula();
            pelicula1.setNombre("Xmen");
            pelicula1.setDescripcion(" pelicula de aventura");
            pelicula1.setTituloOriginal("Los X-men");
            pelicula1.setDuracion(104);

            Pelicula pelicula2 = new Pelicula();
            pelicula2.setNombre("It");
            pelicula2.setDescripcion(" pelicula de terror");
            pelicula2.setTituloOriginal("El payaso asesino");
            pelicula2.setDuracion(108);

            lista.add(pelicula1);
            lista.add(pelicula2);

            return lista;
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
            return null;
        }
    }
    
    @Autowired
        private InterfaceService servicio;

   @GetMapping("/ordenar")
        public String Index(Model model) {

        model.addAttribute("objeto", servicio.operacion());
        model.addAttribute("objeto", servicio.crear());
        model.addAttribute("objeto", servicio.modificar());
        model.addAttribute("objeto", servicio.eliminar());
        return "index";

    }
}

