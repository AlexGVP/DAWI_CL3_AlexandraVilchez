package cibertec.edu.pe.DAWI_CL3_AlexandraVilchez.controller.seguridad;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seguridad")
public class CerrarSesionController {

    @GetMapping("/cerrarSesion")
    public String cerrarSesion(HttpServletRequest request) {

        SecurityContextHolder.clearContext();
        request.getSession().invalidate();

        return "redirect:/login";
    }
}