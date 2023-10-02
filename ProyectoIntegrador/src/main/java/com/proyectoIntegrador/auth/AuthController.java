package com.proyectoIntegrador.auth;

import java.text.ParseException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoIntegrador.entity.Enlace;
import com.proyectoIntegrador.entity.Prestamo;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

	private final AuthService authService;
	
	@PostMapping(value = "login")
	public ResponseEntity<?> login(@RequestBody LoginRequest request) {
		 try {
		        AuthResponse authResponse = authService.login(request);
		        return ResponseEntity.ok(authResponse);
		    } catch (Exception e) {
		        e.printStackTrace(); // Log the exception (consider using a proper logging framework).
		        String errorResponse = "Usuario y/o Contraseña invalida";
		        return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body(errorResponse);
		    }
	}

	@PostMapping(value = "register")
	public ResponseEntity<?> register(@RequestBody RegisterRequest request) throws ParseException {
		return ResponseEntity.ok(authService.register(request));
	}
	
	@GetMapping(value = "menus")
	@ResponseBody
	public ResponseEntity<List<Enlace>> listar(@RequestParam int cod){
		List<Enlace> lista = authService.enlacesDelUsuario(cod);
		return ResponseEntity.ok(lista);
	}
}
