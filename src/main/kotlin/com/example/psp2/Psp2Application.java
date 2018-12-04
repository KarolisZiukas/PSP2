package com.example.psp2;


import com.example.psp2.domain.factory.AbstractFactory.Store.LatviaPlaceStore;
import com.example.psp2.domain.factory.AbstractFactory.Store.LithuaniaPlaceStore;
import com.example.psp2.domain.factory.AbstractFactory.Store.Store;
import com.example.psp2.domain.factory.AbstractFactory.types.BuildingType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Psp2Application {


    public static void main(String[] args) {
        ConfigurableApplicationContext cx =	SpringApplication.run(Psp2Application.class, args);

        Store ltStore = new LithuaniaPlaceStore();
        Store lvStore = new LatviaPlaceStore();

        BuildingType ltOffice = ltStore.startProject("Warehouse");
        System.out.println("You just build " + ltOffice.printInfo() + "\n");

        ltOffice = lvStore.startProject("Office");
        System.out.println("You just build " + ltOffice.printInfo() + "\n");


    }
}
