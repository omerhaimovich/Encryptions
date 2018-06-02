package root;

import api.APIProvider;

public class Main {

    public static void main(String[] args) {
        APIProvider provider = new APIProvider();
        provider.start();
    }

}
