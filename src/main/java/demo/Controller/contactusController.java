package demo.Controller;

import demo.model.contactus;
import demo.Service.contactusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/contactus")
public class contactusController {
    @Autowired
    contactusService  contactusService;

    @GetMapping("")
    public List< contactus> list() {
        return  contactusService.listAllcontactus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<contactus> get(@PathVariable Integer id) {
        try {
            contactus contactus = contactusService.getcontactus(id);
            return new ResponseEntity<contactus>(contactus, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<contactus>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody contactus contactus) {
        contactusService.submitcontactus(contactus);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody contactus contactus, @PathVariable Integer id) {
        try {
            contactus existcontactus = contactusService.getcontactus(id);
            contactus.getId();
            contactusService.submitcontactus(contactus);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
