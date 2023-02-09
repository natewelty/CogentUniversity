package com.assessment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.entity.Author;
import com.assessment.repository.AuthorRepository;
import com.assessment.util.JwtUtil;
import com.assessment.entity.AuthRequest;

@RestController
@RequestMapping()
public class AuthorController {
	@Autowired
	AuthorRepository repository;
	@Autowired
    private JwtUtil jwtUtil;
	@Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Authors API !!";
    }

    @PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
        return jwtUtil.generateToken(authRequest.getUsername());
    }
	
	@PostMapping("/authors")
	public Author saveAuthor(@RequestBody Author product) {
		return repository.save(product);
	}
	@GetMapping("/authors")
	public List<Author> fetchAuthorList(){
		return repository.findAll();
	}
	@PutMapping("/authors")
	public Author edit(@RequestBody Author product) {
		return repository.save(product);
	}
	@DeleteMapping("/authors")
	public String delete(@RequestParam(value = "id") Integer id) {
		Optional<Author> i = repository.findById(id);
		repository.delete(i.get());
		return "Book id " +id + " deleted successfully";
	}
	@GetMapping("/authors/{id}")
	public Author get(@PathVariable("id") Integer id) {
		Optional<Author> i = repository.findById(id);
		return i.get();
	}
}
