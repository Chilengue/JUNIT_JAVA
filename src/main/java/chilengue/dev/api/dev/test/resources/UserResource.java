package chilengue.dev.api.dev.test.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chilengue.dev.api.dev.test.model.User;
import chilengue.dev.api.dev.test.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserResource {


    @Autowired
    private UserService service;


    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(service.findById(id));
    }
    
}
