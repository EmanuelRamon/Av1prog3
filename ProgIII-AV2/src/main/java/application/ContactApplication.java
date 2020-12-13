package application;
import domain.event.Contact;
import domain.event.ContactService;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


@ApplicationScoped
public class ContactApplication {

    @Inject
    private ContactService contactService;

    public void save(Contact contact) {
        this.contactService.save(contact);
    }

    public void update(Contact contact) {
        this.contactService.update(contact);
    }

    public List<Contact> listAll() {
        return this.contactService.listAll();
    }

    public Contact getById(String id) {
        return this.contactService.getById(id);

    }

    public  List<Contact> findByDate(String id) {
        return this.contactService.findByDate(id);

    }

    public void remove(Contact contact) {
        this.contactService.remove(contact);
    }

}
