package com.goit;

import com.goit.client.Client;
import com.goit.client.ClientDaoService;
import com.goit.client.ClientDaoServiceImpl;
import com.goit.planet.Planet;
import com.goit.planet.PlanetDaoService;
import com.goit.planet.PlanetDaoServiceImpl;
import com.goit.storage.HibernateUtil;

import java.util.List;


public class App {
    public static void main(String[] args) {

        HibernateUtil connect = HibernateUtil.getInstance();


        ClientDaoService clientService = new ClientDaoServiceImpl();


        Client clientNew = new Client();
        clientNew.setName("Zelimhan");
        System.out.println(clientService.create(clientNew));

        System.out.println(clientService.getById(3L));

        List<Client> all = clientService.getAll();
        all.forEach(client -> System.out.println("all = " + client));

        PlanetDaoService planetService = new PlanetDaoServiceImpl();

        System.out.println(planetService.getById("MRS"));

        List<Planet> allPlanets = planetService.getAll();
        allPlanets.forEach(planet -> System.out.println("all = " + planet));

        connect.close();

    }
}