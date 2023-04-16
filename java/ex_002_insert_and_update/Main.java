package ex_002_insert_and_update;

import ex_002_insert_and_update.entity.Author;
import org.hibernate.Session;
import org.jboss.logging.Logger;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AuthorHelper ah = new AuthorHelper();

        ah.flushRandomObj();
    }
}
