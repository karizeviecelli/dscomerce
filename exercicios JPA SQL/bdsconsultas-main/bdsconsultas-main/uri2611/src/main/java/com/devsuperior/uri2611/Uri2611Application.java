package com.devsuperior.uri2611;

import com.devsuperior.uri2611.dto.MoviesMinDTO;
import com.devsuperior.uri2611.projections.MovieMinProjection;
import com.devsuperior.uri2611.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Uri2611Application implements CommandLineRunner {

    @Autowired
    private MovieRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2611Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        List<MovieMinProjection> list = repository.search1("Action");
        List<MoviesMinDTO> result1 = list.stream().map(x -> new MoviesMinDTO(x)).collect(Collectors.toList());

        for (MoviesMinDTO obj : result1) {
            System.out.println(obj);
        }

        List<MoviesMinDTO> list2 = repository.search2("Action");

        System.out.println("Resultado JPQL");
        for (MoviesMinDTO c : list2) {
            System.out.println(c);
        }
    }
}
