
import com.BookStore.config.SpringConfig;
import com.BookStore.dao.Impl.bookImpl;
import com.BookStore.dao.bookIntf;
import com.BookStore.mapper.bookmapper;
import com.BookStore.pojo.book;
import com.BookStore.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

import java.util.List;

public class Tfr {
    @Test
    public void jkl(){
        ApplicationContext app =new AnnotationConfigApplicationContext(SpringConfig.class);
        bookService bkk=app.getBean(bookService.class);
//      List<book> bkl=mapper.BookAll();
//      System.out.println(bkl);
        bkk.JJService();
    }
}
