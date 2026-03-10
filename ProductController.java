package com.exemplo.produtoapi.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.exemplo.produtoapi.Models.Movie;

@RestController
@RequestMapping("/api")
public class MovieController {

    private List<Movie> movies = new ArrayList<>();

    @PostMapping("/filmes")
    public Movie createMovie(@RequestBody Movie movie) {
        movies.add(movie);
        return movie;
    }

    @GetMapping("/filmes")
    public List<Movie> getMovies() {
        return movies;
    }

}