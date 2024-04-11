package vererbung;

import java.util.ArrayList;
import java.util.List;

public class DependencyInversionTest {

    public static void main(String[] args) {

    }
}

interface Client {
    void request(Server server);

    void request(List<Server> server);
}

interface Server {
    void respose(Client client);
}

class HttpClient implements Client {

    @Override
    public void request(Server server) {
    }

    @Override
    public void request(List<Server> server) {

    }
}

class HttpServer implements Server {

    @Override
    public void respose(Client client) {

    }
}