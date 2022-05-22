package demo.Service;

import demo.model.contactus;
import demo.Repository.contactusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class contactusService {
    private final contactusRepository contactusRepository;

    public contactusService(contactusRepository contactusRepository) {
        this.contactusRepository = contactusRepository;
    }

    public List<contactus> listAllcontactus() {
        return contactusRepository.findAll();
    }

    public void submitcontactus(contactus contactus) {
        contactusRepository.save(contactus);
    }

    public contactus getcontactus(Integer id) {
        return contactusRepository.findById(id).get();
    }

    public void deletecontactus(Integer id) {
        contactusRepository.deleteById(id);
    }

}

