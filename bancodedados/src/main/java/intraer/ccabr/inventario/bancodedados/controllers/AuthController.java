package intraer.ccabr.inventario.bancodedados.controllers;

import intraer.ccabr.inventario.bancodedados.domain.user.AuthenticationDTO;
import intraer.ccabr.inventario.bancodedados.domain.user.LoginResponseDTO;
import intraer.ccabr.inventario.bancodedados.domain.user.RegisterDTO;
import intraer.ccabr.inventario.bancodedados.domain.user.User;
import intraer.ccabr.inventario.bancodedados.repositories.UserRepository;
import intraer.ccabr.inventario.bancodedados.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {
//    @Autowired
//    private AuthenticationManager authenticationManager;
//    @Autowired
//    private UserRepository repository;
//    @Autowired
//    private TokenService tokenService;
//
//    @PostMapping("/login")
//    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data){
//        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
//        var auth = this.authenticationManager.authenticate(usernamePassword);
//
//        var token = tokenService.generateToken((User) auth.getPrincipal());
//
//        return ResponseEntity.ok(new LoginResponseDTO(token));
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity register(@RequestBody @Valid RegisterDTO data){
//        if(this.repository.findByLogin(data.login()) != null) return ResponseEntity.badRequest().build();
//
//        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
//        User newUser = new User(data.login(), encryptedPassword, data.role());
//
//        this.repository.save(newUser);
//
//        return ResponseEntity.ok().build();
//    }
}
