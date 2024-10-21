package pe.edu.cibertec.patitas_frontend_wc_a.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.cibertec.patitas_frontend_wc_a.config.AutenticacionFeingConfig;
import pe.edu.cibertec.patitas_frontend_wc_a.dto.LogoutRequestDTO;
import pe.edu.cibertec.patitas_frontend_wc_a.dto.LogoutResponseDTO;

@FeignClient(name = "autenticacion", url = "http://localhost:8081/autenticacion", configuration = AutenticacionFeingConfig.class)
public interface AutenticacionClient {

    @PostMapping("/logout")
    ResponseEntity<LogoutResponseDTO> logout(@RequestBody LogoutRequestDTO logoutRequestDTO);

}
