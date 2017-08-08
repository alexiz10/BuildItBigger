package com.example.Alexiz.myapplication.backend;

import com.example.Jokes;

public class MyBean {

    public String getJoke() {
        return Jokes.getJoke();
    }

    public String[] getAllJokes() {
        return Jokes.getJokes();
    }

}